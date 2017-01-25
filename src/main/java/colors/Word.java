package colors;

/**
 * Created by joe on 1/22/17.
 */
public class Word {
    private String text;
    private int asciiValue;
    private String binaryValue;
    private String octalValue;
    private String hexValue;

    public Word() {
    }

    public Word(String text, int asciiValue) {
        this.text = text;
        this.asciiValue = asciiValue;
    }

    public Word(String text, int asciiValue, String binaryValue, String octalValue, String hexValue) {
        this.text = text;
        this.asciiValue = asciiValue;
        this.binaryValue = binaryValue;
        this.octalValue = octalValue;
        this.hexValue = hexValue;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getAsciiValue() {
        return asciiValue;
    }

    public void setAsciiValue(int asciiValue) {
        this.asciiValue = asciiValue;
    }

    public String getBinaryValue() {
        return binaryValue;
    }

    public void setBinaryValue(String binaryValue) {
        this.binaryValue = binaryValue;
    }

    public String getOctalValue() {
        return octalValue;
    }

    public void setOctalValue(String octalValue) {
        this.octalValue = octalValue;
    }

    public String getHexValue() {
        return hexValue;
    }

    public void setHexValue(String hexValue) {
        this.hexValue = hexValue;
    }
}


