interface Interface_Animal {
public void animalSound();
public void sleep() ;
public void eat();

}
class Sheep implements Interface_Animal{
    public void animalSound()  {
        System.out.println("SheepSound - the child class Sheep");        
    }
    public void sleep()  {
        System.out.println("zzz");
    }
    public void eat() {
        System.out.println("yum yum");

        
    }
    public class interfaceex{
        public static void main(String[] args) {
            Sheep obj=new Sheep();
             obj.animalSound();
             obj.sleep();
             obj.eat();
        }
    }
}


    

