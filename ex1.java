
public class ex1 {
    public static final int MIN_LENTH = 3;
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] exArr = {};
        System.out.println(arrLen(exArr)); 
    }

    public static int arrLen(int[] array) {
        if(array != null) {
            if(array.length >= MIN_LENTH){
                return array.length;
            }
        }
        return -1;
    }
}