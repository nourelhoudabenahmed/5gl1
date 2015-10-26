package com.esprit;

import java.util.Date;


//this is a loogger
public class Logger {

	public void log(Class source, String message) {

		String template = "-%s <%s> : %s";

		String result = String.format(template, new Date(),
				source.getSimpleName(), message);

		System.out.println(result);

	}

}
