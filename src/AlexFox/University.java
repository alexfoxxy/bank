package AlexFox;

import java.util.ArrayList;
import java.util.List;

public class University {

    private final String name;
    private List<Department> departments = new ArrayList<>();


    public University(String name){
        this.name = name;
    }

    public void addDepartment(Department department){
        System.out.println(name + " add department " + department.getName());
        departments.add(department);
    }

    @Override
    public String toString() {
        return  name + " amount department " + departments.size();
    }
}
