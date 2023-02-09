package main.java.com.dapi.multiThreaded;

import java.util.ArrayList;
import java.util.List;

/**
 * 不使用等待/通知机制实现线程间通信
 *
 * @auther Seb's
 * @date 2023/02/09 16:36
 */
public class MyList {

    private List list = new ArrayList<>();

    public void add() {
        list.add("王洪玉");
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        final MyList myList = new MyList();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                myList.add();
                System.out.println("当前线程，" + Thread.currentThread().getName() + "添加了一个元素");
            }
        }, "t1");

        Thread t2 = new Thread(() -> {
            //while true语句轮询机制来检测某一个条件，这样会造成很严重的CPU浪费
            while (true) {

                if (myList.size() == 5) {
                    System.out.println("当前线程收到通知：" + Thread.currentThread().getName() + "list size = 5线程停止。。。");
                    throw new RuntimeException();
                }
            }
        }, "t2");


        t1.start();
        t2.start();
    }

}
