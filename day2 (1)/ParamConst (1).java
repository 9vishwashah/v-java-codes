class Student {
    String stdname;
    int stdstandard;

    Student(String name, int standard) {
        this.stdname = name;
        this.stdstandard = standard;

    }
}

public class ParamConst {
    public static void main(String[] args) {
        Student s1 = new Student("Vishwa", 10);
        System.out.println(s1);
    }
}
