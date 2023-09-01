public class toph4{
     public static void main(String[] args){
          Scanner input=new Scanner(System.in);
         int a11,a12,a21,a22,b11,b12,b21,b22,a,b,c,d;
        String[] inpu=new String[2];
        inpu=input.nextLine().split(" ");
        a11=Integer.parseInt(inpu[0]);
        a12=Integer.parseInt(inpu[1]);

        inpu=input.nextLine().split(" ");
        a21=Integer.parseInt(inpu[0]);
        a22=Integer.parseInt(inpu[1]);

        inpu=input.nextLine().split(" ");
        b11=Integer.parseInt(inpu[0]);
        b12=Integer.parseInt(inpu[1]);

        inpu=input.nextLine().split(" ");
        b21=Integer.parseInt(inpu[0]);
        b22=Integer.parseInt(inpu[1]);

        a=a11*b11+a12*b21;
        b=a11*b12+a12*b22;
        c=a21*b11+a22*b21;
        d=a21*b12+a22*b22;


        System.out.print(a+" ");
        System.out.println(b);
         System.out.print(c+" ");
        System.out.println(d);
          
}
}    