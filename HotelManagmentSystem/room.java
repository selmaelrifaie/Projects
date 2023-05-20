package hotelProject;

public class Room {
    
    private int roomNo;
    private String guestName;
    private double roomPrice;
    private int noOfBeds;
    private int daysRented;

        public Room(String guestName, int roomNo, int noOfBeds, double nightlyPrice, int daysRented) {

        this.guestName = guestName;
        this.roomNo = roomNo;
        this.roomPrice = nightlyPrice;
        this.noOfBeds = noOfBeds;
        this.daysRented = daysRented;
    }

        @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

        @Override
    public String toString() {
        String value = "Guest’s name: " + guestName + "\n" + "Room number: " + roomNo + "\n" + "Room beds: " + noOfBeds
                + "\n" + "Price: " + roomPrice + "\n" + "Rented for: " + daysRented + " day";
        return value;
    }

        public double getRoomPrice() {
        return roomPrice;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public int getRoomNo() {
        return roomNo;
    }

}