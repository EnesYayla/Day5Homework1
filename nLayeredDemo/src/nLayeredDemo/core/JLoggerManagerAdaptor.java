package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdaptor implements JLoggerService {

	@Override
	public void logToSystem(String string) {
		JLoggerManager jLogger = new JLoggerManager();
		jLogger.log(string);
		
	}
	
	

}
