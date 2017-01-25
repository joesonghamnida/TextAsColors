package colors.converters;

import colors.Word;
import colors.converters.*;

import java.util.ArrayList;

/**
 * Created by joe on 1/24/17.
 */
public class ConvertBytesToBase {

    public static ArrayList<Word> convertBytesToBase(ArrayList<Word> bytes, String base) {

        ArrayList<Word> convertedWords = new ArrayList<>();

        String convertedValue = "";
        for (Word word : bytes) {
            if (base.equals("Binary")) {
                convertedWords.add(convertToBinary(word, convertedValue));
            } else if (base.equals("Octal")) {
                convertedWords.add(convertToOctal(word,convertedValue));
            } else if (base.equals("Hex")) {
                convertedWords.add(convertToHex(word,convertedValue));
            }
        }
        return convertedWords;
    }

    public static Word convertToBinary(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToBinary(word.getText().charAt(i));
        }
        return new Word(word.getText(), convertedValue, word.getAsciiValue(),convertedValue,"0","0");
    }

    public static Word convertToOctal(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToOctal(word.getText().charAt(i));
        }
        return new Word(word.getText(), convertedValue, word.getAsciiValue(),"0",convertedValue,"0");
    }

    public static Word convertToHex(Word word, String convertedValue) {
        for (int i = 0; i < word.getText().length(); i++) {
            convertedValue += ConvertNumberBase.convertToHex(word.getText().charAt(i));
        }
        return new Word(word.getText(), convertedValue, word.getAsciiValue(),"0","0",convertedValue);
    }
}



