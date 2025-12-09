import java.util.Scanner;
class A2_simpleInterest {
    public static void main(){
        Scanner sc =new Scanner(System.in);
        System.out.print("enter principle amount = ");
        float p = sc.nextFloat();
        System.out.print("enter rate = ");
        float r = sc.nextFloat();
        System.out.print("enter time = ");
        float t = sc.nextFloat();
        float si=(p*r*t)/100;
        System.out.println("simple interest = "+si);
        sc.close();
    }
}