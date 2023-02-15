/*
 This is a program to perform interface operation */ 
/*we need to declare a class first with a keyword "interface" 
 then create final methods without body in it. 
 for using the interface methods in root class we need to mention a keyword "implements" so that 
 all the methods can be accessed by the object created later
 */
interface animal {
    public void animalSound();

    public void run();

}

interface bird {
    public void fly();

    public void type();

}

public class inter implements animal {

    public void animalSound() {
        System.out.println("Animals are eating\n");
    }

    public void run() {
        System.out.println("Animals are running");
    }

    public static void main(String[] args) {
        inter obj = new inter();
        obj.animalSound();
        // obj.
        obj.run();

    }
}
