import java.util.Scanner;




public class toph5 {
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
   if(c[i]<6){
    if(c[i]==1){
      System.out.println(c[i]+" "+"BALL");
    }
    else{
      System.out.println(c[i]+" "+"BALLS");
    }
   }
   else{
       int a=c[i]/6;
       int b=c[i]%6;
       if(a==1&b==0){
           System.out.println(a+" "+"OVER");
       }
       else if(1<a&b==0){
            System.out.println(a+" "+"OVERS");
       }
       else if(b==1&a==1){
            System.out.println(a+" "+"OVER"+" "+b+" "+"BALL");
       }
       else if(a==1&1<b){
            System.out.println(a+" "+"OVER"+" "+b+" "+"BALLS");
       }
       else if(1<a&b==1){
           System.out.println(a+" "+"OVERS"+" "+b+" "+"BALL");
       }
       else if(1<a&1<b){
             System.out.println(a+" "+"OVERS"+" "+b+" "+"BALLS");
       }
   }
  }

}
}