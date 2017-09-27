package com.thehit.domain;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAbstractAppContext {
	private static AbstractApplicationContext abstractContext;
	 public static void main( String[] args )
	    {
	    	abstractContext=new ClassPathXmlApplicationContext("configuration.xml");  
	    	Stage stageInitDestroyExample=(Stage)abstractContext.getBean("theStageInitDestroyExample");
	    	//you need the line below or else it WILL NOT WORK!!!
	    	abstractContext.registerShutdownHook();	    
	    }

}
