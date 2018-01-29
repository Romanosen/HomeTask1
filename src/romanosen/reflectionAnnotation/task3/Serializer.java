package romanosen.reflectionAnnotation.task3;
import java.io.*;
import java.lang.reflect.*;
import java.util.*;



public class Serializer {


//    private Object .;

    public static void serialize(Object o) throws IOException, IllegalAccessException {

        System.out.println("Serealizing");


        Class<?> cls = o.getClass();

        StringBuilder sb=new StringBuilder();

        Field[] fields= cls.getDeclaredFields();
        for(Field f:fields)
        {
            if(f.isAnnotationPresent(Save.class))
            {
                sb.append(f.getName()+"="+f.get(o).toString()+"\n");
            }
        }

        if (sb!=null)
        {
           try( BufferedWriter bw = new BufferedWriter(new FileWriter("src//romanosen//reflectionAnnotation//task3//fields.txt")))
           {
               bw.write(sb.toString());

           }
           catch (IOException ex)
           {
               ex.printStackTrace();
           }


        }





    }

    public static <T> T deserialize(Class<T> icls, String filepath) throws FileNotFoundException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        System.out.println("Deserealizing");

        StringBuilder sb=new StringBuilder();
        T outputCar=(T)icls.newInstance();


        boolean flag=true;

        try(BufferedReader br = new BufferedReader(new FileReader(filepath)))
        {
            while(flag) {
                String temp=br.readLine();
                if(temp!=null) {
                    sb.append(temp + ";");
                }
                else{
                    flag=false;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] sfields=sb.toString().split(";");
        for(String s:sfields)
        {
            String[] pair=s.split("=");

            try {
                Field field= icls.getDeclaredField(pair[0]);

                if (Modifier.isPrivate(field.getModifiers())) {
                    field.setAccessible(true);
                }

                if (field.isAnnotationPresent(Save.class)) {
                    if (field.getType() == String.class ) {
                         field.set(outputCar,pair[1]);
                    }

                }

            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }

        }


        return outputCar;

        }
}
