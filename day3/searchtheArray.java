import java.util.Scanner;
public class searchtheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("Enter the array");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Please enter the key value:");
        int key=sc.nextInt();
     int value=0;
        for(int i=0;i<n;i++){
            if(arr[i]==key)
            value=1;
                
                
            }
            if(value==1){
                System.out.println("The value is found");
            }
            else{
                System.out.println("Value not found");
            }
            
        

    }

}
