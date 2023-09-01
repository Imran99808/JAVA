import java.util.Scanner;
 public class toph6 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int X,Y,z=0;
        String[] input=new String[2];
        input=sc.nextLine().split(" ");
        X=Integer.parseInt(input[0]);
        Y=Integer.parseInt(input[1]);
        while(Y!=0){
            if(Y%X==0){
               
                break;
            }
            else{
                Y++;
                z++;
            }

        }
        System.out.println(z);
    } 
    }
    
