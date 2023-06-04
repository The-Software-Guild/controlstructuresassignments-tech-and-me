package controlstructure;

public class DoWhileLoop {

	public static void main(String[] args) {
		int count = 1;
		int num1 = 0;
		int num2 = 1;
		int num3;
		do {
			num3 = num1 + num2;
			System.out.println(num1);
			num1 = num2;
			num2 = num3;
			count++;
		}while(count<=10);

	}

}
