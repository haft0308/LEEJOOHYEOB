package Practice;

public class CalcuratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcurator calcu=new Calcurator();
		calcu.x=10;
		calcu.y=6;
		int a=calcu.x;
		int b=calcu.y;
		
		System.out.println(calcu.add(a,b));
		System.out.println(calcu.sub(a,b));
		System.out.println(calcu.mul(a,b));
		System.out.println(calcu.divide(a,b));
		
	}

}

class Calcurator{
	int x;
	int y;
	
	int add(int x, int y) {
		int z;
		z=x+y;
		return z;
		
	}
	int sub(int x, int y) {
		int z;
		z=x-y;
		return z;
	}
	
	int mul(int x, int y) {
		int z;
		z=x*y;
		return z;
	}
	
	float divide(int x, int y) {
		int z;
		z=x/y;
		return z;
	}
}