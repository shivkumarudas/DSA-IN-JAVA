public class nestedif {
    public static void main (String[] args){
        int a=25;
        if(a>10){
            if(a<20){
                System.out.println("a is greater than 10 but less than 20");
            }
            else{
                System.out.println("a is greater than 20");
            }
        }
        else{
            System.out.println("a is less than 10");
        }
    }
}
