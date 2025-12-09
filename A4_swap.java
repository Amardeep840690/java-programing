import java.util.Scanner;
class A4_swap {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number a = ");
        int a=sc.nextInt();
        System.out.print("enter a number b = ");
        int b=sc.nextInt();
        System.out.println("before swaping a is "+a+" and b is "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swaping a is "+a+" and b is "+b);
        sc.close();
    }
}
