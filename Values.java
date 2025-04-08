import java.util.Scanner;
class Values{
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a short-type number: ");
		short a = s.nextShort();
		
		System.out.println("Enter a byte-type number: ");
		byte b = s.nextByte();
		
		System.out.println("Enter a long-type number: ");
		long l = s.nextLong();
		
		System.out.println("Enter a float-type number: ");
		float f = s.nextFloat();
		
		System.out.println("Enter a double-type number: ");
		double d = s.nextDouble();
	
		
		System.out.println("Enter a Char-type : ");
		String c = s.next();
		
		System.out.println("Enter a String-type : ");
		s.nextLine();
		String ss = s.nextLine();
		
		
		System.out.println("Short-type variable value: "+a);
		System.out.println("Byte-type variable value: "+b);
		System.out.println("Long-type variable value: "+l);
		System.out.println("Float-type variable value: "+f);
		System.out.println("Double-type variable value: "+d);
		System.out.println("Char-type variable value: "+c);
		System.out.println("String-type variable value: "+ss);
		
		}
	}