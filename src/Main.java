public class Main {
    public static void splitOffers(){
        System.out.println("############################################################################################");
    }


    public static void main(String[] args) {

        Employee.employees[0] = new Employee("Иванов Иван Иванович", 1, 50000);
        Employee.employees[1] = new Employee("Петров Петр Петрович", 1, 60000);
        Employee.employees[2] = new Employee("Сидоров Сидор Сидорович", 2, 45000);
        Employee.employees[3] = new Employee("Никитин Никита Никитович", 2, 55000);
        Employee.employees[4] = new Employee("Козлова Елена Ивановна", 3, 70000);
        Employee.employees[5] = new Employee("Андреев Иван Петрович", 3, 80000);
        Employee.employees[6] = new Employee("Карпова Анастасия Александровна", 4, 55000);
        Employee.employees[7] = new Employee("Лебедев Дмитрий Игоревич", 4, 65000);
        Employee.employees[8] = new Employee("Ким Юрий Ильич", 5, 45000);
        Employee.employees[9] = new Employee("Макаров Сергей Игоревич", 5, 55000);



        splitOffers();
        // Вывод списка всех сотрудников
        Employee.getAllEmployees();
        splitOffers();

        // Сумма затрат на зарплаты в месяц
        double totalSalary = Employee.getTotalSalary();
        System.out.println("Сумма затрат на зарплаты в месяц: " + totalSalary);
        splitOffers();

        // Сотрудник с минимальной зарплатой
        Employee minSalaryEmployee = Employee.getMinSalaryEmployee();
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalaryEmployee);
        splitOffers();

        // Сотрудник с максимальной зарплатой
        Employee maxSalaryEmployee = Employee.getMaxSalaryEmployee();
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalaryEmployee);
        splitOffers();

        // Среднее значение зарплат
        double averageSalary = Employee.getAverageSalary();
        System.out.println("Среднее значение зарплат: " + averageSalary);
        splitOffers();

        // Ф. И. О. всех сотрудников
        String[] employeesFullNames = Employee.getEmployeesFullNames();
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (String fullName : employeesFullNames) {
            System.out.println(fullName);

        } splitOffers();
    }
}