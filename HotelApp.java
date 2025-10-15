public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Simplified Hotel Management System ===");

        frontDesk.requestValet("ABC-1234");
        frontDesk.requestCleaning(205);
        frontDesk.requestCart(2);
    }
}
