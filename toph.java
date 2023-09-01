import java.util.Scanner;


public class toph {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int N, A, B,sum=0;
       
        N=Integer.parseInt(input[0]);
        A=Integer.parseInt(input[1]);
        B=Integer.parseInt(input[2]);
        String[] inpu2=new String[N];
        inpu2=sc.nextLine().split(" ");
        int[] arr=new int[N];
          
        for(int i=0; i<N; i++){
            arr[i]=Integer.parseInt(inpu2[i]);
        
        //     arr[i]=sc.nextInt();
         }
      for(int i=A; i<B+1;i++){
        sum+=arr[i];

      }
    System.out.println(sum);
        

    }
    
}
