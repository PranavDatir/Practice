package day1;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.employeeId = 1;
		emp.employeeName = "ABC";
		emp.employeeSalary = 12345;
		System.out.println("Employee ID: "+ emp.employeeId);
		System.out.println("Employee Name: "+ emp.employeeName);
		System.out.println("Employee Salary: "+ emp.employeeSalary);
	}

}
