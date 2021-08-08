import java.io.*;
class Filees{
	public static void main(String[] args){
		String dname = "C:\\Users\\Khaja\\OneDrive\\Desktop\\Jva";
		File myDir = new File(dname);
		if(myDir.isDirectory()){
			File arr[] = myDir.listFiles();
			RecursivePrint(arr,0);
		}
	}
	static void RecursivePrint(File[] arr,int level){
		for(File f:arr){
			for(int i = 0;i<level;i++){
				System.out.println("\t");
			}
			if(f.isFile()){
				System.out.println(f.getName() + "is File");
			}
			else if(f.isDirectory()){
				System.out.println(f.getName() + "is Directory");
				RecursivePrint(f.listFiles(),level+1);
			}
		}
	}
}