import java.io.*;
class TraverseFile{
      public static void main(String args[]){
                 File f1 = new File("C:/Users/Dheeraj Sharma/JAVA/abc.txt");
                 File f2 = new File("C:/Users/Dheeraj Sharma/JAVA/abc1.txt");
                 char c[]=new char[10000];
                      int i,k=0;
                 try{
                     FileInputStream fin=new FileInputStream(f1);
                      i=fin.read();
                     while(i!=-1){
                      c[k]=(char)i;
                     k++;
                     i=fin.read();
                   }
                  }
                 catch(IOException e){
                   System.out.println(e);
                 }
                  try{
                   FileOutputStream fout=new FileOutputStream(f2);
                   for(i=0;i<k;i++)
                    fout.write(c[i]);
                   System.out.println("File is copied");
                 }
                 catch(IOException e){
                   System.out.println(e);
                  }
                 try{
            FileInputStream fin=new FileInputStream(f2);
        int i2;
        i2 = fin.read();
        while(i2 != -1){
            c[k++] = (char)i2;
            System.out.print((char)i2);
            i2 = fin.read();
        }
    }
    catch(IOException e){
        System.out.println(e);
    }
      }
} 