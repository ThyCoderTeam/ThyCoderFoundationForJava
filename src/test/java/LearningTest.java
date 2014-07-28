import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zhangjie on 14-7-28.
 */
public class LearningTest {
    @Test
    public void testDeclaredMethods() {
        System.out.println("A" + Arrays.toString(A.class.getDeclaredMethods()));
        System.out.println("A1" + Arrays.toString(A1.class.getDeclaredMethods()));
        System.out.println("A11" + Arrays.toString(A11.class.getDeclaredMethods()));
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
