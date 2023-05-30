package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class TaskModule1 extends BaseClass {
	
		@Test
		public void createTask()
		{
			Reporter.log("createTask");
			
		}

		@Test
		public void modifyTask()
		{
			Reporter.log("modifyTask");
			
		}
		
		@Test
		public void deleteTask()
		{
			Reporter.log("deleteTask");
			
		}
	}



