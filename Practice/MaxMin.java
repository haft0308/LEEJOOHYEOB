package Practice;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] Array= {33,56,34,45,43,8,90,8,5,43,545,46};
		MyData data=new MyData();
//		int []Arr= {34,643,3,5,56,68,4,6,6876,4};
//		data.minMax(int []Arr);
		
		System.out.println(data.minMax(Array));
		System.out.println(data.Minmax(Array));
	}

}

class MyData{
	
	int minMax(int[] arr) {
		
		int max=0;
		int i=0;
		
		/*while (i<arr.length){
			if(max<arr[i]){	
				max=arr[i];
				i++;
			}
		}
		return max;*/
	
		for(i=0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		return max;
	}
		
		
	int Minmax(int[] arr) {
		
		int min=10000;
		int i;
		/*while (min>arr.length) {
			min=arr[i];
			i++;
		}*/
		for(i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		return min;
	}
	
	
}