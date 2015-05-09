import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String name;
    private List<Employee> subordinates;

    public Employee(String name) {
        subordinates = new ArrayList<Employee>();
        this.name = name;
    }

    public void addSubordinate(Employee employee) {
        subordinates.add(employee);
    }

    public void removeSubordinate(Employee employee) {
        subordinates.remove(employee);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", subordinates=" + subordinates +
                '}';
    }
}
