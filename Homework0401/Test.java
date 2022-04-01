

public class Test {
	
	public static void main(String[] args) {
		
		/*int z;
		z=add(5,6);
		System.out.println(z);
		
		print();
		
		int w;
		w=retInt();
		System.out.println(w);
		
		noRet(4);*/
	
		/*int result_int=0;
		float result_float=0;
		int a=3, b=5;
		float x=3.2f, t=8.5f;*/
		String result_string=null;
		String str1= new String("aaa");
		String str2= new String("bbb");
		
		int result_int=add_int(5,9);
		System.out.println(result_int);
		
		float result_float=add_float(3.324f,53.234234f);
		System.out.println(result_float);
		
		result_string=add_string(str1, str2);
		System.out.println(result_string);
		
		
	}

	/*static int add(int a, int b) {
		int c;
		c=a+b;
		return c;
		
	}
	
	static void print() {
		System.out.println("before return");
		return;
	}
	
	static int retInt() {
		int x=10;
		return x;
		
	}
	
	static void noRet(int x) {
		System.out.println("x="+x);
	}*/
	
		
		
		
	static int add_int(int a, int b) {
		int c=0;
		c=a+b;
		return c;
	}
	
	static float add_float(float a, float b) {
		float c=0;
		c=a+b;
		return c;
	}
	
	static String add_string(String str, String str2) {
		String str3=null;
		str3 =str+str2;
		return str3;
	}
	
}
