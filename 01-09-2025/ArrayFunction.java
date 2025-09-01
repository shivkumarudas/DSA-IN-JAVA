import java.util.*;
public class ArrayFunction {
    public static void updatee(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={30,50,60};
        updatee(marks);
        for(int i=0;i<=marks.length;i++){
            System.out.println(marks[i]);
        }
    }
}
