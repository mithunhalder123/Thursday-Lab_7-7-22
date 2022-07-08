import java.util.Scanner;
public class DivisibleNumber {

	public static void main(String[] args) {
		int number;
		Scanner obj=new
				Scanner(System.in);
		System.out.println("Enter the number: ");
		number=obj.nextInt();
		if((number%5==0) && (number%11==0))
			System.out.println("The number is divisible by 5 and 11.");
		else
			System.out.println("The Number is not Divisible By 5 and 11");

	}

}
