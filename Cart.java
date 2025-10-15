public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage cart(s).");
    }

    @Override
    public void performService() {
        System.out.println("Performing cart service...");
    }
}
