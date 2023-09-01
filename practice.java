import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        

   Scanner sc=new Scanner(System.in);
     int n,m,f=0,values[];
   
     n=sc.nextInt();
    
    int[] initial=new int[n];
  for(int i=0;i<n;i++){
        f=0;
          m=sc.nextInt();
       
        values=new int[m];

  for(int j=0;j < m;j++) {
      values[j]=sc.nextInt();
    
     f+=values[j];
  }
   initial[i]= f;
 }
  
  
   for(int i = 0; i < n; ++i) {
       System.out.println(initial[i]);
 
    
    

    }
}
}