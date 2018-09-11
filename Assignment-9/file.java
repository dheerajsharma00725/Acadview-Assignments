import java.io.*;
class Path{
	public static void main(String[] args){
		try{
			File f = new File("acadview.txt");
		FileWriter w = new FileWriter("abc.txt");
		String f1;
		f1=f.getAbsolutePath(); 
    	w.write(f1);

    	w.close();
    	System.out.println("Completed Successfully");
	}
	catch(IOException e){
		e.printStackTrace();
	}
}}