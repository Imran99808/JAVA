import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int a=0,b=0 ;
    
  
   String user;
 
   user=sc.nextLine();
   char letter;
   
   for(int i=0;i<user.length();i++){
        letter=user.charAt(i);
        if((int)letter==40){
           a++;
          }
    
      else{
        b++;
      }
        
   }
   if(a==b){
    System.out.println("Yes");
   }
   else{
    System.out.println("No");
   }
    



	}
}