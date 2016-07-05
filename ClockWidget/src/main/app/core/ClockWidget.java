package main.app.core;

/*
 * Interface to use when introducing new clock widgets.
 */
public interface ClockWidget {
	
	/*
	 * configures the clock widget
	 */
	void config();
	
	/*
	 * used to check if widget is configured already
	 */
	boolean isReady();
	
	/*
	 * used to get time as "HH:MM:SS"
	 */
	String getTime();
	
	/*
	 * starts the clock
	 */
	void start();
	
	/*
	 * used to check if clock is running
	 */
	boolean isRunning();
	
	/*	
	 * stops the clock
	 */
	void stop();
}
