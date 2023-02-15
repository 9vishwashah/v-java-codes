abstract class AbsAnimal{
    public abstract void animalSound();

    public void animSound(){
        System.out.println("AbsclassNormalMethod");

    }
    public void sleep(){
        System.out.println("zzz from Abs class");

    }

}
class Bird extends AbsAnimal {
    public void animSound() {
        System.out.println("the bird says: kuhu");

    }
    public void animalSound(){
        System.out.println("from abstract method");

    } 
    public void sleep() {
 System.out.println("zzz from the child class");  

    }
}        


public class Abstract_codes {
    public static void main(String[] args) {
        Bird obj =new Bird();
        obj.animSound();
        obj.sleep();
        obj.animalSound();
    }    
}
