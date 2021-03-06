package romanosen.reflectionAnnotation.task2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SaveProperies(filepath = "src//romanosen//reflectionAnnotation//task2//text.txt")
public class TextContainer {
    private String text;

    public TextContainer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Saver
    public void save(String filepath){


        try( BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

            writer.write(text);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }

        }









