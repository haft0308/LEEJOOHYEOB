package Homework;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []Arr= {34,5,2,3,5,6,34,5,3};
		Test.sum(Arr);
		System.out.println(Test.sum(Arr));

	}

}

class Test{
	int total;
	
	static int sum(int [] Arr) {
		int sum=0;
		for (int i=0; i<Arr.length; i++) {
			sum=sum+Arr[i];
			}
			return sum;
		
	}
	
}
