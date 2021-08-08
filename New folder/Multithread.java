import java.util.Random;
class FirstThread extends Thread{
    public void run(){
        Random randomInt = new Random();
        for(int i = 0;i<10;i++){
            int num = randomInt.nextInt(1000);
            System.out.println("Generated Number:" + num);
            if(num%2 == 0){
                SecondThread sT = new SecondThread();
                sT.Square(num);
                sT.start();
            }
            else{
                ThirdThread tT = new ThirdThread();
                tT.Cube(num);
                tT.start();
            }

            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println("Interupt occured");
            }
        }
    }
}
class SecondThread extends Thread{
    int number;
    public void Square(int x){
        number = x;
    }
    public void run(){
        System.out.println("Square is:" + number*number);
    }

}
class ThirdThread extends Thread{
    int number;
    public void Cube(int x){
        number = x;
    }
    public void run(){
        System.out.println("Cube is:" + number*number*number);
    }

}

class Multithread{
    public static void main(String[] args) {
        FirstThread Ft = new FirstThread();
        Ft.start();
    }
}