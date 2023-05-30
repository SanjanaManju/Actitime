package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;

public class ProjectModule1 extends BaseClass {
	@Test
	public void createProject()
	{
		Reporter.log("createProject");
		
	}

	@Test
	public void modifyProject()
	{
		Reporter.log("modifyProject");
		
	}
	
	@Test
	public void deleteProject()
	{
		Reporter.log("deleteProject");
		
	}



}



