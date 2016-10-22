package firstSpring;

/**
 * Created by deft on 22.10.2016.
 */
public class LabRat {
    private String text;
    private String name;

    public LabRat(String text) {
        this.text = text;
    }

    public void sayHi(){
        System.out.println(text);
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
