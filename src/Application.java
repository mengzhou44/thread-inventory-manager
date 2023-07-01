

public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InventoryManager manager = new InventoryManager();

		Thread inventoryTask = new Thread(() -> manager.populateSoldProducts());

		Thread displayTask = new Thread(() -> manager.displaySoldProducts());

		inventoryTask.start();		// 1st Thread

        Thread.sleep(2000);

		displayTask.start();		// 2nd Thread

	}

}