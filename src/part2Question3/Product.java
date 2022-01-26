package part2Question3;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameofProduct = "Samsung S20";
		String productDescription = "Phone that suits your needs";
		double price = 1005.75;
		ProductName ptName = new ProductName();
		ProductDesription pDesription = new ProductDesription();
		ProductPrice productPrice = new ProductPrice();
		ptName.productName(nameofProduct);
		pDesription.description(productDescription);
		productPrice.priceOfProduct(price);
	}

}
