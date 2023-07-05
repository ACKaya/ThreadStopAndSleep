public class Counter implements Runnable{
    int id;
    boolean isRun=true;

    public Counter(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" Has started");
        int i=0;
        while(isRun){
            try {
                Thread.sleep(1000*getId());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+": "+i);
            i++;
        }

    }
    public void stop(){
        this.isRun=false;
    }
}
