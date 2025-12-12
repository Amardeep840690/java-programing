import java.util.Scanner;
class A5_evenOrOdd {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("enter a number to check even or odd = ");
        n=sc.nextInt();
        if(n%2==0){
            System.out.println("number "+n+" is even");
        }
        else{
            System.out.println("number "+n+" is odd");
        }
        sc.close();
    }
}
