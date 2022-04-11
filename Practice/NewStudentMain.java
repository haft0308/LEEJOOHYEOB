package Practice;

public class NewStudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewStudent NS=new NewStudent();
		NS.name="이주협";
		NS.ban=5;
		NS.no=35;
		NS.music=98;
		NS.math=68;
		
		NewStudent []ns=new NewStudent[3];
		int i;
		for(i=0; i<3; i++) {
			ns[i]=new NewStudent();
		}
		
		ns[0].name="피카츄";
		ns[0].ban=3;
		ns[0].no=25;
		ns[0].music=32;
		ns[0].math=53;
		
		ns[1].name="파이리";
		ns[1].ban=5;
		ns[1].no=4;
		ns[1].music=32;
		ns[1].math=57;
		
		ns[2].name="꼬부기";
		ns[2].ban=4;
		ns[2].no=7;
		ns[2].music=87;
		ns[2].math=69;
		int k;
		for(k=0; k<3; k++) {
			System.out.print(ns[k].getTotal()+"\t");
			System.out.println(ns[k].getAverage());
		}
	}

}

class NewStudent{
	String name;
	int ban;
	int no;
	int music;
	int math;
	
	int getTotal () {
		int sum;
		sum=music+math;
		return sum;
	}
	
	float getAverage() {
		float avg;
		avg=(music+math)/2;
		return avg;
	}
	
}