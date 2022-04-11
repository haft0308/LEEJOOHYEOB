package Practice;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stu=new Students();
		
		stu.name="이주협";
		stu.korea=90;
		stu.english=80;
		stu.math=93;
		
		System.out.println(stu.total(stu.korea, stu.english, stu.math));
		
		Students [] student=new Students[3];
		
		
		int i, num1, num2, num3;
		for(i=0; i<3; i++) {
			student[i]=new Students();
			
			/*if(student[i]==student[0])
			{
				student[i].total(34, 64, 46);
			}
			else if(student[i]==student[1])
			{
				num2=student[i].total(70, 80, 70);
			}
			else {
				num3=student[i].total(50,30,20);
			}*/
		
		}
		
		/*for(i=0; i<3; i++) {
			System.out.println(student[i].total(34, 56, 60));
			System.out.println(student[i].total(46, 68, 90));
			System.out.println(student[i].total(98, 35, 59));
		}*/		
	}

}

class Students{
	
	String name;
	int korea;
	int english;
	int	math;
	
	int total(int a, int b, int c) {
		int sum=0;
		sum=a+b+c;
		
		return sum;
	}
	
	
}
