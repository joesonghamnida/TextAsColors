package colors.converters;

/**
 * Created by joe on 1/24/17.
 */
public class ConvertNumberBase {

    //using ascii
    //for the moment have to run on individual characters
    public static String convertToBinary(int value){
        String binary = "";
        int denominator = 128;
        while(denominator > 0){
            int remainder = value % (denominator);
            int placeHolder = remainder;

            remainder = checkBinaryRemainder(remainder, value);
            binary += String.valueOf(remainder);

            value = placeHolder;
            denominator = denominator / 2;
        }
        return binary;
    }

    public static int checkBinaryRemainder(int remainder, int value){
        if(remainder == value){
            remainder = 0;
        }
        else{
            remainder = 1;
        }
        return remainder;
    }

    public static String convertToOctal(int value){
        String octal = Integer.toOctalString(value);
        return octal;
    }

    public static String convertToHex(int value){
        String hex = Integer.toHexString(value);
        return hex;
    }
}
