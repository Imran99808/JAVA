import java.util.*;

public class toph9 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int R,C,count=0 ;
       String[] input=sc.nextLine().split(" ");
       R=Integer.parseInt(input[0]);
       C=Integer.parseInt(input[1]);
       String[][] arr=new String[R][C];
       
       for(int i=0; i<R; i++) {
        arr[i]=sc.nextLine().split("");
    }
    
   for(int i=0; i<R;R++){
    for(int j=0;j<C;j++){
    if(arr[i][j]=="*"){
      arr[i][j]="0";
      arr[i][j+1]="0";
      arr[i][j-1]="0";
      arr[i+1][j]="0";
      arr[i-1][j]="0";

    }
    }
   }
   for(int i=0; i<R;R++){
      for(int j=0;j<C;j++){
      if(arr[i][j]=="."){
       count++;
       System.out.println("e");
  
      }
      }
     }
     System.out.println(count);
        
   
     
   
    }

}
