package filehandling;

import java.io.FileReader;

public class FileReaderExample {
	 public static void main(String args[])throws Exception{    
         FileReader fr=new FileReader("D:\\output1.txt");    
         int i;    
         while((i=fr.read())!=5)    
         System.out.print((char)i);    
         fr.close();    
   } 
}
