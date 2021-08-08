package Week1Day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 1;
		System.out.println("FibonacciSeries:");
		System.out.println(a);
		System.out.println(b);
		int c;
		int i;
		for(i=1; i<8 ; i++) {
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		}

	}

}
