import java.util.*;
public class t13 {
    public static void main(String[] args) {
       
        
        Scanner sc=new Scanner(System.in);
        int N,b;
        double arr[],a=0 ,c;
        N=sc.nextInt();
         arr=new double[N];
         String[] arr2=new String[N];
        
        for( int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        //   arr2[i]=arr[i]/i+1;
        }
         for(int j=0;j<N;j++){
              a+=arr[j];
              if(a%(j+1)==0){
                b=(int)a/(j+1);
                arr2[j]=Integer.toString(b);
              }
              else{
                  c=a/(j+1);
                  arr2[j]=Double.toString(c);
              }
             System.out.println(arr2[j]);
         }
         
    }
}

