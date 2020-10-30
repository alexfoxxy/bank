package AlexFox;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students;

        University vntu = new University("VNTU");

        Department fitce = new Department("FITCE");

        Student stateStudent = new StateStudent("Vasya", 20,   fitce, 4.6);
        Student contractStudent = new ContractStudent("Misha", 20, fitce, 4.1);

        students = new ArrayList<>(Arrays.asList(stateStudent, contractStudent));


        vntu.addDepartment(fitce);

        fitce.addStudent(students);

        stateStudent.getAverageScore();
        contractStudent.getAverageScore();

        students = fitce.expulsion(stateStudent);

        Student newStudent = new StateStudent("Pavel", 19, fitce, 4.1);
        fitce.addStudent(newStudent);

        newStudent.getAmountStudent();
        StateStudent.getAmountStudent();

        Professor professor = new Professor("Volodymyr", 41, AcademicDegree.ASSISTANT);

        Bookkeeper bookkeeper = new Bookkeeper(600, 200);
        bookkeeper.getSalary(professor);
        bookkeeper.getSalary(newStudent);

        System.out.println(vntu.toString());

        for(Student fitceStudent : fitce.getStudents()){
            fitceStudent.getAverageScore();
        }

    }
}
