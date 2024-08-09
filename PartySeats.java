import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class PartySeats {
    public static void main(String[] args) {
        String[] attendees = {"BOB boy","SUZIE girl","DAVE boy","JO girl","AL boy","BOB boy","CARLA girl","DEBBIE girl"};
        String[] result = seating(attendees);
        System.out.println(Arrays.toString(result));
    }

    public static String[] seating(String[] attendees){
        
        ArrayList<String> Boys = new ArrayList<String>();
        ArrayList<String> Girls = new ArrayList<String>();
        int index_girls = 0;
        int index_boys = 0;
        for (String attendee : attendees) {
            if (attendee.contains("boy")) {
                Boys.add(attendee.split(" ")[0]);
                
            }else{
                Girls.add(attendee.split(" ")[0]);
            }
        }

        Collections.sort(Boys);
        Collections.sort(Girls);

        if (Boys.size() == Girls.size() && (attendees.length + 2) % 2 == 0) {
            
            String[] seat_order = new String[attendees.length + 2];
            seat_order[0] = "HOST";
            seat_order[(seat_order.length/2)+1] = "HOSTESS";
            System.out.println(seat_order);
            for (int i = 1; i < seat_order.length; i+=2) {
                if (i == ((seat_order.length/2)+1)) {
                    continue;
                }else{
                    if (index_girls < Girls.size()) {
                        seat_order[i] = Girls.get(index_girls);
                        index_girls ++;
                    }
                }
            }
            for (int i = 2; i < seat_order.length; i+=2) {
                if (i == ((seat_order.length/2)+1)) {
                    continue;
                }else{
                    if (index_boys < Boys.size()) {
                        seat_order[i] = Boys.get(index_boys);
                        index_boys ++;
                    }
                }
            }
            return seat_order;
        }
        else{
            return new String[0];
        }
          
    }
}
