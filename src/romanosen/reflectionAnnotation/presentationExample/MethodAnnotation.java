package romanosen.reflectionAnnotation.presentationExample;
import java.lang.annotation.*;


@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MethodAnnotation {

}
