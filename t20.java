import java.util.*;
public class t20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int l,r,c,a=0;
        String n;
         r=sc.nextInt();
         c=sc.nextInt();
        String[][] arr=new String[r][c];
        //  sc.nextLine();
     for(int i=0;i<r;i++){
         for(int j=0;j<c;j++){
             arr[i][j]=sc.next();
              if(arr[i][j].equals("*")){
                arr[i][j]="1";
              }
              else{
                arr[i][j]="0";
              }
      }
    }
   
      for(int i=0;i<r;i++){
          for(int j=0;j<c;j++){
            Integer.valueOf(arr[i][j]);
            if(j==0 && i==0){
              if(arr[i][j].equals(".")){
                l=arr[i][j+1]+arr[i+1][j]+arr[i+1][j+1];
                 arr[i][j]=Integer.toString(l);
               }
            }
            else if(j==c-1 && i==0){
                if(arr[i][j].equals(".")){
                 l=Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i+1][j])+Integer.valueOf(arr[i+1][j-1]);
                  arr[i][j]=Integer.toString(l);
                }
             }
            else if(i==0){
              if(arr[i][j].equals(".")){
               l=Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i][j+1])+Integer.valueOf(arr[i+1][j])+Integer.valueOf(arr[i+1][j-1])+Integer.valueOf(arr[i+1][j+1]);
                arr[i][j]=Integer.toString(l);
              }

           }
           else if(j==0&&i==r-1){
            if(arr[i][j].equals(".")){
              l=Integer.valueOf(arr[i][j+1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j+1]);
               arr[i][j]=Integer.toString(l);
             }
          }
          else if(j==c-1 && i==r-1){
            if(arr[i][j].equals(".")){
             l=Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j-1]);
              arr[i][j]=Integer.toString(l);
            }
         }
         else if(i==r-1){
          if(arr[i][j].equals(".")){
           l=Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i][j+1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j-1])+Integer.valueOf(arr[i-1][j+1]);
            arr[i][j]=Integer.toString(l);
          }
        }
        else if(j==0&&i>0&&i<r-1){
          if(arr[i][j].equals(".")){
            l=Integer.valueOf(arr[i][j+1])+Integer.valueOf(arr[i+1][j])+Integer.valueOf(arr[i+1][j+1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j+1]);
             arr[i][j]=Integer.toString(l);
           }
        }
        else if(j==c-1&&i>0&&i<r-1){
          if(arr[i][j].equals(".")){
            l=Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i+1][j])+Integer.valueOf(arr[i+1][j-1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j-1]);
             arr[i][j]=Integer.toString(l);
           }
        }
        
          else if(arr[i][j].equals(".")){
            l=Integer.valueOf(arr[i][j+1])+Integer.valueOf(arr[i][j-1])+Integer.valueOf(arr[i+1][j])+Integer.valueOf(arr[i+1][j+1])+Integer.valueOf(arr[i+1][j-1])+Integer.valueOf(arr[i-1][j])+Integer.valueOf(arr[i-1][j+1])+Integer.valueOf(arr[i-1][j-1]);
             arr[i][j]=Integer.toString(l);
           
        }
        else{
          arr[i][j+1]="*";
        }
              System.out.println(arr[i][j] +" ");
         }
    }

 }
}