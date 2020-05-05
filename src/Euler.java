
public class Euler {
	public static void main(String[] args) {
		double result = 0;
		for (int i = 1; i < 10000; i++) {
			double n = (double)1/(i*i);
			result += n;
		}
		System.out.println("PI = "+ Math.sqrt(result*6));
	}
}
