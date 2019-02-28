package filehandling;
import java.io.FileWriter;
public class FileWriterExample {
	public static void main(String args[]){    
        try{    
          FileWriter fw=new FileWriter("d:\\output1.txt");    
          fw.write("Welcome to javaclass");   
           fw.close();    
         }catch(Exception e){
		System.out.println(e);
         }    
         System.out.println("Success...");    
    }    
}
