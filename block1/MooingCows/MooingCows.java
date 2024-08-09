import java.util.ArrayList;

public class MooingCows {

    public static void main(String[] args) {
        String[] Farmland = {"CCC....", "C......", "....C.C", ".C.CC..", "C......"};
        int result = dissatisfaction(Farmland);
        System.out.println(result);
    }

    public static int dissatisfaction(String[] Farmland){
        ArrayList<int[]> cows = new ArrayList<int[]>();
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Farmland.length; i++) {
            for (int j = 0; j < Farmland[i].length(); j++) {
                if (Farmland[i].charAt(j) == 'C') {
                    int[] axis = {i, j};
                    cows.add(axis);
                }
            }
        }
    
        
        for (int[] k : cows) {
            int sum = 0;
            for (int[] c : cows) {
                sum += Math.pow((k[0]-c[0]),2) + Math.pow((k[1]-c[1]),2);
            }
            if (sum < min) {
                min = sum;
            }
        }
        
        

        return min;

    }
}