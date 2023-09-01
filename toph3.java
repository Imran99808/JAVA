import java.util.Scanner;
public class toph3{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a ,b,i=0;
       double P=input.nextDouble();
       b=(int)P;
       a=(int) P/10;
        char[] arr=new char[13];
        
        
        for(i=0; i<a+1; i++){
            if(i==0){
                arr[i]=(char)91;
            }
            else{
            arr[i]=(char)43;
        }
        }
         for(int j=i;j<10+3;j++){
             if(j==11){
                 arr[j]=(char)93;
                 continue;
             }
              if(j==12){
                 
                 arr[j]=(char)32;
                 break;
             }
            arr[j]=(char)46;
        }
         
      System.out.print(arr);
      
      
      System.out.println(b+"%");
    }
}