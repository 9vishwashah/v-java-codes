class Language{
    public void displayInfo() {
        System.out.println("Common English language");
    }
}

class java extends Language{
    public void displayInfo() {
        System.out.println("Java Programming Language");
    }
}
public class poly {
    public static void main(String[] args) {
        java obj = new java();
        obj.displayInfo();

        Language obj2 = new Language();
        obj2.displayInfo();
    }   
}
