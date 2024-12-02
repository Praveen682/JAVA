import java.util.Scanner;
class coding{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value for meghana:");
        String meghana = scan.nextLine();
        if(meghana.equals("dead")){
            System.out.print("Surya meets ramya");
        }
        else{
            System.out.print("Surya weds meghana");
        }
    }
}