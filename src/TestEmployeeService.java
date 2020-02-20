import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestEmployeeService {
	private Employee employee = new Employee("Rajeev", 8000, 25);
	private EmployeeService employeeService = new EmployeeService();
	
	@Test
	public void testCalculateAppriasal() {
		double appraisal = employeeService.calculateAppraisal(employee);
		Assertions.assertEquals(500, appraisal);
	}
	
	@Test
	public void testCalculateYearlySalary() {
		double yearlySalary = employeeService.calculateYearlySalary(employee);
		Assertions.assertEquals(96000, yearlySalary);
	}
}
