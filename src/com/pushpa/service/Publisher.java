/**
 * 
 */
package com.pushpa.service;

import javax.xml.ws.Endpoint;

/**
 * @author pushpa
 *
 */
public class Publisher {

	public static void main(String args[]) {

		/*
		 * publish takes two argument one is the location at which you want to
		 * run the service with random portno to avoid standard ports, and the
		 * second is the service implementation bean.
		 */
		Endpoint.publish("http://localhost:1235/myservice", new GreetingsImpl());

	}

}
