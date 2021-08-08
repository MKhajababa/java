class Pop{
    int i,j;
    void getvalues(int x,int y){
        i = x;
        j = y;
    }
    void putvalues(){
        System.out.println("i = "+i+"j = "+j);
    }
}
interface adding{
    void addi();
     
}
class Temp extends Pop implements adding{
    public void addi(){
        System.out.println("Addition:"+(i+j));
    }

}
class Minh{
    public static void main(String[] args) {
        Temp t = new Temp();
        t.getvalues(2, 3);
        t.putvalues();
        t.addi();
    }
}