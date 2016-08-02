package com.khmeracademy.forum.Jnitest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.khmeracademy.forum.services.userService.userServicesImpl.UserServicesImpl;

public class Tester {
	@Autowired
	UserServicesImpl u;
	 @Test
	  public void testAssertNotNull() {
	    assertNotNull( u);
	  }

}
