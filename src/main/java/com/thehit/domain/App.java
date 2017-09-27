package com.thehit.domain;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.thehit.domain.*;
import com.thehit.interfaces.*;

public class App {

	private static ApplicationContext context;	
	public static void main (String args[]){
		
		context=new ClassPathXmlApplicationContext
	                ("configuration.xml"); 
			
		/**Simple bean blank constructor **/
		Songwriter simpleBeanExample = (SongWriterImpl)context.
	              getBean("ourFirstBean"); 
		
		//getting mary bean and printing properties
		 SongWriterImpl songwriter=(SongWriterImpl)context.getBean("mary");
		 System.out.println("The songwriters firstname is: "+ songwriter.getFirstname() + ": The songwriters lastname is: "+ songwriter.getLastname() +
		        " The songwriters age is: " + songwriter.getAge() + " The songwriters song name is: " + songwriter.getSong().getName()+" The songwriters song lyrics are: "+
		        songwriter.getSong().getLyrics());
	                  
		 //DI using setters for a Song instance
		 Song setterDISong =(Song)context.getBean("setterBeanSong");
		 System.out.println("Song name is: "+ setterDISong.getName());
		 System.out.println("Song lyrics are: "+setterDISong.getLyrics()); 
		 
		 //Using the above Song instance as setter property for songWriterImpl instance
		 SongWriterImpl setterDISongwriter =(SongWriterImpl)context.getBean("setterSongwriter");
		 System.out.println("Songwriter firstname is: "+ setterDISongwriter.getFirstname());
		 System.out.println("Songwriter second name is: "+setterDISongwriter.getLastname());
		 System.out.println("Songwriter age is: "+setterDISongwriter.getAge());
		 System.out.println("Songwriter song details are: Song name: "+setterDISongwriter.getSong().getName()+
		         		" Song lyrics are: "+setterDISongwriter.getSong().getLyrics());   
		         		
		 //testing factory method creating currency correctly
		 Currency currency=(Currency)context.getBean("currency");
		 System.out.println("Currency symbol: " + currency.getSymbol());
		         	    	
		 //Singleton Example: Even when we create 2 bean instances of the object Stage the same instance is returned.
		 Stage stage = (Stage)context.getBean("theStage");
		 System.out.println("Stage instance value: " + stage.toString());
		 Stage stage1 = (Stage)context.getBean("theStage1");
		 System.out.println("Stage instance value: " + stage1.toString());
		 
		 /**
		 * Singleton Example
		 * Even when we create 2 bean instances of the object Stage the same instance is returned.
		 **/
		  Ticket ticketSingleton=(Ticket)context.getBean("ticket");
		  System.out.println("Instance:"+ ticketSingleton.toString());
		  Ticket ticketSingleton1=(Ticket)context.getBean("ticket");
		  System.out.println("Instance:"+ ticketSingleton1.toString());
		  
		 /**
		 * Prototype Example
		 * Second bean shown to be at different memory address therefore not the same instance returned.
		 **/
		  Ticket ticketPrototype=(Ticket)context.getBean("ticketPrototype");
		  System.out.println("Instance:"+ ticketPrototype.toString());
		  Ticket ticketPrototypeAnother=(Ticket)context.getBean("ticketPrototype");
		  System.out.println("Instance:"+ ticketPrototypeAnother.toString());
		  
		 /**
		 * Collections Example
		 **/
		  CollectionsExample javaCollectionExample = (CollectionsExample)context.getBean("javaCollectionExample");
		  javaCollectionExample.getInstrumentList();
		  javaCollectionExample.getInstrumentSet();
		  javaCollectionExample.getInstrumentMap();
		  javaCollectionExample.getInstrumentProp(); 
	}        		
	                                 
}
