
public class AlternateColors {
    public static void main(String[] args) {
        long r = 3;
        long g = 4;
        long b = 5;
        long k = 4;
        String result = getColor(r, g, b, k);
        System.out.println(result);
    }

    public static String getColor(long r, long g, long b, long k){
        
        long count_r = r;
        long count_g = g;
        long count_b = b;
        
        String final_ball = null;

        while (true) {
            if (k > 0) {
                if (count_r > 0) {
                    count_r -= 1;
                    if (k == 1) {
                        final_ball = "RED";
                        return final_ball;
                    }
                    k--;
                }
                if (count_g > 0) {
                    count_g -= 1;
                    if (k == 1) {
                        final_ball = "GREEN";
                        return final_ball;
                    }
                    k--;
                    
                }
                if (count_b > 0) {
                    count_b -= 1;
                    if (k == 1) {
                        final_ball = "BLUE";
                        return final_ball;
                    }
                    k--;
                }
        }

    }
}
}
