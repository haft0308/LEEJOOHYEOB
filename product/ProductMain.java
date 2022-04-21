package product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer b = new Buyer();
		
		Product[] p= new Product[3];
		p[0]=new TV();//�θ� Ŭ���� Product�� ��ü �迭 �� ��ҿ� TV, ��ǻ��, ����� �� �ڽ� Ŭ������ ��ĳ���� �Ѵ�.
		p[1]=new Computer();//�ٸ� �迭 ����� �޸𸮴� �θ� Ŭ���� �޸𸮰� �ƴ϶� �ڽ� Ŭ������ �Ҵ�ȴ�. type�� �θ� Ŭ������ ����.
		p[2]=new Audio();// ���� �ڽ�Ŭ������ ������ �ȿ� �ִ� ���� ����.
		
		for (int i=0; i<3; i++)
		{
			b.buy(p[i]);
		}
		b.print();

	}

}

class Product
{
	int price; //��ǰ ����
	int bonusPoint;//���ʽ� ����
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

class Buyer//���ǻ�� ���
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