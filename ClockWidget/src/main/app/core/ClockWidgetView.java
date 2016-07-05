package main.app.core;

/*
 * Interface to use when introducing new clock widgets.
 */ 	
public interface ClockWidgetView {
	/*
	 * initialize the design
	 */
	void initUI();
	
	/*
	 * configures the clock widget
	 */
	
	void updateTime();
	
	/*
	 * starts the clock
	 */

}
