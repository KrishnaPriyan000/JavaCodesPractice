import java.util.Scanner;

class Arithematic{

	public static void main(String[] args){

		System.out.println("Enter numbers to perform ArithematicOperation");

		Scanner sc = new Scanner(System.in);

		int FirstNum = sc.nextInt();
		int SecondNum = sc.nextInt();
		
		int add = FirstNum + SecondNum;
		System.out.println("The sum is"+add);

		int mul = FirstNum * SecondNum;
		System.out.println("The mul is"+mul);

		int div = FirstNum / SecondNum;
		System.out.println("The div is"+div);

		int mod = FirstNum % SecondNum;
		System.out.println("The mod is"+mod);
	}
}
