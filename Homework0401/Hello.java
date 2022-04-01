
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int c=0;
		c=add(3,5);
		System.out.println(c);
		
	}
	
	static int add(int a, int b)
	{
		int c=0;
		c=a+b;
		return c;*/
		
	int a=10, b=5;
	System.out.println("호출 전--");
	System.out.println(a);
	System.out.println(b);
	
	addOne(a,b);
	
	System.out.println("호출 후--");
	System.out.println(a);
	System.out.println(b);
		
		
		
		
	}
	
	static void addOne(int x, int y) {
		x++;
		y++;
		System.out.println("addOne함수");
		System.out.println(x);
		System.out.println(y);
	}
	

}
