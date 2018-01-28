package romanosen.reflectionAnnotation.task3;
import java.lang.reflect.*;
import java.util.*;



public class Serializer {


    public static void serialize(Object o)
    {

        System.out.println("Serealizing");


        Class<?> cls=o.getClass();



    }

    public static <T> T deserialize(){
        T rezult=null;
        System.out.println("Deserealizing");





        return  rezult;
    }
}
