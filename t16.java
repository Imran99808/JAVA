import java.util.*;
class t16{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,count=1,f1=3,f2=3,ch=0;
        n=sc.nextInt();
         
        while(true){
            
            if(n==count){
                System.out.println(2);
                break;
           }
           if(f2==f1){
             f2=3;
           }
           else if(f1%f2==0){
             ch++;
             f2=3;
           }
           else{
            f2+=2;
            continue;
           }
           if(ch==0){
            count++;
           }
        
        if(n==count){
            System.out.println(f1);
            break;
        }
        f1+=2;
        ch=0;
    
        }
        }
    }