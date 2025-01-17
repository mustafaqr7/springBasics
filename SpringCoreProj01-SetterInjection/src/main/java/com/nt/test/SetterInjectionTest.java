package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

    public static void main(String[] args) {
        
        // Create the Spring container by reading the beans configuration from the classpath
        ClassPathXmlApplicationContext context = 
            new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
        
        // Get the target Spring bean (WishMessageGenerator) from the container
        WishMessageGenerator generator = (WishMessageGenerator) context.getBean("wmg");
        
        // Invoke the generateMessage() method on the bean
        String msg = generator.generateMessage("raja");
        System.out.println("Wish Message is: " + msg);
        
        // Close the context (important for resource management)
        context.close();
    }
}

//==============================NEW CODE===========================

//Key Changes:
//ClassPathXmlApplicationContext: 
//	This is the modern way to load your Spring beans from an XML file. 
//	It automatically loads the beans from the classpath.
//
//Correct File Path: Ensure that your applicationContext.xml file is 
//in the src/main/resources/com/nt/cfgs/ directory. 
//This ensures it is correctly picked up by the Spring context.
//
//Context Close: The context.close() at the end is used to ensure that 
//resources are properly released when the Spring container is 
//no longer needed.



// ==============================CLASS CODE ===========================
//package com.nt.test;
//
//import org.springframework.core.io.FileSystemResource;
//
//import com.nt.beans.WishMessageGenerator;
//
//public class SetterInjectionTest {
//
//	public static void main(String[] args) {
//		
//		// Hold the name and location of spring bean cfg file in Resource object
//		FileSystemResource res = new FileSystemResource("src/main/java/com/nt/cfgs/applicationContext.xml");
//		
//		// Create BeanFactory spring container(IOC Container)
//		XmlBeanFactory factory = new XmlBeanFactory(res);
//		
//		// get Target spring bean class obj injected with Dependent spring bean class obj
//		Object object = factory.getBean("wmg");
//		
//		//type casting
//		WishMessageGenerator generator = (WishMessageGenerator)object;
//		
//		//invoke the b.method
//		String msg = generator.generateMessage("raja");
//		System.out.println("Wish Message is ::" +msg);
//		
//	} //main
//}// clas