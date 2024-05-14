package com.xml;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext(
				"C:\\Spring-SpringBoot-Framework\\Bean_Life_Cycle\\src\\main\\java\\com\\xml\\beans.xml");
 
		context.close();
	}
}
