import java.util.Scanner;
public class SumofallElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array siZe:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        System.out.println("Enter the array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 

        }
        for(int i=0;i<n;i++){
            sum+=arr[i]; 

        }
        System.out.println("The sum of the array is "+sum);

    }

}
