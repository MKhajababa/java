import java.util.*;

abstract class Shape{
    int length,breath,height,base;
    Scanner sc = new Scanner(System.in);
    abstract void printarea();
}

class Cube extends Shape{
    void printarea(){
        System.out.println("The area of Cube");
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the breath:");
        breath = sc.nextInt();
        System.out.println("Enter the height:");
        height = sc.nextInt();
        System.out.println("The area of Cube is:" +length*breath*height);
        
    }
}

class Rectangle extends Shape{
    void printarea(){
        System.out.println("The area of Rectangle");
        System.out.println("Enter the length:");
        length = sc.nextInt();
        System.out.println("Enter the breath:");
        breath = sc.nextInt();
        
        System.out.println("The area of Rectangle is:" +length*breath);
        
    }
}

class Triangle extends Shape{
    void printarea(){
        System.out.println("The area of Rectangle");
        System.out.println("Enter the base:");
        base = sc.nextInt();
        System.out.println("Enter the height:");
        height = sc.nextInt();
        
        System.out.println("The area of Rectangle is:" +(base*height)/2);
        
    }
}

class AbstractClass{
    public static void main(String[] args) {
        Cube c = new Cube();
        c.printarea();
        Rectangle r = new Rectangle();
        r.printarea();
        Triangle t = new Triangle();
        t.printarea();
    }
}