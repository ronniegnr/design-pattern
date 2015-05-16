import java.util.List;

public interface TeamMember {

    public String getName();
    public Department getDepartment();
    public void addSubordinate(TeamMember teamMember);
    public void removeSubordinate(TeamMember teamMember);
    public List<TeamMember> getSubordinates();

}
