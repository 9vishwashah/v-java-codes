class animal{
    String name;
    public void eat(){
        System.out.println("Animals can eat");
    }
}

class Dog extends animal{

    public void display(){
        System.out.println("name: "+name);
    }
}

public class inherit {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.name="rohan";
        obj.eat();
        obj.display();
    }
    
}
