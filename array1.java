import java.util.Scanner;
public class array1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int a = sc.nextInt();
        int arr[] = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<a;i++){
            System.out.print(arr[i]);
        }
    }
}
