package aSSOCC_v2_framework.common;

import repast.simphony.engine.environment.RunEnvironment;

public class Logger {

	private static boolean logMain = false;
	private static boolean logAgent = false;
	private static boolean logErrors = true;
	
	public static void logMain(String output) {
		if (logMain)
			System.out.println(output);
	}
	
	public static void logAgent(int id, String output) {
		if (logAgent)
			System.out.println(" " + id + ": " + output);
	}
	
	public static void logError(String error) {
		if (logErrors) {
			System.err.println("Error: " + error);
			new Exception().printStackTrace();
			RunEnvironment.getInstance().endRun();
		}
	}
}
