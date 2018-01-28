package romanosen.reflectionAnnotation.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        String inputText="Second task test string";
        TextContainer textc=new TextContainer(inputText);
        Class<?> cls=TextContainer.class;
        TextContainer tc=new TextContainer(inputText);
        if(cls.isAnnotationPresent(SaveProperies.class)){
            SaveProperies sp=cls.getAnnotation(SaveProperies.class);
            Method[] methods=TextContainer.class.getDeclaredMethods();
            for(Method md:methods)
            {
                if(md.isAnnotationPresent(Saver.class))
                {
                try {
                    md.invoke(tc,sp.filepath());
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                }
            }
        }
    }
}
