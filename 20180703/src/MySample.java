/**
 * @author Akira Shinohara
 * @since 2018.07.03
 */
public class MySample {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread("Thread #1", 1000);
        MyThread mt2 = new MyThread("Thread #2", 1500);

        mt1.start();
        mt2.start();
    }
}


class MyThread extends Thread {
    private String msg;
    private int count;
    private int msec;


    MyThread(String msg, int msec) {
        this.msg = msg;
        this.msec =msec;
        count = 0;
    }


    public  void run() {
        while (true) {
            if (count == 10) {
                break;
            }
            try {
                Thread.sleep(msec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(msg + " - " + count);
        }
    }
}