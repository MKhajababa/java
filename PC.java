class Q{
    int n;
    boolean b = false;
    synchronized int get(){
        while(!b){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("got: " + n);
        b = false;
        notify();
        return n;

    }
    synchronized void put(int n){
        while(b){
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);

            }
            this.n = n;
            b= true;
            System.out.println("put: " + n);
            notify();

        }
    }
}

class Producer implements Runnable{
    Q q;
    int j = 0;
    Producer(Q q){
        this.q = q;
        new Thread(this,"Producer").start();
    }
    public void run(){
        int i=0;
        while(j<20){
            q.put(i++);
            j++;
        }
    }
}
class Consumer implements Runnable{
    Q q;
    int i =0;
    Consumer(Q q){
        this.q =q;
        new Thread(this,"Consumer").start();
    }
    public void run(){

        while(i<20){
            q.get();
            i++;
        }
    }
}
public class PC {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);

    }
}
