import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = scan.nextInt();
        if(a%3==0 && a%5==0){
            System.out.print("The number is divisble by 3 and 5");
        }
        else{
            System.out.print("The number is not divisble by 3 and 5");
        }
    }    
}
