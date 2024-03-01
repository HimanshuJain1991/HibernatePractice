package in.co.rays.log4j;

import org.apache.log4j.Logger;

public class TestLog4j {
public static void main(String[] args) {
	Logger log=Logger.getLogger(TestLog4j.class);
	log.debug("Debug message");
	log.info("Info Message");
	log.warn("Warn Message");
	log.error("Error Message");
	log.fatal("Fatal Mesaage");
	try {
		int i=0;
		int c=5/i;
		System.out.println("Division"+c);
		
	} catch (Exception e) {
		log.info("Arithmetic Error"+e);
	
	}
}
}
