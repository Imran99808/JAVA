import java.util.*;
public class t12 {
    
    Scanner sc=new Scanner(System.in);
    int N,D,f,s ,arr[];
     arr=new int[2];
    
    for(int i=0;i<2;i++){
        //  System.out.println(i);
         arr[i]=sc.nextInt();
       
    }
     N=arr[0];
     D=arr[1];
     s=N%D;
     f=N/D;
     System.out.println(f+" "+s+" "+D);
    
}
