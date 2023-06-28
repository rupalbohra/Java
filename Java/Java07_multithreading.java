// helps in achieving multitasking


class MyThread1 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("My thread1 is running");
            System.out.println("I'm happy!");
            i++;
        }
    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("My thread2 is running");
            System.out.println("I'm sad!");
            i++;
        }
    }
}

public class Java07_multithreading {
    public static void main(String[] args){ 
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start(); // start() method internally calls run method
        t2.start();
    }
}
