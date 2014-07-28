import org.junit.Test;

/**
 * Created by zhangjie on 14-7-28.
 */
public class LearningTest {
    public static interface A {
        public void hello();
    }
    public static class A1 implements A{
        @Override
        public void hello() {

        }
    }
    public static class A11 extends A1{
        @Override
        public void hello() {

        }
    }
    @Test
    public void testDeclaredMethods(){

    }
}
