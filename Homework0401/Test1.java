
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {1,2,3,4,5};
		int max=0;
		int sum=0;
		float avg=0.0f;
		
		max=makeMax(arr1);
		System.out.println(max);
		
		sum=makeSum(arr1);
		System.out.println(sum);
		
		avg=makeAvg(arr1);
		System.out.println(avg);

	}
	
	int makeMax(int[] array)
	{
		int max=0;
		for(int i=0; i<5; i++) {
			max
			
		}
		
	}
	
	int makeSum(int[] array) {
		array = new int[5];
		int i;
		int sum=0;
		for(i=0; i<5; i++) {
			sum=sum+array[i];
			
		}
		return sum;
	}
	

}
