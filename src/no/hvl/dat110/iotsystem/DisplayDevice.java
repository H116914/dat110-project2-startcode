package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.messages.Message;
import no.hvl.dat110.messages.PublishMsg;
import no.hvl.dat110.common.TODO;

public class DisplayDevice {
	
	private static final int COUNT = 10;
		
	public static void main (String[] args) {
		
		System.out.println("Display starting ...");
		
		String user = "Display";
		String server = Common.BROKERHOST;
		int port = Common.BROKERPORT;
		
		Client dispDev = new Client(user, server, port);
		dispDev.connect();
		System.out.println("1 DisplayDevice");
		dispDev.createTopic("Temp");
		System.out.println("2 DisplayDevice");
		dispDev.subscribe("Temp");
		System.out.println("3 DisplayDevice");
		
		for(int i=0; i<COUNT; i++) {
			System.out.println("inne i for DisplayDevice");
			Message m = dispDev.receive();
			System.out.println("inne i for etter DisplayDevice");
		}
		System.out.println("4 DisplayDevice");
		dispDev.unsubscribe("Temp");
		System.out.println("5 DisplayDevice");
		dispDev.disconnect();
		
		
		// TODO - START
				
		// create a client object and use it to
		
		// - connect to the broker
		// - create the temperature topic on the broker
		// - subscribe to the topic
		// - receive messages on the topic
		// - unsubscribe from the topic
		// - disconnect from the broker
		
		// TODO - END
		
		System.out.println("Display stopping ... ");
		
//		throw new UnsupportedOperationException(TODO.method());
		
	}
}
