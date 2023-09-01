import java.util.Scanner;
public class toph8 {
	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
        int N ,c=0;
       
        N=sc.nextInt();
        String[] arr=new String[N];
        sc.nextLine();
        char a='a', add=' ';
        String user, b="";
     
        for(int i=0;i<N;i++){
            user=sc.nextLine();
           if(2==user.length()){
                for(int j=0;j<user.length();j++){
                    add=user.charAt(j);
                    b=b+add;
           }
           b+=a;
           }
           else if(user.length()%2==0){
                for(int j=0;j<user.length()-1;j++){
                 add=user.charAt(j);
                 b+=add;
           }
                     
           }
           else{
           for(int j=0;j<user.length();j++){
                 add=user.charAt(j);
                 b+=add;
           }
           }
           arr[c]=b;
           c++;
        
           b="";
        }
        int xx=0;
        int size=0;
        for(int j=0;j<N;j++){
            xx=arr[j].length();
            if(xx>size){
                size=0;
                size=xx;

            }
            xx=0;
        }
       int maxsize=20-size;
        maxsize/=2;
       int maxdev=0, maxlen=0;
        for(int i=0 ;i<N;i++){
            maxlen=arr[i].length();
            maxdev=20-maxlen;
             maxdev/=2;
             int x=maxdev-maxsize;
            for(int j=0;j<x;j++){
                System.out.print(" ");
            }

            System.out.print(arr[i]+"\n");
            // System.out.println("");
            maxlen=0;
            maxdev=0;
            x=0;
        }
        
    }
  
      
    
  }
