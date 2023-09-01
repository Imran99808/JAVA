import java.util.*;
class t19{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a,b,l=0,o=0;
        a=sc.nextInt();
        b=sc.nextInt();
        int[] arr1=new int[a];
        int[] arr2=new int[b];
        int[] arr3=new int[a+b];
        String count="";
        
       
        
        for(int i=0;i<a;i++){
             arr1[i]=sc.nextInt();
             arr3[i]=arr1[i];
            
           
        }
        for(int i=0;i<b;i++){
            arr2[i]=sc.nextInt();
            arr3[i+a]=arr2[i];
        }
        Arrays.sort(arr3);
        for(int j=0, i=1;i<arr3.length;i++,j++){
            
                if(arr3[i]==arr3[i-1]) {
                    continue;
                }  
                count+=arr3[j];
                // System.out.println(j);
        
        }
          count+=arr3[a+b-1];
      
                 for( o=0;o<count.length()-1;o++){
                        System.out.print(count.charAt(o) + " ");

              }   
          System.out.println(count.charAt(o));    
 }
        
}