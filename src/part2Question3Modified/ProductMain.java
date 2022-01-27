package part2Question3Modified;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameofProduct = "Samsung S20";
		String productDescription = "Phone that suits your needs";
		double price = 1005.75;
		ProductDetails productDetails = new ProductDetails();
		productDetails.printProductName(nameofProduct);
		productDetails.printDescription(productDescription);
		productDetails.printPriceOfProduct(price);
	}

}
