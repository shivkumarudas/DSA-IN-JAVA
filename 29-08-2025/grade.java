import java.util.Scanner;

public class grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your  math subject marks: ");
        int math=sc.nextInt();
        System.out.print("Enter your  science subject marks: ");
        int science=sc.nextInt();
        System.out.print("Enter your  english subject marks: ");
        int english=sc.nextInt();
        System.out.print("Enter your  hindi subject marks: ");
        int hindi=sc.nextInt();
        System.out.print("Enter your  marathi subject marks: ");
        int marathi=sc.nextInt();
        int total=math+science+english+hindi+marathi;
        System.out.println("Your total marks is: "+total);
        int percentage=total/5;
        System.out.println("Your percentage is: "+percentage);
        if(percentage>=90){
            System.out.println("Your grade is A+");
        }
        else if(percentage>=80){
            System.out.println("Your grade is A");
        }
        else if(percentage>=70){
            System.out.println("Your grade is B+");
        }
        else if(percentage>=60){
            System.out.println("Your grade is B");
        }
        else if(percentage>=50){
            System.out.println("Your grade is C");
        }
        else if(percentage>=35){
            System.out.println("Your grade is D");
        }
        else{
            System.out.println("You are fail");
        }
    }
}
