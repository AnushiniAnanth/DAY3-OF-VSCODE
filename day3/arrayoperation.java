import java.util.Scanner;
public class arrayoperation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        
        int [] arr=new int[n];
        System.out.println("Enter the array");
    
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int sum=0;
        int prod=1;
        float avg=0;
      
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prod*=arr[i];
            avg=sum/n;


        }
        System.out.println("The Addition of Array :"+sum);
        System.out.println("The Product of Array :"+prod);
        System.out.println("The Average of Array :"+avg);
     
}

}
