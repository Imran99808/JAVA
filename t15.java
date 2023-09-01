import java.util.*;
class t15 {
    public static void main(String[] args) {
        int count,Xi,Yi,check;
       Scanner sc=new Scanner(System.in);
       count=sc.nextInt();
       for(int i=0;i<count;i++){
         Xi=sc.nextInt();
         Yi=sc.nextInt();
         check=(Xi+Yi)/2;
         if(check%2==0){
            System.out.println("Sadia will be happy.");
         }
         else{
            System.out.println("Oops");
         }
        
        
       }
       
    }
}