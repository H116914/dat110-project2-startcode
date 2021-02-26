package no.hvl.dat110.iotsystem;

import no.hvl.dat110.client.Client;
import no.hvl.dat110.common.TODO;

public class TemperatureDevice {

//	private static no.hvl.dat110.client.Client client;
	private static final int COUNT = 10;

	public static void main(String[] args) {

		// simulated / virtual temperature sensor
		TemperatureSensor sn = new TemperatureSensor();
		
		System.out.println("Temperature device starting ... ");
		
		String user = Common.TEMPTOPIC;
		String server = Common.BROKERHOST;
		int port = Common.BROKERPORT;
		
		System.out.println("1 tempdiv");
		Client tempDev = new Client(user, server, port);
		System.out.println("2 tempdiv");
		tempDev.connect();
		System.out.println("3 tempdiv");
		for(int i =0; i<COUNT; i++) {
			tempDev.publish("Temp", Integer.toString(sn.read()));
		}
		System.out.println("4 tempdiv");
		tempDev.disconnect();
		
		
		// TODO - start

		// create a client object and use it to

		// - connect to the broker
		// - publish the temperature(s)
		// - disconnect from the broker

		// TODO - end

		System.out.println("Temperature device stopping ... ");

//		throw new UnsupportedOperationException(TODO.method());

	}
}
