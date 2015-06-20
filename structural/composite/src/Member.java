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

}