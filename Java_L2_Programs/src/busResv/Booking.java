package busResv;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;
public class Booking {
    String passengerName;
    int busNo;
    Date date;
    Booking() {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name of passengr: ");
        passengerName = sc.next();
        System.out.println("Enter Bus no: ");
        busNo =sc.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String dateInput=sc.next();
        SimpleDateFormat df=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=df.parse(dateInput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity=0;
        for(Bus b:buses){
            if(b.getBusNo()==busNo){
                capacity=b.getCapacity();
            }
        }
        int booked=0;
        for(Booking book:bookings){
            if(book.busNo==busNo && book.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity;
    }
}
