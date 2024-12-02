import java.util.Scanner;

public class test2 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the income amount:");
        int Income = scan.nextInt();
        if(Income>7000){
            System.out.print("Scholarship is available");
        }
        else{
            System.out.print("Not eligible for scholarship");
        }
    }    
}
