import java.util.Scanner;

class mathOperation {
    public static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number a = ");
        float a = sc.nextFloat();
        System.out.print("enter a number b = ");
        float b = sc.nextFloat();
        float sum = a + b;
        float sub = a - b;
        float mul = a * b;
        System.out.println("sum of " + a + " and " + b + " is = " + sum);
        System.out.println("substraction of " + a + " and " + b + " is = " + sub);
        System.out.println("multiplication of " + a + " and " + b + " is = " + mul);
        if (b != 0) {
            float div = a / b;
            System.out.println("division of " + a + " and " + b + " is = " + div);
        } else {
            System.out.println("division not possible ");
        }

    }
}
