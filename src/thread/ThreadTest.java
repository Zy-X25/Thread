package thread;


/**
 * @Author: zzy
 * Date: 2018/11/12
 * Time: 14:35
 * Description:
 */
public class ThreadTest {
    public static void main(String[] args) {
//        RunnableDemo R1 = new RunnableDemo("Thread-1");
//        R1.start();
//
//        RunnableDemo R2 = new RunnableDemo("Thread-2");
//        R2.start();

        ThreadDemo R1 = new ThreadDemo("Thread-1");
        R1.start();

        ThreadDemo R2 = new ThreadDemo("Thread-2");
        R2.start();
    }

}
