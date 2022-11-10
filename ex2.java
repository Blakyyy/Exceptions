

public class ex2 {
    public static final int MIN = 3;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(findElement(arr, 10));
    }
    public static int findElement(int[] array, int num){
        if(array == null) {
            return -3;
        }
        if(array.length > MIN) {
            for(int i = 0; i < array.length; i++) {
                if(array[i] == num) {
                    return i;
                }
            }
            return -2;
        }
        return -1;
    }
}
