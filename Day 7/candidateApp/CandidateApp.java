package com.techlab.candidateApp;

public class CandidateApp {
		private int id;
		private String name;
		private int age;
		private String creditpoint;

		public CandidateApp(int id, String name, int age, String creditpoint) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.creditpoint = creditpoint;

		}

		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}

		public String getCreditPoint() {
			return creditpoint;
		}

		public void whoISBetter(CandidateApp[] c) {
			int temp = Integer.parseInt(c[0].getCreditPoint().toString());
			String name = c[0].getName();
			for (int i = 1; i < c.length; i++) {
				String name1 = c[1].getName();
				int temp1 = Integer.parseInt(c[1].getCreditPoint().toString());
				if (temp < temp1) {
					temp = temp1;
					name = name1;
				}
					
					
			}
			System.out.println("Best candidate is " + name +" with credit of "+temp);
			
		}
	}


