public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping is cleaning room number: " + roomNumber);
    }

    @Override
    public void performService() {
        System.out.println("Performing housekeeping service...");
    }
}
