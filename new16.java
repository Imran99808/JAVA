import java.util.*;
class new16{
    public static void main(String[] args) {
       
      Scanner sc=new Scanner(System.in);
        int n,f1=2,f2,count=0;
       n=sc.nextInt();

       while(n>0){
        for(f2=2;f2<f1;f2++){
            if(f1%f2==0)
            break;

        }
        if(f2==f1){
           count=f1;
            n--;
        }
        f1++;
       }
      System.out.println(count);  
}
}