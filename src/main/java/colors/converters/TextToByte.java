package colors.converters;

import colors.Word;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

/**
 * Created by joe on 1/21/17.
 */
public class TextToByte {

    public static ArrayList<Word> textToByte(String rawText){

        ArrayList<Word> byteArrayList = new ArrayList<>();
        int holding = 0;

        String[] words = splitString(rawText);

        for(int i = 0; i < words.length;i++){
            byte[] bytes = words[i].getBytes();
            for (Byte b : bytes){
                holding = holding + b;
            }
            byteArrayList.add(new Word(words[i],holding));
        }
        return byteArrayList;
    }

    public static String[] splitString(String rawText){

        String[] words = rawText.split(" ");

        return words;
    }
}
