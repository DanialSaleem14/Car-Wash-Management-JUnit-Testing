package test;

import model.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class StatementTest {

    @Test
    public void testBasicCreation() {
        Employee emp = new Employee("Zoya", "E008", "HR", "Assistant", 28000, 2);

        assertEquals("Zoya", emp.getName());
        assertEquals("E008", emp.getId());
        assertEquals("HR", emp.getDepartment());
        assertEquals("Assistant", emp.getPosition());
        assertEquals(28000, emp.getSalary(), 0.01);
        assertEquals(2, emp.getYearsOfExperience());
    }

    @Test
    public void testLeaveTracking() {
        Employee emp = new Employee("Rehan", "E009", "Tech", "Engineer", 45000, 3);
        emp.applyLeave(5);
        emp.applyLeave(7);
        assertEquals(12, emp.getLeavesTaken());
    }
}