public class EmployeeList {
    private Employee[] employees;

    public EmployeeList(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public double averageSalary() {
        double sum = 0;
        for (Employee e : employees) {
            sum += e.getSalary();
        }
        return sum / employees.length;
    }

    public int belowAverage() {
        double average = averageSalary();
        int count = 0;
        for (Employee e : employees) {
            if (e.getSalary() < average) {
                count++;
            }
        }
        return count;
    }

    public double parttimePayment() {
        double sum = 0;
        for (Employee e : employees) {
            if (e instanceof EmployeeParttime) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public double fulltimePayment() {
        double sum = 0;
        for (Employee e : employees) {
            if (e instanceof EmployeeFulltime) {
                sum += e.getSalary();
            }
        }
        return sum;
    }

    public Employee[] sortFulltimeEmployees() {
        int fulltimeCount = 0;
        for (Employee e : employees) {
            if (e instanceof EmployeeFulltime) {
                fulltimeCount++;
            }
        }
        Employee[] fulltimeEmployees = new Employee[fulltimeCount];
        for (int i = 0, j = 0; i < employees.length; i++) {
            if (employees[i] instanceof EmployeeFulltime) {
                fulltimeEmployees[j] = employees[i];
                j++;
            }
        }
        for (int i = 0; i < fulltimeEmployees.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (fulltimeEmployees[j-1].getSalary() > fulltimeEmployees[j].getSalary()) {
                    Employee temp = fulltimeEmployees[j-1];
                    fulltimeEmployees[j-1] = fulltimeEmployees[j];
                    fulltimeEmployees[j] = temp;
                }
            }
        }
        return fulltimeEmployees;
    }
}
