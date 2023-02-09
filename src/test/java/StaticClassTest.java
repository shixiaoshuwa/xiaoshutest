import main.java.com.dapi.BasicJava.StaticClass;

/**
 * 静态内部类测试类
 *
 * @auther Seb's
 * @date 2023/01/13 16:47
 */
public class StaticClassTest {
    public static void main(String[] args) {
        StaticClass staticClass = new StaticClass(5);
        StaticClass.InnerClass innerClass = new StaticClass.InnerClass(55);
        staticClass.show();
        innerClass.show();
    }
}
