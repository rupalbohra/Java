class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("I am a thread1 not a threat");
            i++;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am a thread2 not a threat");
            i++;
        }
    }
}


public class Java08_threads_runnable_interface {
    public static void main(String[] args){
        MyThreadRunnable1 t1 = new MyThreadRunnable1();
        Thread t11 = new Thread(t1);
        MyThreadRunnable2 t2 = new MyThreadRunnable2();
        Thread t22 = new Thread(t2);
        t11.start();  // Unlike extending thread class, while implementing runnable class we cannot run start method directly
        t22.start();
    }
}
