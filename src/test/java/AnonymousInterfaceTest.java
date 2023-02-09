import main.java.com.dapi.BasicJava.AnonymousInterface;

/**
 * 匿名内部类测试类
 *
 * @auther Seb's
 * @date 2023/01/13 16:54
 */
public class AnonymousInterfaceTest {

    public static void main(String[] args) {
        //写法1：常规写法
        AnonymousInterface anonymousInterface = new AnonymousInterface() {
            @Override
            public void show() {
                System.out.println("这是 匿名内部类 常规写法");
            }
        };
        anonymousInterface.show();


        //写法2：lambda写法
        AnonymousInterface anonymousInterface1 = () -> {
            System.out.println("这是 匿名内部类 lambda写法");
        };
        anonymousInterface1.show();
    }

}
