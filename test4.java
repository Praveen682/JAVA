import java.util.Scanner;

public class test4 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.print("It is even");
        }
        else{
            System.out.print("It is odd");
        }
    }    
}
