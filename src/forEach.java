import java.util.*;

public class forEach {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.println("give me a number!");
		int Num1 = Integer.parseInt(input.nextLine());
		System.out.println("give me another number!");
		int Num2 = Integer.parseInt(input.nextLine());
		System.out.println("another!");
		int Num3 = Integer.parseInt(input.nextLine());
		System.out.println("One more!");
		int Num4 = Integer.parseInt(input.nextLine());
		System.out.println("I lied! last one!");
		int Num5 = Integer.parseInt(input.nextLine());

		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(Num1, Num2, Num3, Num4, Num5));

		Integer sum = 0;
		Integer Product = 1;

		for (Integer Number : numList) {
			System.out.println(Number);
			sum = sum + Number;
			Product = Product * Number;
		}
		System.out.printf("The sum of your number is %d!\n", sum);
		System.out.println("The Product of your number is: " + Product);
		System.out.println("The ArrayList Min Value is: " + Collections.min(numList));
		System.out.println("The ArrayList Max Value is: " + Collections.max(numList));
	}

}
