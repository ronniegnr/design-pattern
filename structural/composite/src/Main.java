public class Main {

    public static void main(String[] args) {
        Employee aa = new Employee("aa");
        Employee bb = new Employee("bb");
        Employee cc = new Employee("cc");

        aa.addSubordinate(bb);
        bb.addSubordinate(cc);

        System.out.println(aa);

    }
}
