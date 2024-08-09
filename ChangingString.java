import java.util.ArrayList;
import java.util.Collections;

public class ChangingString {
    public static void main(String[] args) {
        String A = "ba";
        String B = "ab";
        int K  = 2;
        int result = distance(A, B, K);
        System.out.println(result);

    }
    public static int distance(String A, String B, int K){
        int sum_char = 0;
        ArrayList<Integer> distance_record = new ArrayList<Integer>();
        for (int i = 0; i < A.length(); i++) {
            int sum = Math.abs(A.charAt(i) - B.charAt(i));
            distance_record.add(sum);
        }
        Collections.sort(distance_record, Collections.reverseOrder());
        for (int j = 0; j < K; j++) {
            if (distance_record.get(j) == 0) {
                distance_record.set(j, 1);
            }else{
                distance_record.set(j, 0);
            }
        }
        
        for (int i = 0; i < distance_record.size(); i++) {
            sum_char += distance_record.get(i);}
        
        return sum_char;
    }
    
}
