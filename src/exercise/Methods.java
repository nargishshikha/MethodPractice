package exercise;

public class Methods {
	
	public static void main(String[] args) {

		System.out.println("Hello Gidhub");
		System.out.println("Que-1: " + add(10, 30));
	}

	/**Que-1: Write a method that take two number input and return the sum.
	 * 
	 * parameter: int numOne, int numTwo
	 * returnType: int
	 * servingBucket: variable
	 */

	public static int add(int numOne, int numTwo) {
		int result = 0;

		result = numOne + numTwo;

		return result;
	}

}
