package com.bk.abc;

import org.apache.log4j.Logger;

public class Program01 {
final static Logger logger = Logger.getLogger(Program01.class);
			
	public static void main(String args[]) {
		Program01 p01 = new Program01();
		p01.tryLogging("Hello World");
	}
	
	private void tryLogging(String myLogMessage) {
		if(logger.isDebugEnabled()) {
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
			logger.debug("DEBUG MESSAAGE: "+myLogMessage);
		}
		
		if(logger.isInfoEnabled()) {
			logger.info("INFO MESSAGE: "+myLogMessage);
		}
	}
}
