package romanosen.reflectionAnnotation.task3;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Car lada=new Car("Lada","Kalina",3000);
        try {
            Serializer.serialize(lada);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
