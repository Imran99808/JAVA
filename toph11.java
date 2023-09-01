import java.util.*;
public class toph11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int N ,sum=0 ;
     N=sc.nextInt();
     int[] arr=new int[N];
     for(int i=0;i<N;i++){
         arr[i]=sc.nextInt();
         
     }
       for(int i=0;i<N;i++){
      
           int a=arr[i] ;
           if(a>sum){
            sum=0;
            sum=a;
             
           }
           a=0;
        
     }
       
        System.out.println(sum);

    }   
    
}
