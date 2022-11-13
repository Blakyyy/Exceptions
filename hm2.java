

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке
// Если длины массивов не равны, необходимо как-то оповестить пользователя

public class hm2 {
    public static void main(String[] args) {
        int[] firstArray = {1, 2, 3, 4,};
        int[] secondArray = {10, 9, 8, 7};
        int[] diff = difference(firstArray, secondArray);
        for (int i : diff) {
            System.out.println(i);
        }
    }

    public static int[] difference(int[] firstArray, int[] secondArray){
        int[] newArray = new int[firstArray.length];
        if(firstArray.length != secondArray.length) {
            throw new RuntimeException("The length of the arrays are not equal");
        }
        for(int i = 0; i < firstArray.length; i++){
            newArray[i] = firstArray[i] - secondArray[i];
        }
        return newArray;
    }
}
