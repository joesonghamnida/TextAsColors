package colors;
import colors.converters.*;
import colors.Word;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by joe on 1/24/17.
 */
public class NumberConversionTests {

    @Test
    //using ascii
    public void convertBytesToBinary(){
        String testString = "a";
        int testStringValue = 0;
        ArrayList<Word> words = TextToByte.textToByte(testString);
        for(Word word : words){
            testStringValue = word.getValue();
        }

        Assert.assertTrue("01100001".equals(ConvertNumberBase.convertToBinary(testStringValue)));
        Assert.assertTrue("01100010".equals(ConvertNumberBase.convertToBinary(98)));
    }

    @Test
    public void convertBytesToOctal(){

    }

    @Test
    public void convertBytesToHex(){

    }
}
