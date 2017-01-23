package colors.consoleColors;

import colors.Word;

import java.util.ArrayList;

/**
 * Created by joe on 1/22/17.
 */
public class PrintConsoleColors {

    public static void printConsoleColors(ArrayList<Word> words){

        int average = 0;
        for(Word word : words){
            average = ((word.getValue() / word.getText().length()) / 2);
            selectColor(average, word, 2);
            average = ((word.getValue() / word.getText().length()) / 8);
            selectColor(average, word, 8);
            average = ((word.getValue() / word.getText().length()) / 10);
            selectColor(average, word, 10);
            average = ((word.getValue() / word.getText().length()) / 16);
            selectColor(average, word, 16);
        }
    }

    public static void selectColor(int average, Word word, int base){
        String ANSI_RESET = "\u001B[0m";
        String ANSI_BLACK = "\u001B[30m";
        String ANSI_RED = "\u001B[31m";
        String ANSI_GREEN = "\u001B[32m";
        String ANSI_YELLOW = "\u001B[33m";
        String ANSI_BLUE = "\u001B[34m";
        String ANSI_PURPLE = "\u001B[35m";
        String ANSI_CYAN = "\u001B[36m";
        String ANSI_WHITE = "\u001B[37m";

        System.out.println("Base: "+base);

        if(average <= 30){
            System.out.println(ANSI_BLACK+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average >= 31 && average <= 50){
            System.out.println(ANSI_RED+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average >50 && average <= 70){
            System.out.println(ANSI_GREEN+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average > 70 && average <= 90){
            System.out.println(ANSI_YELLOW+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average > 90 && average <= 110){
            System.out.println(ANSI_BLUE+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average > 110 && average <= 130){
            System.out.println(ANSI_PURPLE+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else if(average > 130 && average <= 150){
            System.out.println(ANSI_CYAN+word.getText()+" Average: "+average+ANSI_RESET);
        }
        else{
            System.out.println(ANSI_WHITE+word.getText()+" Average: "+average+ANSI_RESET);
        }
    }
}
