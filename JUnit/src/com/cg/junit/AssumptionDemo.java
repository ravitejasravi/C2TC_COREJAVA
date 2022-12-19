package com.cg.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {

	     @Test
		 public void test() {
	    	 System.setProperty("Environment", "dev");
	    	 Assertions.assertTrue("dev".equals(System.getProperty("Env")));
			
		}

	}


