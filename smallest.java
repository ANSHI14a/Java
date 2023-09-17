import java.util.Scanner;
class check{
    int checking(int a,int b,int c){
        if ((a>b)&&(a>c))
        {
            System.out.println("largest is ");

        }
        else if((b>a)&&(b>c)){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }
        return 0;
    }
}
public class smallest{
    public static void main(String[]args){
        check obj=new check();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=obj.checking(a,b,c);
        System.out.println(ans);
    }
}
