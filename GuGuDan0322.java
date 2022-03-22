import java.util.Scanner;

public class GuGuDan0322 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int j= sc.nextInt();
			for(int i=1; i<10; i++){
				
				System.out.println(j+"*"+i+"="+(j*3));
			}
	}

}
