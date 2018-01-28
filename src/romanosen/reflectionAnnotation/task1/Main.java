package romanosen.reflectionAnnotation.task1;
import java.lang.reflect.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

    firstTask();

    }


    private static void firstTask()
    {
        Class<?> cls=TestClass.class;
        Method[] methods=cls.getDeclaredMethods();
        int rez;
        for(Method md:methods)
        {
            if(md.isAnnotationPresent(Test.class)){

                Test an =md.getAnnotation(Test.class);
                System.out.println("Parameters of annotation" +"  "+ an.a()+"  "+an.b());
                TestClass obj=new TestClass();
                //System.out.println(an.a()+an.b());
                md.setAccessible(true);
                try {
                    System.out.println("Invoke method with annotation parameters");
                    System.out.println(md.invoke(obj, an.a(), an.b()));
                }
                catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    }
}
