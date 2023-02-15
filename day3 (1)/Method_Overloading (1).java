class sum{
    public int add(int x, int y){
            return x + y;
        }
        
        public  int add(int x, int y, int z){
            return x + y + z;
    }
}
public class Method_Overloading {
        
    public static void main(String[] args) {
        sum obj = new sum();
        System.out.println(obj.add(10, 20)); 
        System.out.println(obj.add(2, 4, 8));
    } 
}
