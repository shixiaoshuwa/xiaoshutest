package main.java.com.dapi.BasicJava;

/**
 * 内部类
 *
 * @auther Seb's
 * @date 2023/01/13 14:40
 */
public class GeneralClass {
        private int cnt;

        public GeneralClass() {
        }

        public GeneralClass(int cnt) {
            setCnt(cnt);
        }

        public int getCnt() {
            return cnt;
        }

        public void setCnt(int cnt) {
            this.cnt = cnt;
        }

        public void show() {
            System.out.println("Outer class: " + getCnt());
        }

        // 创建第一种内部类：普通内部类
        public class InnerClass {
            private int cnt;

            public InnerClass() {
            }

            public InnerClass(int cnt) {
                setCnt(cnt);
            }

            public int getCnt() {
                return cnt;
            }

            public void setCnt(int cnt) {
                this.cnt = cnt;
            }

            public void show() {
                // 当内部类和外部类成员变量名相同时
                // 上面三种都是获取 内部类 成员变量的方法
                // 最后一种是获取 外部类 成员变量的方法
                System.out.println("Inner class: " + getCnt());
                System.out.println("Inner class: " + this.getCnt());
                System.out.println("Inner class: " + InnerClass.this.getCnt());
                System.out.println(InnerClass.this);
                System.out.println(GeneralClass.this);
                System.out.println("Outer class: " + GeneralClass.this.getCnt()); // 使用 this 关键字
            }
        }
}
