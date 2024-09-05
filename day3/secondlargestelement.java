import java.util.Scanner;
public class secondlargestelement {
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
        //with swaping
        //for(int i=0;i<n-1;i++){
        //if(arr[i]>arr[i+1]){
            //temp=arr[i];
           // arr[i+1]=arr[i+1];
            //arr[i+1]=temp;

      //  }
  //  }
  // without swapping
  int max=Integer.MIN_VALUE;
  for(int i=0;i<n-1;i++){
    if(arr[i]>max)
    max=arr[i];

        
  }
  int secMax=Integer.MIN_VALUE;
  for(int i=0;i<n-1;i++){
    if(arr[i]<max && arr[i]>secMax){
       secMax=arr[i];
  }
    }
    System.out.println("The second Largest number is "+secMax);
    }
}
