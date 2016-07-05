package main.app.core;


public class ClockWidgetApp extends JFrame implements Runnable,  ClockWidget{
	/**
	 * auto generated serial version UID imposed by JFrame
	 */
	private static final long serialVersionUID = -8951174492255254603L;

	private int updateInt;
	private boolean stop;
	private boolean ready;
	
	/*
	 * method for configuring this clock object(non-Javadoc)
	 * @see main.app.core.ClockWidget#config()
	 */
	public void config() {
		updateInt = 100; // updates every 100 milliseconds
		ready = true;
	}
	
	/*
	 * returns true if this clock is configured, false otherwise(non-Javadoc)
	 * @see main.app.core.ClockWidget#isReady()
	 */
	public boolean isReady() {
		return ready;
	}

	/*
	 * starts this clock object by spawning a thread and starting it(non-Javadoc)
	 * @see main.app.core.ClockWidget#start()
	 */
	public void start() {
		new Thread(this).start();
	}
	
	/*
	 * the ClockWidget's main business logic(non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		while (!stop) {
			try {
				Thread.sleep(updateInt);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			updateTime();
		}
	}
	
	/*
	 * stops this clock(non-Javadoc)
	 * @see main.app.core.ClockWidget#stop()
	 */
	public void stop() {
		stop = true;
	}

	/*
	 * returns the time using appropriate format HH:MM:SS(non-Javadoc)
	 * @see main.app.core.ClockWidget#getTime()
	 */
	public String getTime() {
		return lblHh + ":" + lblMm + ":" + lblSs;
	}

	/*
	 * returns true if this clock is running false otherwise(non-Javadoc)
	 * @see main.app.core.ClockWidget#isRunning()
	 */
	public boolean isRunning() {
		return !stop;
	}
}