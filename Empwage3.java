
public class Empwage3 {
	public static final int Is_Full_Time = 1;
	public static final int Is_Part_Time = 2;
	public static final int Emp_Rate_PerHr = 20;
	public static final int No_of_Working_Days = 20;
	public static final int Max_Hr_In_Month = 100;

	public static void main(String arg[]) {
		System.out.println("Welcome to Employee Wage Computation");

// Check whether the Employee is present or absent

		int Emp_Hrs = 0;
		int Emp_Wage = 0;
		int Total_Working_days = 0;

		double empcheck = Math.floor(Math.random() * 10) % 2;
		if (empcheck == Is_Full_Time)
			System.out.println("Employee is Present"); // Employee Present
		else
			System.out.println("Employee is Absent"); // Employee Absent

// Calculating the Daily Employee Wage	

		if (empcheck == Is_Full_Time)
			Emp_Hrs = 8;
		Emp_Wage = Emp_Rate_PerHr * Emp_Hrs; // Calculating Daily Employee Wage
		System.out.println("The Daily Wage of an Employee is :" + Emp_Wage);

// Calculating the daily Employee Wage of part time employee

		if (empcheck == Is_Full_Time) // Wage for FullTime Employee
			Emp_Hrs = 8;
		else if (empcheck == Is_Part_Time) // Wage for PartTime Employee
			Emp_Hrs = 4;
		else
			Emp_Hrs = 0;
		Emp_Wage = Emp_Rate_PerHr * Emp_Hrs; // Calculating Employee Wage
		System.out.println("The Daily Wage of an Employee is :" + Emp_Wage);

// 	Calculating Employee Wage using Switch case

		int employee = (int) Math.floor(Math.random() * 10) % 3;
		switch (employee) {
		case 2: // PartTime Employee
			Emp_Hrs = 4;
			break;
		case 1: // FullTime Employee
			Emp_Hrs = 8;
			break;
		default:
			Emp_Hrs = 0;
		}
		Emp_Wage = Emp_Rate_PerHr * Emp_Hrs; // Calculating Employee Wage
		System.out.println("The Daily Wage of an Employee is :" + Emp_Wage);

// Calculating Wages for a month for FullTime or a PartTime Employee using switch case	

		for (int day = 0; day < No_of_Working_Days; day++) { // Calculating the days
			switch (employee) {
			case 2: // PartTime Employee
				Emp_Hrs = 4;
				break;
			case 1: // FullTime Employee
				Emp_Hrs = 8;
				break;
			default:
				Emp_Hrs = 0;
			}
			Emp_Wage = Emp_Rate_PerHr * Emp_Hrs; // Calculating Employee Wage
			System.out.println("The Daily Wage of an Employee is :" + Emp_Wage);

// Calculating Employee Wage for a month assuming 100 hours and 20 days	
			
			while (Emp_Hrs <= Max_Hr_In_Month && Total_Working_days < No_of_Working_Days) {
				Total_Working_days++;

				switch (employee) {
				case 2: // PartTime Employee//
					Emp_Hrs = 4;
					break;
				case 1: // FullTime Employee//
					Emp_Hrs = 8;
					break;
				default:
					Emp_Hrs = 0;
				}
				Emp_Wage = Emp_Rate_PerHr * Emp_Hrs; // Calculating Employee Wage//
				System.out.println("The Daily Wage of an Employee is :" + Emp_Wage);
			}
		}
	}
}
 


