import main.java.com.dapi.BasicJava.GeneralClass;

/**
 * 内部类测试类
 *
 * @auther Seb's
 * @date 2023/01/13 14:47
 */
public class GeneraClassTest {
    public static void main(String[] args) {

        GeneralClass generalClass = new GeneralClass(3);
        // 使用外部类对象 实例化 内部类对象
        GeneralClass.InnerClass innerClass = generalClass.new InnerClass(33);
        generalClass.show(); // Outer class: 3
        innerClass.show();
        // Inner class: 33
        //Inner class: 33
        //Inner class: 33
        //Outer class: 3
    }
}
