import java.util.*;
class t18{
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    
    int in=0;
  
   String user,arr1="",c="";
 
   user=sc.nextLine();
   char letter,better;

   for(int i=0;i<user.length();i++){
    
        letter=user.charAt(i);
     
   
     if(user.charAt(i)=='('||user.charAt(i)=='['||user.charAt(i)=='{'){
     
        arr1+=letter;
   
      }  
   else if(arr1.length()>0){
             better= arr1.charAt(arr1.length()-1);
             
            if((int)better==(int)letter-1||(int)better==(int)letter-2){
                  arr1= m1(arr1);
            //    function parents veriable copy.it is know all update.jokon function call.it do this work
         
            }
            else{
                // in++;
               
                break;
            }
        }
     
        
    
    else{
        in++;
        break;
    }  
 
       
       
        
   }
    
    if(arr1==""&&in==0){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    


		
	}
    static String m1(String a){
        char b;
        String c="";
        for(int i=0;i<a.length()-1;i++){
           b=a.charAt(i);
           c+=b;

        }
        return c;
    }
}