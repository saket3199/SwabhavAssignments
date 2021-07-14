package com.techlab.engineering;

public class Professor extends Person {
	private double salary;
	private double Dearness_Allowance;
	private double HRA_Allowance;
	private double conveyance;
	private double medical_allowance;

	public Professor(int id, String name, String dob, double salary) {
		super(id, name, dob);
		this.salary = salary;

	}
	public double getSalary() {
	return salary;
	}
	 
//	double salary, double Dearness_Allowance, double HRA_Allowance, double conveyance, double medical_allowance
 public double totalSalary()
	{
	 double totalSalary =salary + Dearness_Allowance + HRA_Allowance + conveyance + medical_allowance;
	 return (totalSalary);
	}

	

	public double getDearness_Allowance() {
		return Dearness_Allowance;
	}

	public void setDearness_Allowance(double dearness_Allowance) {
		Dearness_Allowance = dearness_Allowance;
	}

	public double getHRA_Allowance() {
		return HRA_Allowance;
	}

	public void setHRA_Allowance(double hRA_Allowance) {
		HRA_Allowance = hRA_Allowance;
	}

	public double getConveyance() {
		return conveyance;
	}

	public void setConveyance(double conveyance) {
		this.conveyance = conveyance;
	}

	public double getMedical_allowance() {
		return medical_allowance;
	}

	public void setMedical_allowance(double medical_allowance) {
		this.medical_allowance = medical_allowance;
	}
}
