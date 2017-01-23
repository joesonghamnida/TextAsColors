package colors;

/**
 * Created by joe on 1/22/17.
 */
public class Word {
    private String text;
    private int value;

    public Word() {
    }

    public Word(String text, int value) {
        this.text = text;
        this.value = value;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
