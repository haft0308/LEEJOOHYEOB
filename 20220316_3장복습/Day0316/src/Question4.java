import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("숫자 97에서 122사이를 입력하세요. a=97, z=122입니다.");
		int value =sc.nextInt();
		char value2=(char)value;
		if(value>=97&&value<=122) {
			
			System.out.println(value2);
			System.out.println((char)(value2-32));
		}//97에서 122사이의 숫자를 입력 후 소문자로 전환. 소문자 전환 후 32를 빼면 됨.
		
		
		else {
			System.out.println("잘못된 값을 입력하였습니다.");
			
		}
		
		
			
		Scanner SC= new Scanner(System.in);
		//int inputData=sc.nextInt();
		SC.next();//"koheeseon"
		String str=SC.next();//"abc"
		char ch =str.charAt(0);//'a'
			System.out.println((char)(ch-32));
			
		
	}

}
