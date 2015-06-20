public class Main {

    public static void main(String[] args) {
        TeamMember leader1 = new Leader("aa", Department.CUSTOMERCARE);
        TeamMember leader2 = new Leader("bb", Department.CUSTOMERCARE);
        TeamMember teamMember1 = new Member("cc", Department.CUSTOMERCARE);
        ((Leader)leader2).addSubordinate(teamMember1);

        System.out.println( (((Leader)leader1).getSubordinates()) );
    }
}
