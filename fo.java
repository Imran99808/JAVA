import java.util.*;
 
public class fo {
   public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int R,C,count=0 ;
    String[] input=sc.nextLine().split(" ");
   R=Integer.parseInt(input[0]);
   C=Integer.parseInt(input[1]);
//     R=sc.nextInt();
//    C=sc.nextInt();
    String[][] arr=new String[R][C];
   
    for(int i=0; i<R; i++) {
     arr[i]=sc.nextLine().split("");
 }
 
for(int i=0; i<R;i++){
 for(int j=0;j<C;j++){
  System.out.println(arr[i][j]);

 }
}

   
  
    
    

      }
}
