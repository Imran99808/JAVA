import java.util.*;
class toph1{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n,count=1,p=2,f1=3,f2,ch=0;
    n=sc.nextInt();
    if(n==count){
        System.out.println(p);
    
    }
    while(true){
       
    for(f2=2;f2<f1;f2++){
      if(f1%f2==0){
        ch++;
        break;
      }
    
    }
    if(ch==0){
      System.out.println(p);
        p=f1;
        count++;

    }
    f1++;
    ch=0;
    if(n==count){
        System.out.println(p);
        break;
    }

    }


    }

}
