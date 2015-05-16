import java.util.List;

public class Member implements TeamMember {

    private String name;
    private Department department;

    public Member(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Department getDepartment() {
        return department;
    }

    @Override
    public void addSubordinate(TeamMember teamMember) {
        subordinates.add(teamMember);
    }

    @Override
    public void removeSubordinate(TeamMember teamMember) {
        subordinates.remove(teamMember);
    }

    @Override
    public List<TeamMember> getSubordinates() {
        return subordinates;
    }

}