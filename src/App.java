import controllers.ProductController;

public class App {
	
	public static void main(String[] args) {

		ProductController productController = new ProductController();

		productController.register();
	}
}
