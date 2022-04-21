package product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		Product[] p= new Product[3];
		p[0]=new TV();//부모 클래스 Product의 객체 배열 각 요소에 TV, 컴퓨터, 오디오 등 자식 클래스를 업캐스팅 한다.
		p[1]=new Computer();//다만 배열 요소의 메모리는 부모 클래서 메모리가 아니라 자식 클래스로 할당된다. type은 부모 클래스를 쓴다.
		p[2]=new Audio();// 값은 자식클래스의 생성자 안에 있는 것을 쓴다.
		
		for (int i=0; i<3; i++)
		{
			b.buy(p[i]);
		}
		b.print();

	}

}

class Product
{
	int price; //제품 가격
	int bonusPoint;//보너스 점수
}

class TV extends Product
{
	int channel;
	int volume;
	TV()
	{
		price=100;
		bonusPoint =100;
		
	}
}

class Computer extends Product
{
	int cpu;
	int ran;
	Computer()
	{
		price=200;
		bonusPoint=200;
	}
}

class Audio extends Product
{
	int volume;
	int speaker;
	Audio()
	{
		price=50;
		bonusPoint=50;
	}
	
}

class Buyer//물건사는 사람
{
	int money=10000;
	int bonusPoint=0;
	
	void buy(Product p)
	{
		money=money-p.price;
		bonusPoint=bonusPoint+p.bonusPoint;
	}
	
	void print()
	{
		System.out.println("money="+money);
		System.out.println("bonusPoint="+bonusPoint);
	}
}