import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A;
        char c;
        String l="";
        A=sc.nextInt();
        String bin = Integer.toBinaryString(A);
          for(int i=0;i<bin.length();i++){
              c=bin.charAt(i);
            if(c=='1'){
              l+=c;  
                
            }
          }
      System.out.println(Integer.parseInt(l,2));
    }
} {
    
}
