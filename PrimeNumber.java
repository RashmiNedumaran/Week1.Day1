package Week1Day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean flag = false;
		for(int i =2;i < a/2;i++)
		{
			int rem = a%i;
			if(rem==0) {
				flag = true;
				break;
			}
		}
		if(flag == false) {
		System.out.println("The number is prime");
		}
		else {
		System.out.println("The number is not prime");
	}}

}
