
public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=9, b=2;
		int[] c=change(a,b);
		c=change(a,b);//
		System.out.println(c[0]+"/"+c[1]);//2, 9
		
		
	}

	static int [] change(int x, int y){
		
		int[]z= new int[2];
		z[0]=x;
		z[1]=y;
		
		
		//°ª ±³È¯
		int temp =0;
		temp = z[0];
		z[0]=z[1];
		z[1]=temp;
		
		return z;
		
	}
	
	
}
