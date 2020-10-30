package AlexFox;

public class StudentAccounting implements Accounting<Student, Currency> {

    private int salaryRate;
    private String salary;

    public StudentAccounting(int salRate){
        salaryRate = salRate;
    }

    public String getSalary(Student student) {

        salary = "Salary of " + student.getName() + " " +
                salaryRate + " "  + getCurrency();

        System.out.println(salary);

        return salary;
    }

    public Currency getCurrency() {
        return Currency.RUB;
    }

    public void setSalaryRate(int salaryRate) {
        this.salaryRate = salaryRate;
    }
}


