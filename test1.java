import java.util.Scanner;

public class test1 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if(mark>35){
            System.out.print("Pass");        
        }
        else{
            System.out.print("Fail");
        }
}
}
