import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class hw1sem3 {
    public static void main(String[] args) {
        askForInfo();
    }

    public static String askForInfo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write your surname, name, patronymic, date of birth(dd.mm.yyyy), telephone number, gender(M/F)\nEverything must be writed with spaces in between!!");
        String allInfo = scanner.nextLine();
        scanner.close();
        if(checkForSpaces(allInfo) == true){
            if(checkForDateOfBrith(allInfo) == true){
                if(checkForTelNumber(allInfo) == true){
                    if(checkForGender(allInfo) == true) {
                        writeToFile(allInfo);
                    }
                }
            }
        }
        return allInfo;


    }

    private static boolean checkForSpaces(String allInfo){
        String[] allInfoArray = allInfo.split(" ");
        if(allInfoArray.length == 6) {
            return true;
        }
        else if(allInfoArray.length > 6){
            throw new RuntimeException("You wrote more information than we asked for!");
        }
        else if(allInfoArray.length < 6){
            throw new RuntimeException("Not enough information");
        }
        return false;
        
    }

    private static boolean checkForDateOfBrith(String allInfo){
        String[] allInfoArray = allInfo.split(" ");
        if(allInfoArray[3].length() != 10){
            throw new RuntimeException("Not valid input of Date of Birth. Its should be this format: dd.mm.yyyy");
        }
        return true;
    }

    private static boolean checkForTelNumber(String allInfo){
        String[] allInfoArray = allInfo.split(" ");
        try {
            Long.parseLong(allInfoArray[4]);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Not valid format of telephone number. Its should contain only numbers without any simbols. Ex: 89039966170");
        }
        return false;
    }

    private static boolean checkForGender(String allInfo){
        String[] allInfoArray = allInfo.split(" ");
        if(allInfoArray[5].equals("M") || allInfoArray[5].equals("m") || allInfoArray[5].equals("F") || allInfoArray[5].equals("f")){
            return true;
        }
        else{
            throw new RuntimeException("Not valid input for gender. Please write M/F");
        }
    }
    
    private static void writeToFile(String allInfo){
        String[] allInfoArray = allInfo.split(" ");
        try (BufferedWriter outStream= new BufferedWriter(new FileWriter(allInfoArray[0] + ".txt", true))){
            for(int i = 0; i < allInfoArray.length; i++){
                outStream.write("<");
                outStream.write(allInfoArray[i]);
                outStream.write(">");
            }
            outStream.write("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}
