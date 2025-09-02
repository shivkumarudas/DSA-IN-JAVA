import java.util.*;
public class Binarysearch {
    public static int Binarys(int numbers[],int key){
        int start=0; 
        int end=numbers.length-1;
        while (start<=end) {
            int mid=(start+end)/2;
            if(numbers[mid]==key){
               return mid;
            }
            if(numbers[mid]<=key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    }


    public static void main(String args[]) {
        int numbers[]={0,2,4,8,10,12,14};
        int key=4;
        System.out.println("key is found "+Binarys(numbers,key));
    }
}
