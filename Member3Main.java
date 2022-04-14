package ThisPractice;

public class Member3Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Member3 m=new Member3("ÀÌµæÈñ", "114", "´ëÇÑ¹Î±¹");
		
		ThisTest t =new ThisTest();
		Member4 m1=new Member4("aaa", "111", "¼­¿ï");
		t.setMember4(m1.getMember4());
		
		Member4 m2=new Member4("bbb", "222", "°æ±â");
		t.setMember4(m2.getMember4());
		
		Member4 m3=new Member4("ccc", "333", "°­¿ø");
		t.setMember4(m3.getMember4());
		t.print();

	}

}

//class Member3
//{
//	String name;
//	String tel;
//	String address;
//	
//	Member3(String name, String tel, String address){
//		this.name=name;
//		this.tel=tel;
//		this.address=address;
//				
//	}
//}

class Member4
{
	String name;
	String tel;
	String address;
	
	Member4(String name, String tel, String address)
	{
		this.name=name;
		this.tel=tel;
		this.address=address;
	}
	
	Member4 getMember4() {
		return this;
	}
	
	void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("address : "+address);
		
	}
}

class ThisTest
{
	Member4[] arr=new Member4[10];
	int cnt=0;
	
	void setMember4(Member4 m)
	{
		arr[cnt++]=m;
	}
	
	void print()
	{
		for(int i=0; i<cnt; i++) {
			arr[i].print();
			System.out.println("----------------------------------");
		}
	}
}