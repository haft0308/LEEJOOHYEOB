
public class Homework0401 {

	public static void main(String[] args) {
		
		int a=10, b=5;
		System.out.println("ȣ�� ��--");
		System.out.println(a);
		System.out.println(b);
		
		/*addOne(a,b);
		
		System.out.println("ȣ�� ��--");
		System.out.println(a);
		System.out.println(b);*/
		
		addOne(a++,b++);
		
		System.out.println("ȣ�� �Ŀ��� �ٲ��� �ʰ� �ϱ�");
		System.out.println(a);
		System.out.println(b);

	}
	
	static void addOne(int x, int y) {
		x++;
		y++;
		System.out.println("addOne�Լ�");
		System.out.println(x);
		System.out.println(y);
	}

}
