package com.techlab.candidateApp.test;

import com.techlab.candidateApp.CandidateApp;

public class CandidateappTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				CandidateApp[] c = new CandidateApp[4];
				CandidateApp c1 = new CandidateApp(1, "Saket", 21, "35000");
				c[0] = c1;
				CandidateApp c2 = new CandidateApp(2, "Apple", 21, "4000");
				c[1] = c2;
				CandidateApp c3 = new CandidateApp(3, "Orange", 20, "30000");
				c[2] = c3;
				CandidateApp c4 = new CandidateApp(4, "Grapes", 22, "25000");
				c[3] = c4;
				
				c1.whoISBetter(c);
				printCandidateDetails(c);
				
			}

			public static void printCandidateDetails(CandidateApp[] info) {
				for (int i = 0; i < info.length; i++) {
					System.out.println("\n");
					System.out.println("ID of the " + (i + 1) + " Employee is : " + info[i].getId());
					System.out.println("Name of the " + (i + 1) + " Employee is : " + info[i].getName());
					System.out.println("Age of the " + (i + 1) + " Employee is : " + info[i].getAge());
					System.out.println("CreditPoint of the " + (i + 1) + " Employee is : " + info[i].getCreditPoint());
				}
			}


		}

	