package AlexFox;
import java.util.ArrayList;
import java.util.List;
public class Department {

    private final String name;
    private List<Student> students;
    Department(String name)
    {
        this.name = name;
        students = new ArrayList<>();
    }

    public List<Student> getStudents()
    {
        return students;
    }

    public void addStudent(Student student)
    {
        System.out.println(name + " add student " + student.getName());
        students.add(student);
    }

    public void addStudent(List<Student> students)
    {
        System.out.println(name + " add " + students.size() + " students");
        this.students.addAll(students);
    }

    public List<Student> expulsion(Student student){

        students.remove(student);
        System.out.println(student.getName() +" ID " + student.id + " is deduct");
        student.expulsion();

        return students;
    }

    public String getName() {
        return name;
    }
}
