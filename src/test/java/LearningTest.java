import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zhangjie on 14-7-28.
 */
public class LearningTest {
    @Test
    public void testDeclaredMethods() {
        Class[] classes = {A.class, A1.class, A11.class, A12.class};
        for (Class clazz : classes) {
            System.out.println(clazz.getSimpleName() + Arrays.toString(clazz.getDeclaredMethods()));
        }
    }
    public static interface A {
        public void hello();
    }

    public static class A1 implements A {
        @Override
        public void hello() {

        }
    }

    public static class A11 extends A1 {
        @Override
        public void hello() {

        }
    }

    public static class A12 extends A1 {
    }
}
