package model;

public class Employee {
    private String name;
    private String employeeId;
    private String department;
    private String position;
    private double salary;
    private int yearsOfExperience;
    private int leavesTaken;

    public Employee(String name, String employeeId, String department, String position, double salary, int yearsOfExperience) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.leavesTaken = 0;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public int getLeavesTaken() {
        return leavesTaken;
    }

    public String getStatus() {
        if (yearsOfExperience >= 10) return "Senior";
        else if (yearsOfExperience >= 5) return "Experienced";
        else return "Junior";
    }

    public void raiseSalary(double percent) {
        if (percent > 0) {
            salary += salary * (percent / 100);
        }
    }

    public void promote(String newPosition) {
        if (!position.equalsIgnoreCase(newPosition)) {
            position = newPosition;
        }
    }

    public void transfer(String newDepartment) {
        if (!department.equalsIgnoreCase(newDepartment)) {
            department = newDepartment;
        }
    }

    public boolean applyLeave(int days) {
        if (days <= 0 || leavesTaken + days > 30) {
            return false;
        }
        leavesTaken += days;
        return true;
    }
}