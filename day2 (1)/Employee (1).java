
public class Employee {
    float salary = 400;
    int bonus=100;
}

class Programmer extends Employee{
    
    public static void main(String[] args) {
        Employee a = new Employee();
        System.out.println("Programmer salary before bonus: "+a.salary);
        System.out.println("Programmer salary after bonus: "+a.bonus);
    }
}
