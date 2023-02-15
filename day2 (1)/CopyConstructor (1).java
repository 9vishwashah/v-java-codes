class A {
    int a;
    String b;

    A() {
        a = 10;
        b = "hello";
        System.out.println(a + "" + b);
    }

    A(A refvar) {
        a = refvar.a;
        b = refvar.b;
        System.out.println(a + "" + b);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        A r = new A();
        A r2 = new A(r);
        System.out.println(r2.a);
        System.out. println(r.a);    
    }
}
