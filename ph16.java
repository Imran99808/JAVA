import java.util.*;
class ph16 {
   
      
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
          int i, n,f2=0,count=0,c=0;
         n=sc.nextInt();
  
          for(i=1;i>0;i++){
            if(n==1){
                System.out.println(2);
                break;
            }
            else if(n==2){
                System.out.println(3);
                break;
            }
              f2=(6*i)-1;
              c=m1(f2,c);
              count=c;
            //   System.out.println("count1="+count);
            
        
            if(count==n){
                System.out.println(f2);
                break;
            }
            f2=(6*i)+1;
              c=m1(f2,c);
              count=c;
            //   System.out.println("count2="+count);
            
        
            if(count==n){
                System.out.println(f2);
                break;
           
         }
}
    }
static int m1(int x,int y) {
     if(x==5){
        y=3;
     }
    else if(x==7){
        y=4;
    }

    else if(x%5==0 || x%7==0){
       y+=0;
     }
     else{
         y+=1;
     }
    return y;
}

}