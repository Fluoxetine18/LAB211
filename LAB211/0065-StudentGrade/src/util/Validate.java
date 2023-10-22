package util;
import java.util.Scanner;
public class Validate {

    static Scanner scanner = new Scanner(System.in);
    public static final String REGEX_STRING = "[a-zA-Z0-9 ]+";
    public static final String REGEX_YN = "[yYnN]";

    public static double getDouble(String messageInfo, String firstError, String secondError,
            String thirdError, double min, double max) {
       do {
            try {
                System.out.print(messageInfo);
                double number = Integer.parseInt(scanner.nextLine());
                if(number > max) {
                    System.out.println(firstError);
                } else if(number < min) {
                    System.out.println(secondError);
                } else{
                    return number;
                }
            } catch (NumberFormatException e) {
                System.out.println(thirdError);
            }
        } while (true);
    }

    public static String getString(String messageInfo, String messageError, final String REGEX) {
        do {
            System.out.print(messageInfo);
            String str = scanner.nextLine();
            if (str.matches(REGEX)) {
                return str;
            }
            System.out.println(messageError);
        } while (true);
    }

    public static boolean checkYesNo() {
        String result = Validate.getString("Do you want to enter more student information?(Y/N):",
                "Must input y or n", Validate.REGEX_YN);

        if (result.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }
}
