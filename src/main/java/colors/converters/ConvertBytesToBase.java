package colors.converters;

import colors.Word;
import colors.converters.*;

import java.util.ArrayList;

/**
 * Created by joe on 1/24/17.
 */
public class ConvertBytesToBase {

    public static ArrayList<Word> convertBytesToBase(ArrayList<Word> bytes) {

        ArrayList<Word> convertedWords = new ArrayList<>();

        String convertedValue = "";
        for (Word word : bytes) {
                String binary = convertToBinary(word, convertedValue);
                String octal = convertToOctal(word,convertedValue);
                String hex = convertToHex(word,convertedValue);
                convertedWords.add(new Word(word.getText(), word.getAsciiValue(), binary, octal, hex));

        }
        return convertedWords;
    }

    public static String convertToBinary(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToBinary(word.getText().charAt(i)) + " ";
        }
        return convertedValue;
    }

    public static String convertToOctal(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToOctal(word.getText().charAt(i)) + " ";
        }
        return convertedValue;
    }

    public static String convertToHex(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToHex(word.getText().charAt(i)) + " ";
        }
        return convertedValue;
    }
}



