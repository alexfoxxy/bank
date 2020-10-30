package AlexFox;

public class Bookkeeper {
    private ProfessorAccounting professorAccounting;
    private StudentAccounting studentAccounting;

    Bookkeeper(int salRateProf, int salRateStudent){
        professorAccounting = new ProfessorAccounting(salRateProf);
        studentAccounting = new StudentAccounting(salRateStudent);
    }

    public void setSalaryRateProf(int salRate){
        professorAccounting.setSalaryRate(salRate);
    }

    public void setSalaryRateStudent(int salRate){
        studentAccounting.setSalaryRate(salRate);
    }

    public String getSalary(Professor professor){
        return professorAccounting.getSalary(professor);
    }
    public String getSalary(Student student){
        return studentAccounting.getSalary(student);
    }
}
