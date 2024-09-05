import java.util.Scanner;
public class containDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("Enter the array");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp;
        for(int i=0;i<n-1;i++){
        if(arr[i]>arr[i+1]){
            temp=arr[i];
            arr[i+1]=arr[i+1];
            arr[i+1]=temp;

        }
        }
        int flag=0;

        for(int i=0;i<n-1;i++){
           if(arr[i]==arr[i+1]){
            flag=1;
           }
        }
        if(flag==1){
            System.out.println("Duplicate found");
        }
        else{
            System.out.println("Duplicate not found");
        }

    }

}
