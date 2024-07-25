// package block1.Reppity;
public class Reppity {

    public static void main(String[] args) {
        int max_length = longestRep("ABCDEXXXYYYZZZABCDEZZZYYYXXX");
        System.out.println(max_length);
    }

    public static int longestRep(String input){
        int start = 0;
        int end = 1;
        int max_length = 0;

        while (end < input.length()) {
            if (input.substring(end).contains(input.substring(start, end))) {
                max_length = input.substring(start, end).length();
            }else{
                start++;
            }   
            end++;
            
        }
        return max_length;
    }
}
