
public class ArrayPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3,4,5}; //5��¥�� �迭.
		int max=0;
		int sum=0;
		float avg=0.0f;
		
/*		max=makeMax(arr1);//ȣ��, �Լ�Ÿ�� int. �Լ��̸� makeMax, �Ķ���� 1��, �Ķ����Ÿ��: int[]
		System.out.println(max);
	// sum�� ������. �Լ� ȣ���սô�.	
		sum=makeSum(arr1);
		System.out.println(sum);
//		avg�� ������. �Լ� ȣ��.
		avg=makeAvg(arr1);
		System.out.println(avg);*/
		
		int[] arr2= {10,20,30,45,48,89,77,59,16,100};
//		max�� ���ϱ�
//		sum�� ���ϱ�
//		avg�� ���ϱ�
		
		/*int max2=0;
		int sum2=0;
		float avg2=0.0f;

		max2=makeMax2(arr2);
		System.out.println(max2);
		
		sum2=makeSum2(arr2);
		System.out.println(sum2);
		
		avg2=makeAvg2(arr2);
		System.out.println(avg2);*/
		
		/*int[] arr3;
		int i;
		arr3= reverse(arr2);
		for(i=0; i<10; i++) {
			System.out.println(arr3[i]);
		}*/
		
		int[] answer=reverse(arr2);//�Լ�����
		for(int i=0; i<10; i++){
			
			System.out.println(answer[i]);
		//new int[arr2.length]
			
		}
		
		
		
	}
/*	static int makeMax(int[] a)//proto type, �Լ�����, ������
	{//body
		int max=a[0];
		for(int i=1; i<5;i++)
		{
			if (max<a[i])
			{
				max=a[i];
			}
		}
		return max;
	}
	
	static int makeSum(int[] ab)
	{
		int sum=0;
		for (int i=0; i<5; i++)
		{
			sum=sum+ab[i];
		}
		return sum;
	}
	
	static float makeAvg(int[] abc)
	{
		int sum = makeSum(abc);
		float avg=sum/5.0f;
	
		return avg;
	}*/

	/*static int makeMax2(int[]a) {
		int max2=0;
		int i;
		for(i=0; i<10; i++) {
			if(max2<a[i]) {
				max2=a[i];
			}
			
		}
		return max2;
	}
	
	static int makeSum2(int[] ab) {
		int sum=0;
		int i;
		for(i=0; i<10; i++) {
			sum=sum+ab[i];
		}
		
		return sum;
	}
		
	static float makeAvg2(int[]abc) {
		int sum=makeSum2(abc);
		int i;
		float avg=sum/5.0f;
		
		return avg;
		
	}*/
	
	
	
	static int[] reverse(int[]abc) //�Լ�����
	{
		int [] arr3=new int [10];
		int i;
		int j;
		
		for(i=0; i<10; i++) {
			
			/*arr3[i]=abc[9-i];*/
			for(j=9; j>-1; j--) {
				arr3[i]=abc[j];
			}
		}
		
		return arr3;
	}
		
}
	