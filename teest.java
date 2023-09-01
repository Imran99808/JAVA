import java.lang.reflect.Method;
import java.util.Scanner;

public class teest {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int T,b=0;
     int[] count=new int[101];
     
     T=sc.nextInt();
     String[] S=new String[101];
   
     sc.nextLine();
     for(int i=0;i<T;i++){
     S=sc.nextLine().split("");
      for(int j=0;j<S.length;j++){
          // b=0;
        if(S[j].equals("W")||S[j].equals("D")||S[j].equals("N")){
           continue;
          }
        else{
          b++;
        }

      }
     
       count[i]=b;
       
       b=0;
     }

   m1(count,T);
   
   
}
static void m1(int c[],int t){
  for(int i=0;i<t;i++){
   if(c[i]<7){
    if(c[i]==1){
      System.out.println("1ball");
    }
    else{
      System.out.println(c[i]+" "+"balls");
    }
   }
  }

}
}