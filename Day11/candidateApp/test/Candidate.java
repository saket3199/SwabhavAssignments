package com.techlab.candidateApp.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.techlab.candidateApp.CandidateApp;

class Candidate {

	@Test
	void test() {
		//Arrange
		int expectedid=1;
		String expectedname="Apple";
		int expectedage=21;
		String expectedcreditpoint="1000";
		//Act
		CandidateApp cdd=new CandidateApp(1,"Apple",21,"1000");
		//Assert
		assertEquals(expectedid,cdd.getId());
		assertEquals(expectedname,cdd.getName());
		assertEquals(expectedage,cdd.getAge());
		assertEquals(expectedcreditpoint,cdd.getCreditPoint());
	}

	@Test
	void testWhoISBetter() {
		//Arrange
		CandidateApp expected=new CandidateApp(1,"Apple",21,"300");
		
		//Act
		CandidateApp c1=new CandidateApp(2,"Banana",21,"300");
		CandidateApp c2=new CandidateApp(3,"Apple",21,"300");
		CandidateApp c3=c1.whoISBetter(c2);
		
		//Assert
		assertEquals(expected.getId(),c3.getId());
		assertEquals(expected.getName(),c3.getName());
		assertEquals(expected.getAge(),c3.getAge());
		assertEquals(expected.getCreditPoint(),c3.getCreditPoint());
	}

}
