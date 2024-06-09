import java.util.HashMap;
import java.util.Map;

public class HotelReservationSystem {
    private Map<String, Reservation> reservations;

    public HotelReservationSystem() {
        this.reservations = new HashMap<>();
    }

    public void addReservation(String reservationCode, String hotelName, int roomNumber, String checkInDate, String checkOutDate) {
        Reservation reservation = new Reservation(hotelName, roomNumber, checkInDate, checkOutDate);
        reservations.put(reservationCode, reservation);
    }

    public Reservation getReservation(String reservationCode) {
        return reservations.get(reservationCode);
    }

    public void removeReservation(String reservationCode) {
        reservations.remove(reservationCode);
    }

    private class Reservation {
        private String hotelName;
        private int roomNumber;
        private String checkInDate;
        private String checkOutDate;

        public Reservation(String hotelName, int roomNumber, String checkInDate, String checkOutDate) {
            this.hotelName = hotelName;
            this.roomNumber = roomNumber;
            this.checkInDate = checkInDate;
            this.checkOutDate = checkOutDate;
        }

        public String getHotelName() {
            return hotelName;
        }

        public int getRoomNumber() {
            return roomNumber;
        }

        public String getCheckInDate() {
            return checkInDate;
        }

        public String getCheckOutDate() {
            return checkOutDate;
        }
    }

    // Função hash original para gerar o código da reserva
    public String generateReservationCode() {
        // Você pode usar uma combinação de letras e números para gerar um código único
        return String.valueOf(System.currentTimeMillis()) + String.valueOf((int) (Math.random() * 1000));
    }

    // Tratamento de colisões
    public void handleCollision(String reservationCode, Reservation newReservation) {
        // Verificar se a reserva anterior foi cancelada
        Reservation existingReservation = reservations.get(reservationCode);
        if (existingReservation!= null && existingReservation.isCancelled()) {
            // Substituir a reserva cancelada pela nova reserva
            reservations.put(reservationCode, newReservation);
        } else {
            // Gerar um novo código de reserva para a nova reserva
            String newReservationCode = generateReservationCode();
            reservations.put(newReservationCode, newReservation);
        }
    }
}