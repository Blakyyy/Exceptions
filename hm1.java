
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class hm1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        divideBy0(10);
        array(array);
        ParseInt();
    }

    public static int divideBy0(int num1) {
        return num1/0;
    }

    public static void array(int[] array){
        for(int i = 0; i <= array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void ParseInt(){
        String str = "123o";
        System.out.println(Integer.parseInt(str));
    }
}
