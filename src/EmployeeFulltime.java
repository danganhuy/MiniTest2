public class EmployeeFulltime extends Employee{
    private double bonus;
    private double fine;
    private double fixedSalary;

    public EmployeeFulltime(int id, String name, int age, long phoneNumber,
                            String email, double bonus, double fine,
                            double fixedSalary) {
        super(id, name, age, phoneNumber, email);
        this.bonus = bonus;
        this.fine = fine;
        this.fixedSalary = fixedSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(double fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public String toString() {
        return "EmployeeFulltime{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", bonus=" + bonus +
                ", fine=" + fine +
                ", fixedSalary=" + fixedSalary +
                '}';
    }

    @Override
    public double getSalary() {
        return fixedSalary + bonus - fine;
    }
}
