
public class EmployeeService {
	public double calculateYearlySalary(Employee employee) {
		return employee.getSalary() * 12;
	}
	
	public double calculateAppraisal(Employee employee) {
		return employee.getSalary() < 10000 ? 500 : 1000;
	}
}
