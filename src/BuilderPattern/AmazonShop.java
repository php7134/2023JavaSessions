package BuilderPattern;

public class AmazonShop {

	public static void main(String[] args) {

		Shopping shop=new Shopping();
		
		//sc1:
		shop.login("noname@gmail.com","noman@123")
		.search("Tshirt")
		.addToCart("Tshirt")
		.doPayment("1212 1212 1212 1212", 123)
		.generateOrder()
		.logout();
		
		//sc2:
		shop.login("noname@gmail.com","noman@123")
		.search("macbook")
		.addToCart("macbook")
		.logout();
		
		//sc3:
		shop.login("noname@gmail.com","noman@123")
		.doPayment("1212 1212 1212 1212", 123)
		.generateOrder()
		.logout();
		
		//sc4:
		shop.login("noname@gmail.com","noman@123")
		.logout();
		
	}

}
