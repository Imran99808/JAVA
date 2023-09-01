import java.util.Scanner;
public class toph2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    int N,l ,o,intial;
    N=sc.nextInt();
  
   String user,fall;
   sc.nextLine();
   user=sc.nextLine();
   char letter,assin;
   
    fall="";
   for(int i=0;i<user.length();i++){
        letter=user.charAt(i);
        if((int)letter==32){
            // assin=(char)32;
            assin=(char)letter;
            fall+=assin;
            continue;
        }
        
        l=(int)letter - 'a';
        intial=26+l;
        intial-=N;
       
        if(intial>25){
            intial-=26;
         
        }
    
        o=intial +'a';
        assin=(char)o;
        // fall=Character.toString(assin);
           
         fall+=assin;
        
   }
    
  System.out.println(fall);


		
	}
}