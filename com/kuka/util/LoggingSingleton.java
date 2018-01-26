package com.kuka.util;

import com.kuka.roboticsAPI.applicationModel.RoboticsAPIApplication;


/*
 * This class is intended to be used as a master logging class.  The main usage will be through the static methods.
 * Background tasks can log messages into the foreground RoboticsAPIApplication.
 * The main foreground RoboticsAPIApplication calls  LoggingSingleton.setLoggger() once at the start of the app.
 * Other applications call the static info() or error() methods.  All messages will print to the foreground application.  
 */
public class LoggingSingleton
{

	private RoboticsAPIApplication app=null;
	
	
	private static LoggingSingleton thisLS;
	private LoggingSingleton()
	{
		
	}
	
	
	/*
	 * This constructor should only be used from the one class that owns the desired Logger:
	 * The main running RoboticsAPIApplication.
	 */
	public LoggingSingleton(RoboticsAPIApplication ra)
	{
		if (thisLS == null)
			thisLS = new LoggingSingleton();
		if (thisLS.app != null)
			thisLS.app.getLogger().info("Warning: LoggingSingleton changed RoboticsAPIApplication reference with constructor!");
		
		thisLS.app = ra;
	}

	/*
	 * This method can be used to change which logger is used after the fact.  It can also be used directly.
	 */
	public static void setLoggger(RoboticsAPIApplication ra)
	{
		if (thisLS == null)
			thisLS = new LoggingSingleton();
		if (thisLS.app != null)
			thisLS.app.getLogger().info("Warning: LoggingSingleton changed RoboticsAPIApplication reference with setLogger!");

		thisLS.app = ra;
	}
	
	/*
	 * Fail safe method to print an info string.
	 * If the master logger app was not set yet, the method just returns.
	 */
	public static void info(String s)
	{
		if (thisLS == null)
			return;
		else if (thisLS.app == null)
			return;
		else
			thisLS.app.getLogger().info(s);
	}

	
	/*
	 * Fail safe method to print an error string.
	 * If the master logger app was not set yet, the method just returns.
	 */
	public static void error(String s)
	{
		if (thisLS == null)
			return;
		else if (thisLS.app == null)
			return;
		else
			thisLS.app.getLogger().error(s);
	}

	
}
