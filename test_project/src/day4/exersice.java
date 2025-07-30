package day4;

import java.io. File;



public class exersice {
	
public static void main (String a[]) {
	File file = new File("C:\\Users\\tejas\\Downloads");
	String[] fileList = file.list();
	for(String name: fileList){
		System. out. println (name) ;
}

}}