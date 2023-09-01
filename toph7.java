// Use this editor to write, compile and run your Java code online
import java.util.Arrays;  
import java.util.Scanner;
public class toph7 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
        int com=1, max=0,count=1;
        String[] N;
        String c=" ";
        N=sc.nextLine().split("");
       Arrays.sort(N);
    //   System.out.println(N);  
       for(int i=0;i<N.length-1;i++){
        //   System.out.println(N[i]);
       
        if(Integer.parseInt(N[i])==Integer.parseInt(N[i+1])){
            count++;
            if(count>max){
               c=N[i];
                max=0;
                max=count;
                
            }
          
            
        }
        else{
            count=0;
      }
     
     }
     if(max>0){
     System.out.println(c);
     }
     else{
          System.out.println(N[0]);
     }

	}
}