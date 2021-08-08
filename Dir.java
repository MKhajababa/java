import java.io.*;
public class Dir {
    public static void main(String[] args) {
        String dname = "C:\\Users\\Khaja\\OneDrive\\Desktop\\Jva";
        File dir = new File(dname);
        if(dir.isDirectory()){
            File arr[] = dir.listFiles();
            RecursivePrint(arr,0);
        }

    }
    static void RecursivePrint(File arr[],int level){
        for(File f:arr){
            for(int i =0;i<level;i++){
                System.out.println("\t\t");
            }
            if(f.isFile()){
                System.out.println(f.getName() + " is a file");
            }
            else if(f.isDirectory()){
                System.out.println(f.getName() + " is a directory");
                RecursivePrint(f.listFiles(), level+1);
            }
        }
    }
}
