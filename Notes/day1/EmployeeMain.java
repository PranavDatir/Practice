package day1;

public class EmployeeMain {

	public static void main(String[] args) {
		// Creating an object of Employee class
		Employee emp = new Employee();
		//Assiging values for the object referred by 'emp'
		emp.employeeId = 101;
		emp.employeeName = "James";
		emp.employeeSalary = 12345.55f;
		
		//Retrieving the values back and printing the same.
		System.out.println("Employee ID: " + emp.employeeId);
		System.out.println("Employee Name: " + emp.employeeName);
		System.out.println("Employee Salary:  $" + emp.employeeSalary);

	}

}
