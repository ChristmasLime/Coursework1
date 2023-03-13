public class Employee {
    private static int counter = 0;
    private final int id;
    private final String fullName;
    private int department;
    private double salary;

    public Employee(String fullName, int department, double salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = ++counter;
    }

    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static Employee[] employees = new Employee[10];

    public static void getAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static double getTotalSalary() {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public static Employee getMinSalaryEmployee() {
        Employee minSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < minSalaryEmployee.getSalary()) {
                minSalaryEmployee = employee;
            }
        }
        return minSalaryEmployee;
    }

    public static Employee getMaxSalaryEmployee() {
        Employee maxSalaryEmployee = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = employee;
            }
        }
        return maxSalaryEmployee;
    }

    public static double getAverageSalary() {
        double totalSalary = getTotalSalary();
        return totalSalary / employees.length;
    }

    public static String[] getEmployeesFullNames() {
        String[] employeesFullNames = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            employeesFullNames[i] = employees[i].getFullName();
        }
        return employeesFullNames;
    }


    @Override
    public String toString() {
        return "Сотрудник №" + id + " Ф. И. О. "+  fullName + "."+" Отдел " + department + " Зарплата :" + salary;
    }
}
