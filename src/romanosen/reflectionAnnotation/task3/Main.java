package romanosen.reflectionAnnotation.task3;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Car lada=new Car("Lada","Kalina",3000);


        Car emptyobj=null;
        try {
            Serializer.serialize(lada);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
             emptyobj=Serializer.deserialize(Car.class,"src//romanosen//reflectionAnnotation//task3//fields.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }


        if(emptyobj!=null) {
            System.out.println(emptyobj.brand + emptyobj.model);
        }
    }
}
