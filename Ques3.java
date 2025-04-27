
public class Ques3 {
    public static void main(String[] args) {
// 3. Write a Java program to print the given pattern. 
// ***** 
// **** 
// *** 
// ** 
// *
        for(int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
