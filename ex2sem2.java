import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex2sem2 {
    public static void main(String[] args) {
        writeToFile();
        String[][] res = saveToArr();
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.println((res[i][j]));
            }
        }
    }

    public static void writeToFile() {
        try ( FileWriter writer = new FileWriter("newFile.txt")){
            writer.write("Анна=4\nЕлена=5\nМарина=6\nВладимир=?\nКонстантин=?\nИван=4");
        } catch (IOException e) {
            System.out.println( "an error ocurred");
        }
    }

    public static String[][] saveToArr(){
        String[][] arr = new String[6][2];
        int i = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("newFile.txt"))) {
            String line;
            while((line = br.readLine()) != null && i < arr.length) {
                String[] array = line.split("=");
                arr[i][0] = array[0];
                if("?".equals(array[1])){
                    arr[i][1] = String.valueOf(arr[i][0].length());
                }
                else{
                    arr[i][1] = array[1];
                }
                i++;
            }
            
        } catch (IOException e) {
           e.printStackTrace();
        }
        return arr;
    }

}
