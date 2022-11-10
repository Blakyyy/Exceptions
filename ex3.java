

public class ex3 {
 public static void main(String[] args) {
    int [][] twoDimArray = {{0,1}, {1,0}};
    System.out.println(result(twoDimArray));
    } 
    
    public static int result(int[][] twoDimArray){
        if(twoDimArray.length != twoDimArray[0].length) {
            throw new RuntimeException("Not square array");
        }
        int result = 0;
        for(int i = 0; i < twoDimArray.length; i++){
            for(int j = 0; j < twoDimArray[i].length; j++) {
                if(twoDimArray[i][j] == 0 || twoDimArray[i][j] == 1) {
                    result += twoDimArray[i][j];
                }
                else {
                    throw new RuntimeException("Wrong value in the array");
                }
            }
        }
        return result;
    }

}
