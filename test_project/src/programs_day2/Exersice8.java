package programs_day2;
import java.io.File;
import java.util.Date;

public class Exersice8 {
       public static void main(String[] args) {
       File file = new File("t.txt");
       Date date=new Date(file.lastModified());
	   System.out.println("\nThe file was last modified on: "+date+"\n");	   
     }
}
