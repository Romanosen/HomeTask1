package romanosen.reflectionAnnotation.task1;

public class TestClass {
    public TestClass() {
    }
    @Test(a=2,b=5)
    private String test(int a,int b){return "Printing from annotated method:\n Annotation parameters are:   "+a+"   "+b;}
}
