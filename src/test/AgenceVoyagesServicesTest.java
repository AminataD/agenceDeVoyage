package test;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Domaine.Voyage;
import service.AgenceVoyagesServices;

public class AgenceVoyagesServicesTest 
{
	
	private AgenceVoyagesServices agence;
	private Voyage voyage;
	
	@BeforeEach
	public void setUp ()
	{
		agence = new AgenceVoyagesServices();
		voyage = new Voyage();  
	}
	
	@Test 
	public void testReserver ()
	{		
		assertTrue(agence.reserver(voyage));
	}
	
	@Test
	/***
	 * string1 = string2 cela veut dire que string1 et 2 pointent 
	 * à la même adresse mémoire
	 */
	void testCase() 
	{    
	    String originalObject = "howtodoinjava.com";
	    String cloneObject = originalObject;
	    String otherObject = "example.com";
	     
	    //Test will pass
	    Assertions.assertNotSame(originalObject, otherObject);
	     
	    //Test will fail
	    Assertions.assertNotSame(originalObject, cloneObject);
	     
	    //Test will pass
	    Assertions.assertSame(originalObject, cloneObject);
	 
	    // Test will fail
	    Assertions.assertSame(originalObject, otherObject);
	}
	
	@Test
	void testCaseBis() 
	{
	 
	    //This will pass
	    Assertions.assertTimeout(Duration.ofMinutes(1), () -> 
	    {
	        return "result";
	    });
	     
	    //This will fail
	    Assertions.assertTimeout(Duration.ofMillis(100), () -> {
	        Thread.sleep(10);
	        return "result";
	    });
	     
	    //This will fail
	    Assertions.assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
	        Thread.sleep(200);
	        return "result";
	    });
	}
	
}
