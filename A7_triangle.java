import java.util.Scanner;
public class A7_triangle {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no of rows =");
        int row=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=(row-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}