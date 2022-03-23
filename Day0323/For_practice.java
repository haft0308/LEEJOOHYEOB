
public class For_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		巩力 1
		for(int i=0; i<10; i++){
			System.out.println(i);
		}
		System.out.println();

		//		巩力 2
		for(int i=0; i<6; i++) {
			System.out.println("sum = sum + a["+i+"]");
		}
		System.out.println();

		//		巩力3
		
		for(int i=0; i<4; i++) {
			int num[]=new int[] {10,100,1000,10000};
				System.out.println("num["+(i+1)+"]="+num[i]);
		}
		System.out.println();

		//		巩力4
		for(byte i=0; i<6; i++) {
			byte numb[]= {1,1,1,1,1,1};
			System.out.println("numb["+(i)+"]="+numb[i]);
		}
		System.out.println();

		//		巩力5
		for(byte i=0; i<6; i++) {
			byte number[]= {1,2,3,4,5,6};
			System.out.println("number["+(i)+"]="+number[i]);
		}
		System.out.println();
		
//		巩力6
		for(byte i=0; i<6; i++) {
			System.out.println("numbe["+i+"]="+((2*i)+1));
		}
		System.out.println();
		
//		巩力7
		for(byte i=0; i<6; i++) {
			System.out.println("nu["+i+"]="+((10*i)+10));
		}
		System.out.println();

		//巩力8
		for(byte i=0; i<10; i++) {
			if (i%2==0) {
				continue;
			}
			System.out.println("n["+i+"]="+(i*i));
		}
		System.out.println();
		
		//巩力9
		int sum=0;
		for(int i=1; i<101; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		System.out.println();
		
		//巩力10
		int [] a= {2,10,8,5,3,9};
		int sum1=0;
		for (int i=0; i<6; i++) {
			sum1=sum1+a[i];
		}
		System.out.println(sum1);
		
//		巩力11
		char [] ch= {'a','p','p','l','e'};
		for (int i=0; i<5; i++) {
			System.out.println(ch[i]);
		}
		
		for (int i=4; i>-1; i--) {
			System.out.println(ch[i]);
		}
		
//		巩力12
		int[] arr;
		arr=new int[10];
		for (int i=0; i<10; i++) {
			System.out.println(arr[i]=(int)(1ei));	
		}
		
		
		
	}		
}
