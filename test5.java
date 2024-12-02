import java.util.Scanner;
public class test5 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the score:");
        int score = sc.nextInt();
        if(score>35 && score<60){
            System.out.print("I can get a video game");}
        else if(score>60 && score<90){
            System.out.print("I can get Iphone");}
        else if(score>90){
            System.out.print("I can get macbook pro");}
        else{
            System.out.print("Nothing");
        }
    }
}

