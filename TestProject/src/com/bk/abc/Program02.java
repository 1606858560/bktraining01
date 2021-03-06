package com.bk.abc;

import org.apache.log4j.Logger;

public class Program02 {
final static Logger logger = Logger.getLogger(Program02.class);
final static Logger loggerInfo = Logger.getLogger("appLogerInfo");

	public static void main(String args[]) {
		Program02 p02 = new Program02();
		p02.tryLogging("Hello World");
		int a1=2;
		int a2=3;
		int a3=a1+a2;
		System.out.println("Caculation: "+a1+" + "+a2);
		System.out.println("Result: "+a3);
	}
	
	private void tryLogging(String myLogMessage) {
		if(logger.isDebugEnabled()) {
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
		}
		
		if(logger.isInfoEnabled()) {
			loggerInfo.info("INFO MESSAGE: "+myLogMessage);
		}
		
		if(logger.isInfoEnabled()) {
			logger.error("ERROR MESSAGE: "+myLogMessage);
		}
	}
}
