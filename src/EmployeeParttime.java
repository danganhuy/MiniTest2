public class EmployeeParttime extends Employee{
    private int workHours;

    public EmployeeParttime(int id, String name, int age, long phoneNumber,
                            String email, int workHours) {
        super(id, name, age, phoneNumber, email);
        this.workHours = workHours;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    @Override
    public String toString() {
        return "EmployeeParttime{" +
                "id=" + getId() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", phoneNumber=" + getPhoneNumber() +
                ", email='" + getEmail() + '\'' +
                ", workHours=" + workHours +
                '}';
    }

    @Override
    public double getSalary() {
        return workHours * 1000;
    }
}
