import java.util.Random;
class ExceptionHandling {
    public static void main(String[] args) {
        int a = 10;
        Random r = new Random();
        for(int i = 0;i<10;i++){
            try{
                int b = r.nextInt(10);
                int c = a/b;
                System.out.println("c = " + c);
            }
            
            catch(ArithmeticException e){
                System.out.println(e);
            }
        }
    }
    
}
