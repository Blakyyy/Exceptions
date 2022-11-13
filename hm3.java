//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке


public class hm3 {
    public static void main(String[] args) {
    double[] firstArray = {1, 2, 3, 4, 5};
    double[] secondArray = {10, 9, 8, 7, 6};
    double[] res = result(firstArray, secondArray);
    for (double d : res) {
        System.out.println(d);
    }    
    }

    public static double[] result(double[] firstArray, double[] secondArray){
        
        if(firstArray.length != secondArray.length){
            throw new RuntimeException("The length of the arrays are not equal");
        }
        double[] finalArray = new double[firstArray.length];
        for(int i = 0; i < firstArray.length; i++){
            if(secondArray[i] == 0) {
                throw new RuntimeException("Its impossible to divide by zero");
            }
            finalArray[i] = firstArray[i] / secondArray[i];
        }
        return finalArray;
    }

}
