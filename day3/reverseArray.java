import java.util.Scanner;
public class reverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array siZe:");
        int n=sc.nextInt();
        int[] arr=new int[n];
       
        System.out.println("Enter the array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 

        }
      int temp;
    for(int i=0;i<n/2;i++)
    {
        temp=arr[i];
        arr[i]=arr[n-1-i];
        arr[n-1-i]=temp;
        
    }
       for(int i=0;i<n;i++){
       
        System.out.println("The reverse array is "+arr[i]);

    }
       
       

    }

}
