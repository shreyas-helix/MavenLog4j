package com.demo;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Starter {

	private static final Logger log = LogManager.getLogger(Starter.class);
	public static void main(String[] args) {
//		System.out.println("Hello World!");
//		BasicConfigurator.configure();
		log.debug("Hello World!");
	}

}
