
public class John_Wallis {
	public static void main(String[] args) {
		double result = 1;
		for (int i = 1; i < 10000; i++) {
			double n = 1 - (double) 1/(4*i*i);
			result *= n;
		}
		System.out.println("PI = "+ (1/result)*2);
	}
}
