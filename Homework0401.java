
public class Homework0401 {

	public static void main(String[] args) {
		
		int a=10, b=5;
		System.out.println("호출 전--");
		System.out.println(a);
		System.out.println(b);
		
		/*addOne(a,b);
		
		System.out.println("호출 후--");
		System.out.println(a);
		System.out.println(b);*/
		
		addOne(a++,b++);
		
		System.out.println("호출 후에도 바뀌지 않게 하기");
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
