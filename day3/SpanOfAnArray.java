import java.util.Scanner;
public class SpanOfAnArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("Enter the array");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        System.out.println("The  span of the array is "+ (max-min));
    }

}
