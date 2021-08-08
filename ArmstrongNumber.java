package Week1Day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n = 153;
int temp = n;
int rem;
int sum = 0;
while(n>0) {
	rem = n%10;
	n=n/10;
	sum = sum + rem*rem*rem;
}
if(temp == sum) {
	System.out.println("The number is Armstrong Number");
}
else {
	System.out.println("The number is not Armstrong Number");
}
	}
}
