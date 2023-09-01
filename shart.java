import java.util.Arrays;  
import java.util.Scanner;
public class toph7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int max=0,count=0;
        String N;
        char c=' ';
        N=sc.nextLine();
       Arrays.sort(N);
    //   System.out.println(N);  
       for(int i=0;i<N.length();i++){
        //   System.out.println(N[i]);
        if(N.charAt(i)==N.charAt(i+1)){
            count++;
            if(count>max){
               c=N.charAt(i);
                max=0;
                max=count;
                
            }
          
            
        }
        else{
            count=0;
      }
     }
     System.out.println(c);
}
}
