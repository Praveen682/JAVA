import java.util.*;
public class test7 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();        
        int b = sc.nextInt();        
        int c = sc.nextInt();        
        int d = sc.nextInt();        
        int e = sc.nextInt();    
        int tot = a+b+c+d+e;
        int avg = tot/5;
        
        if(avg<35){
            System.out.print("Additional class is required");
        }
        else{
            System.out.print("You are good to go");
        }
    }
}
