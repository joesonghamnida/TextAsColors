package colors.converters;

/**
 * Created by joe on 1/24/17.
 */
public class ConvertNumberBase {

    //using ascii
    public static String convertToBinary(int value){
        String binary = "";
        int denominator = 128;
        while(denominator > 0){
            int remainder = value % (denominator);
            int placeHolder = remainder;

            remainder = checkRemainder(remainder, value);
            binary += String.valueOf(remainder);

            value = placeHolder;
            denominator = denominator / 2;
        }
        return binary;
    }

    public static int checkRemainder(int remainder, int value){
        if(remainder == value){
            remainder = 0;
        }
        else{
            remainder = 1;
        }
        return remainder;
    }

    public static void convertToOctal(){

    }

    public static void convertToHex(){

    }
}
