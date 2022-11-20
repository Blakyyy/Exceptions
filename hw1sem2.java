import java.util.Scanner;


public class hw1sem2 {
    public static void main(String[] args) {
        askForNum();
    }

    public static float askForNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a float number: ");
        String strNumber = scanner.nextLine();
        while(!isFloat(strNumber)){
            System.out.println("You wrote incorrect value, please try again");
            strNumber = scanner.nextLine();
        }
        System.out.println("You wrote a correct number: " + strNumber);
        scanner.close();
        return Float.parseFloat(strNumber);
    }

    public static boolean isFloat(String str){
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
