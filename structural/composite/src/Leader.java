import java.util.ArrayList;
import java.util.List;

public class Leader implements TeamMember {

    private String name;
    private Department department;
    private List<TeamMember> subordinates;

    public Leader(String name, Department department) {
        subordinates = new ArrayList<TeamMember>();
        this.department = department;
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Department getDepartment() {
        return department;
    }

    public void addSubordinate(TeamMember teamMember) {
        subordinates.add(teamMember);
    }

    public void removeSubordinate(TeamMember teamMember) {
        subordinates.remove(teamMember);
    }

    public List<TeamMember> getSubordinates() {
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
