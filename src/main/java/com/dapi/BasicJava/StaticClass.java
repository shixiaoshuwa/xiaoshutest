package main.java.com.dapi.BasicJava;

/**
 * 静态内部类
 *
 * @auther Seb's
 * @date 2023/01/13 16:35
 */
public class StaticClass {
    private  static int cnt;
    private int cnt2;

    public StaticClass() {
    }

    public StaticClass(int cnt2) {
        this.cnt2 = cnt2;
    }

    public static int getCnt() {
        return cnt;
    }

    public static void setCnt(int cnt) {
        StaticClass.cnt = cnt;
    }

    public int getCnt2() {
        return cnt2;
    }

    public void setCnt2(int cnt2) {
        this.cnt2 = cnt2;
    }
    public void show(){
        System.out.println("Outer class:"+getCnt());
    }
    //第二种内部类：静态内部类
    public static class InnerClass{
        private int cnt;

        public InnerClass() {
        }

        public InnerClass(int cnt) {
            this.cnt = cnt;
        }

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }
        public void show(){
            /* 当内部类和外部类成员变量名相同时 */
            //三种获取内部类成员变量的方法
            System.out.println("Inner class"+getCnt());
            System.out.println("Inner class"+ this.getCnt());
            System.out.println("Innser class:" + InnerClass.this.getCnt());

            //1.静态内部类中调用外部的变量必须也是静态变量。
            System.out.println("Outer class:静态成员变量"+StaticClass.getCnt());
            //2.在静态内部类中 new 外部类的对象再引用
            StaticClass staticClass = new StaticClass();
            staticClass.setCnt2(555);
            System.out.println("Outer class:静态成员变量 "+ staticClass.getCnt2());
        }
    }
}
