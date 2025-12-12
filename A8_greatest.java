import java.util.Scanner;
class A8_greatest{
	public static void main(){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a= ");
		int a=sc.nextInt();
		System.out.print("enter b= ");
		int b=sc.nextInt();
		System.out.print("enter c= ");
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("a is greater");
		}
		else if(b>a && b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
		sc.close();
}
}