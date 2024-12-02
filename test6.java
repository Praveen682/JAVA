import java.util.*;

class test6{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the score:");
        int val = scan.nextInt();
        if(val<50){
            System.out.print("You need to improve");
        }
        else if(val>=50 && val<=70){
            System.out.print("Good job");
        }
        else if(val>70){
            System.out.print("Excellent performance");
        }
    }
}