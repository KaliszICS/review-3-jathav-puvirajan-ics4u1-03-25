import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String string = in.nextLine();
		System.out.println(string.charAt(0));
		
	}

	public static void q2() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		boolean bool = in.nextBoolean();
		in.nextLine();
		System.out.println(!bool);
		
	}

	public static void q3() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int n = in.nextInt();
		in.nextLine();
		System.out.println(n > 5);
		
	}

	public static void q4() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double n = in.nextDouble();
		in.nextLine();
		System.out.println(n >= -2.0 && n <= 2.0);
		
	}

	public static void q5() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		String string = in.nextLine();
		System.out.println(string.equals("Hello World"));
		
	}

	public static void q6() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		int n1 = in.nextInt();
		in.nextLine();
		System.out.print("In: ");
		int n2 = in.nextInt();
		in.nextLine();
		System.out.println(n1 <= n2);
		
	}

	public static void q7() {
		Scanner in = new Scanner(System.in);
		System.out.print("In: ");
		double n1 = in.nextDouble();
		in.nextLine();
		System.out.print("In: ");
		double n2 = in.nextDouble();
		in.nextLine();
		System.out.println(n1 > n2);
		
	}

}
