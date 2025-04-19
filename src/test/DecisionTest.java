package test;

import model.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecisionTest {

    @Test
    public void testPromotion() {
        Employee emp = new Employee("Kiran", "E005", "Marketing", "Associate", 30000, 4);
        emp.promote("Team Lead");
        assertEquals("Team Lead", emp.getPosition());
    }

    @Test
    public void testRaiseSalary() {
        Employee emp = new Employee("Fahad", "E006", "Finance", "Analyst", 60000, 5);
        emp.raiseSalary(10);
        assertEquals(66000, emp.getSalary(), 0.01);
    }

    @Test
    public void testDepartmentTransfer() {
        Employee emp = new Employee("Hina", "E007", "Support", "Officer", 35000, 3);
        emp.transfer("Product");
        assertEquals("Product", emp.getDepartment());
    }
}