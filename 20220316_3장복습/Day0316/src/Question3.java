
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 아래와 같이 실행하여(에러가 있다면 에러수정하여) 'e'의 문자를 출력할 수 있게 코드를 완성하시오
//		d원래 실행코드
//		char b ='d'
//		char c = b+1
		char b='d';
		char c='d'+1;
			System.out.println((int)'d');
			System.out.println(b);
			System.out.println(c);
//		소문자 'y'를 변수에 할당하고, 대문자 'Y'를 출력할 수 있도록 프로그램 작성
		
		char a='y'; 
			System.out.println((int)a);//y를 int로 변한 값 알아보기 121
		char A='Y';	
			System.out.println((int)A);//Y를 int변한 값으로 알아보기89
			//121-89=32
			System.out.println((char)(a-32));
		
		char D='R';
			System.out.println((int)D);
		char d='r';
			System.out.println((int)d);
			//82+32=114
			System.out.println((char)(D+32));
		
		
	}

}
