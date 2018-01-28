package romanosen.reflectionAnnotation.presentationExample;

public class Reflection {
    public static void main(String[] args)throws NullPointerException {
        final Class<?> cls=Test.class;
        if(cls.isAnnotationPresent(MyAnnotation.class))
        {
            System.out.println("Clas is annotated");
        }

        MyAnnotation an =cls.getAnnotation(MyAnnotation.class);



    }
}
