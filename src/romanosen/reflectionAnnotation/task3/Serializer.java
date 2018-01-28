package romanosen.reflectionAnnotation.task3;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.*;
import java.util.*;



public class Serializer {


    public static void serialize(Object o) throws IOException
    {

        System.out.println("Serealizing");


        Class<?> cls =o.getClass();

        //Car scar= (Car)cls.newInstance();

        StringBuilder sb=new StringBuilder();

        Field[] fields= cls.getDeclaredFields();
        for(Field f:fields)
        {
            if(f.isAnnotationPresent(Save.class))
            {
                sb.append(f.toString());
            }
        }

        if (sb!=null)
        {
            BufferedWriter bw = new BufferedWriter(new FileWriter("src//romanosen//reflectionAnnotationtask3src//fields.txt"));

            bw.write(sb.toString());
            bw.flush();
            bw.close();
        }





    }

    public static Object deserialize(Object o){

        System.out.println("Deserealizing");


        return o;

        }
}
