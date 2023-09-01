import java.util.*;
public class toph10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum ,i,jog=0,s;
        sum=sc.nextInt();
        int[] arr=new int[3];
        for(i=0;i<3;i++){
            arr[i]=sc.nextInt();
            jog+=arr[i];
        }
        s=sum-jog;
        System.out.println(s);
    }
}
