public class Main {
    public static void main(String[] args) throws InterruptedException {
    Counter c1=new Counter(1);
    Counter c2=new Counter(1);

        Thread t1=new Thread(c1);
    Thread t2=new Thread(c2);
    t1.start();
        Thread.sleep(7000);
        c1.stop();
        t2.start();
        Thread.sleep(10000);
        c2.stop();
    }
}
