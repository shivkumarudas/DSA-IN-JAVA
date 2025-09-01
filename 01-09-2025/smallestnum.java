import java.util.*;
public class smallestnum {
    public static int getsmallest(int numbers[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }  } 
        return smallest;}
    public static void main(String args[]){
        int numbers[]={1,5,10,12,19,4,3};
        System.out.println("smallest number is:"+getsmallest(numbers));

}
}
