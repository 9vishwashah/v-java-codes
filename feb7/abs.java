abstract class bike {
    abstract void run();

}

// abstract class car {
//     abstract void color();
// }

// class vehicle1 extends bike {
//     void run() {
//         System.out.println("Bike runs faster than car");
//     }

// }

// // class abs extends bike , car {
// class vehicle2 extends car {
//     void color() {
//         System.out.println("Car has black color\n");
//     }
// }

class abs {
    void run(){
        System.out.println("Car runs faster than bike \n");
    }

    
    public static void main(String[] args) {
        /*
         * In abstract class object created in main should have obj of abstract class to
         * new obj name of root class
         */

        abs obj = new abs();
        obj.run();
    }
}
