public class ex1sem2 {
    public static void main(String[] args) {
        String arr[][] = {
            { "32", "123", "2" },
            { "1", "4", "3" },
            { "5", "1", "3" }
        };

        System.out.println(sum2d(arr));
    }
    
    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length ; j++) {
            try{
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
                
            } catch (NumberFormatException e) {
                sum += 0;
            }
          }
        }
        return sum;
      }
      
}
