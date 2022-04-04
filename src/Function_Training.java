import java.util.Scanner;
public class Function_Training {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc1=new Scanner(System.in); //스캐너 하나에다가 변수 여러개 줘도 된다.
		/*Scanner sc2=new Scanner(System.in);
		Scanner sc3=new Scanner(System.in);*/
		
		int num1=sc1.nextInt();
		int num2=sc1.nextInt();
		int num3=sc1.nextInt();
		
		
		
		int sum=NumSum(num1, num2, num3);
		System.out.println(sum);
					
		
	}
	
	static int NumSum(int i, int j, int k) {
				
		int sum=i+j+k;
		
		//or return i+j+k;
		
		return sum;
	}
	
}
