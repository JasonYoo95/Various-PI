
public class Ramanujan {
	static long factorial(long num) {
		if(num<=1) return 1;
		return factorial(num-1)*num;
	}
	
	public static void main(String[] args) {
		double sum = 0;
		for (int i = 0; i < 30; i++) 
		{
		   double term = (double)(factorial(4*i)*(1103+(26390*i)))/((Math.pow(factorial(i), 4))*Math.pow(396, (4*i)));
		   sum += term;
		}
		sum *= ((2*Math.sqrt(2))/9801);
		sum = Math.pow(sum, -1);
		
		System.out.println("PI = "+ sum);
	}
}
