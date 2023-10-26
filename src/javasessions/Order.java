package javasessions;

public class Order {
	public int getOrder(String customername, int price, int tax)
	{
		//buss logic:
		System.out.println(customername);
		
		int k=price+tax;
		return k;
	}
	public int getOrder(String customername, int price)
	{
		//buss logic:
		System.out.println(customername);
		
		int k=price;
		return k;
	}

	public static void main(String[] args) {

		Order obj=new Order();
		int p=obj.getOrder("Geeta", 1000, 30);
		System.out.println(p);
		
		int f=obj.getOrder("Seeta", 4000);
		System.out.println(f);
		
		
	}

}
