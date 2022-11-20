import java.util.Scanner;

public class hw4sem2 {
    public static void main(String[] args) {
        StrMethod();
    }

    public static void StrMethod(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        if(str.equals("")){
            throw new RuntimeException("You cant enter empty string");
        }
        scanner.close();
    }
}
