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
        String testString = "a"; //97
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
        //System.out.println(ConvertNumberBase.convertToOctal(97));
        Assert.assertTrue("141".equals(ConvertNumberBase.convertToOctal(97)));
    }

    @Test
    public void convertBytesToHex(){
        //System.out.println(ConvertNumberBase.convertToHex(97));
        Assert.assertTrue("61".equals(ConvertNumberBase.convertToHex(97)));
    }
}
