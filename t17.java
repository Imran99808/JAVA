import java.util.*;
class t17{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int a=0,b=0,in=0 ;
    
  
   String user;
 
   user=sc.nextLine();
   char letter;
   
   for(int i=0;i<user.length();i++){

        letter=user.charAt(i);
       
        if(user.charAt(0)==')'){
            in++;
            break;
        }
        else if(user.charAt(user.length()-1)=='('){
            in++;
            break;
        }
        else if((int)letter==40){
            a++;
        }
        else if((int)letter==41){
            b++;
        }
        if(a<b){
            in++;
            break;
        }


       
       
        
   }
   if(a==b && in==0 ){
    System.out.println("Yes");
   }
   else{
    System.out.println("No");
   }
  
    



		
	}
}