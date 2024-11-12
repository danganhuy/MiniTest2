public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new EmployeeParttime(15, "AWE", 35, 153, "awe@gmail.com", 180);
        employees[1] = new EmployeeParttime(28, "QLE", 22, 521, "qle@gmail.com", 172);
        employees[2] = new EmployeeParttime(19, "PWZ", 25, 903, "pwz@gmail.com", 149);
        employees[3] = new EmployeeParttime(31, "LAQ", 22, 315, "laq@gmail.com", 175);

        employees[4] = new EmployeeFulltime(23, "WQW", 24, 123, "wqw@gmail.com", 250, 0, 50080);
        employees[5] = new EmployeeFulltime(38, "PQL", 31, 988, "pql@gmail.com", 1210, 0, 62310);
        employees[6] = new EmployeeFulltime(41, "TNR", 25, 722, "tnr@gmail.com", 890, 1000, 50990);
        employees[7] = new EmployeeFulltime(9, "UFV", 36, 701, "ufv@gmail.com", 53000, 550, 143000);
        employees[8] = new EmployeeFulltime(3, "BCV", 40, 492, "bcv@gmail.com", 3330, 100, 250870);
        employees[9] = new EmployeeFulltime(16, "EIC", 21, 518, "eic@gmail.com", 350, 200, 81180);

        EmployeeList eList = new EmployeeList(employees);

        System.out.println("Company average salary: " + eList.averageSalary());
        System.out.println("Amount of employee's salary that is below average: " + eList.belowAverage());
        System.out.println("Total salary of part time employee: " + eList.parttimePayment());
        System.out.println("Total salary of full time employee: " + eList.fulltimePayment());

        System.out.println("=== List of company's employee ===");
        for (Employee e : eList.getEmployees()) {
            System.out.println(e);
        }

        System.out.println("=== Sorted list of fulltime employee ===");
        for (Employee e : eList.sortFulltimeEmployees()) {
            System.out.println(e);
        }
    }
}
