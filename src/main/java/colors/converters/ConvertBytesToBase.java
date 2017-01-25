package colors.converters;

import colors.Word;
import colors.converters.*;

import java.util.ArrayList;

/**
 * Created by joe on 1/24/17.
 */
public class ConvertBytesToBase {

    public static void convertBytesToBase(ArrayList<Word> bytes, String base) {

        String convertedValue = "";
        for (Word word : bytes) {
            if (base.equals("Binary")) {
                convertToBinary(word, convertedValue);
            } else if (base.equals("Octal")) {
                convertToOctal(word,convertedValue);
            } else if (base.equals("Hex")) {
                convertToHex(word,convertedValue);
            }
        }
    }

    public static void convertToBinary(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToBinary(word.getText().charAt(i));
        }
        word.setValue(convertedValue);
    }

    public static void convertToOctal(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToOctal(word.getText().charAt(i));
        }
        word.setValue(convertedValue);
    }

    public static void convertToHex(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToHex(word.getText().charAt(i));
        }
        word.setValue(convertedValue);
    }
}



