// package block1.ThrowTheBall;
public class ThrowTheBall {
    public static void main(String[] args) {
        int pass = timesThrown(5, 3, 2);
        // System.out.println(pass); 
    }

    public static int timesThrown(int N, int M, int L) {
        int pass = 0;
        int currentPlayer = 0; 
        int[] receiveCount = new int[N]; // count of ball receptions per player

        while (true) {
            receiveCount[currentPlayer]++;
            if (receiveCount[currentPlayer] == M) {
                return pass;
            }
            pass++;
            if (receiveCount[currentPlayer] % 2 != 0) { //odd - right
                if (currentPlayer - L < 0){
                    currentPlayer = currentPlayer - L + N;
                    
                }else{
                    currentPlayer = currentPlayer - L;
                    
                }
                
            } else {
                if (currentPlayer + L >= N){
                    currentPlayer = currentPlayer + L - N;
                    
                }else{
                    currentPlayer = currentPlayer + L;
                    
                }
                
            }
        }
    
    }
}




