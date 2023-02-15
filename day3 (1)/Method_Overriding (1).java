class parent {
    void show() {
        System.out.println("This is under parent");
    }
}

class child extends parent {
    void show() {
        System.out.println("This is under child ");
    }
}

public class Method_Overriding {
    public static void main(String[] args) {

        parent obj = new parent();
        obj.show();

        child obj2 = new child();
        obj2.show();
    }

}
