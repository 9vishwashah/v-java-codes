class vote{
    public static void main(String[]args){
        int a=30;
        if(a>18){
            System.out.println("you are Eligible to vote");
        }
        else if(a<0){
            System.out.println("Oops! You have entered invalid age");
        }
        else{
            System.out.println("You are not eligible for voting");
        }
    }
}