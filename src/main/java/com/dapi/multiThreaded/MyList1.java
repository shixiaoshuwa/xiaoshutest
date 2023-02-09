package main.java.com.dapi.multiThreaded;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用notify和wait通知机制实现线程间通信
 * 注意：
 * (1) wait和notify必须配合synchronized关键字使用
 * (2)wait方法释放锁，notify方法不释放锁
 * @auther Seb's
 * @date 2023/02/09 16:44
 */
public class MyList1 {
    private List list = new ArrayList<>();

    public void add() {
        list.add("王洪玉");
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args){

        final MyList1 myList = new MyList1();

        //实例化出来一个lock
        //当使用wait/notify时，
        final Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock){
                for (int i = 0; i < 10; i++) {
                    myList.add();
                    System.out.println("当前线程，" + Thread.currentThread().getName() + "添加了一个元素");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if(myList.size() == 5){
                        System.out.println("已经发出通知。。。。");
                        lock.notify(); //不释放锁，执行完for循环才释放锁
                    }
                }
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            synchronized (lock){
                if (myList.size() != 5) {
                    try {
                        System.out.println("进入t2。。。");
                        lock.wait(); //释放对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("当前线程收到通知：" + Thread.currentThread().getName() + "list size = 5线程停止。。。");
                    throw new RuntimeException();
                }
            }
        }, "t2");

        t2.start();
        t1.start();
    }

}
