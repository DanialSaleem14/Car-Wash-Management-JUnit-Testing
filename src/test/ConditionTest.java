package test;

import model.Employee;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionTest {

    @Test
    public void testStatusLevels() {
        Employee junior = new Employee("Ali", "E001", "IT", "Intern", 20000, 2);
        Employee experienced = new Employee("Zain", "E002", "IT", "Dev", 50000, 6);
        Employee senior = new Employee("Sara", "E003", "HR", "Manager", 80000, 12);

        assertEquals("Junior", junior.getStatus());
        assertEquals("Experienced", experienced.getStatus());
        assertEquals("Senior", senior.getStatus());
    }

    @Test
    public void testLeaveEligibility() {
        Employee emp = new Employee("Usman", "E004", "Sales", "Exec", 40000, 3);

        assertTrue(emp.applyLeave(10));
        assertFalse(emp.applyLeave(25));
        assertFalse(emp.applyLeave(-5));
        assertEquals(10, emp.getLeavesTaken());  
    }
}