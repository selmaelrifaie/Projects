package hotelProject;
public class Hotel {

        private String name;
        private Room[] theRooms;
        private int roomsRented;

        
        public Hotel(String name, int totalRooms) {
            this.name = name;
            theRooms = new Room[totalRooms];
        }

        // Method to get total rental sales
        public double getTotalRentalSales() {
            double total = 0;
            for (int i = 0; i < theRooms.length; i++) {
                Room room = theRooms[i];
                if (room != null) {
                    total += room.getRoomPrice() * room.getDaysRented();
                }
            }
            return total;
        }

        // method to get average days
        public double getAvgDays() {
            double sum = 0;
            for (int i = 0; i < theRooms.length; i++) {
                Room room = theRooms[i];
                if (room != null) {
                    sum += room.getDaysRented();
                }
            }
            return sum / roomsRented;
        }

        // method to print rental list
        public void printRentalList() {

            for (int i = 0; i < theRooms.length; i++) {
                Room room = theRooms[i];
                if (room != null) {
                    System.out.println(room.toString());
                }
            }
        }

        // method to add reservation
        public void addReservation(Room newRoom) {

            for (int i = 0; i < theRooms.length; i++) {
                Room room = theRooms[i];
                if (room == null) {
                    theRooms[i] = newRoom;
                    roomsRented++;
                    break;
                }
            }
        }

        // method to find reservation
        public void findReservation(int roomNo) {
            for (int i = 0; i < theRooms.length; i++) {
                Room room = theRooms[i];
                if (room.getRoomNo() == roomNo) {
                    System.out.println("Found reservation for room number: " + roomNo);
                    System.out.println(room.toString());
                    return;
                }
            }
            System.out.println("Reservation not found");
        }




        public static void main(String[] args) {
            Hotel hotel1= new Hotel("Hotel1", 5);
            Room room1= new Room("mohamed", 1, 2, 100, 3);
            
            hotel1.addReservation(room1);
            hotel1.getAvgDays();
            System.out.println(hotel1.printRentalList());
        }
}