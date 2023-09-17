import java.util.Scanner;
class Algebra{
     int add(int a,int b){
        int ans=a+b;
        return ans;

     }
     }
     public class small{
        public static void main(String[] args) {
            Algebra obj=new Algebra();
            Scanner sc=new Scanner (System.in);
           
            System.out.println("add two numbers");
            int x =sc.nextInt();
            int y =sc.nextInt();
            
            int ans=obj.add(x,y);
            System.out.println(ans);


        }

     }
