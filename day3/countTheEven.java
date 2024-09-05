import java.util.Scanner;

public class countTheEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array siZe:");
        int n=sc.nextInt();
        int[] arr=new int[n];
       int count=0;
        System.out.println("Enter the array Element:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 

        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count++;
            }
        }
            System.out.println("The count of the even number is "+count);


      
        
    }

}
