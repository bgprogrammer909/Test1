import java.util.Scanner;
public class Ques2 {
    public static void main(String[] args) {
        // 2. Write a Java program that calculates the product of the digits in a number given by a user using a loop. 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number you want product of all digit");
        int num=sc.nextInt();
        sc.close();
        int dig=0,ans=1;
        while (num!=0){
            dig=num % 10;
            ans=ans*dig;
            num=num/10;
        }
        System.out.println("product of all digit is "+ans);
    }
    
}
