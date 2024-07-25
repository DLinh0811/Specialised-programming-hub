
public class FunnyFence {
    public static void main(String[] args) {
        int max = fence("|-|-|");
        System.out.println(max);
    }

    public static int fence(String s) {
        int length = 1;
        int max_length = 1;
        int start = 0;
        int end = 1;

        while (end < s.length()) {
            if (s.charAt(start) == s.charAt(end)) {
                length = 1;
            }else{
                length++;
                if (max_length < length) {
                    max_length = length;
                }
            }
            start = end;
            end++;
        }
        

        return max_length;
    }
    
}