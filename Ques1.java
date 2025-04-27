import java.util.Scanner;
public class Ques1 {
    public static void main(String[] args) {
        // 1. Write a Java program that checks if the user input number is a perfect sqaure.  
        // For eg 4 is perfect square because 2*2=4 
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check if it is perfect square");
        int num=sc.nextInt();
        sc.close();
        int count=0;
        for(int i=1;i<num;i++){
            if (i*i==num){
                System.out.println("It is a perfect square");
                count=0;
                break;
            }else {
                count=1;
            }
        }
        if (count==1){
            System.out.println("Not a perfect square");
        }
    }

}