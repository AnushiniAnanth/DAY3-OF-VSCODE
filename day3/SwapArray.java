import java.util.Scanner;
public class SwapArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("Enter the array");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        

            temp=arr[0];
            arr[0]=arr[n-1];
            arr[n-1]=temp;
            System.out.println("the swapping of the array is ");
    
      for(int i=0;i<n;i++){
        System.out.println(+arr[i]);
    
            
      }
}
}
