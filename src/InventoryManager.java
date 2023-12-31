import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {

	List<Product> soldProductsList = new CopyOnWriteArrayList<Product>();
	List<Product> purchasedProductsList = new ArrayList<Product>();

	public void populateSoldProducts() {
		for(int i = 0; i < 1000; i++) {
			Product prod = new Product(i, "test_product_" + i);
			soldProductsList.add(prod);
			System.out.println("ADDED: " + prod);
			try {
				Thread.sleep(10);	// The thread will pause for 10ms and then will continue again
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void displaySoldProducts() {
		for(Product product : soldProductsList) {
			System.out.println("PRINTING THE SOLD: " + product);
			try {
				Thread.sleep(10); // The thread will pause for 10ms and then will continue again
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}