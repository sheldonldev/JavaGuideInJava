import java.lang.reflect.Method;
import examples.InterfaceExample;

public class PlayGround {

    public static void main(String[] args) {
        Class<?> cls = InterfaceExample.class;
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("List of methods in class " + cls.getName());
        for (Method method: methods){
            System.out.println(method.getName());
        }
    } 
}

