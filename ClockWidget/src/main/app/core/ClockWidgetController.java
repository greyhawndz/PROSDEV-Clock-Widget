package main.app.core;

import java.util.Calendar;

/**
 *
 * @author William
 */
public class ClockWidgetController implements Controller, Runnable {
    
    private ClockWidgetView view;
    private ClockWidgetModel clock;
    private boolean stop;
    private int updateInt;
    private boolean ready;

    public ClockWidgetController() {
        view = new ClockWidgetView();
        clock = new ClockWidgetModel(this);
        config();
        view.initUI();
    }
    
    @Override
    public void start() {
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!stop) {
			try {
				Thread.sleep(updateInt);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clock.updateTime();
		}
    }

   

    @Override
    public void setHour(int hour) {
        view.setHour(hour);
    }

    @Override
    public void setMinute(int minute) {
        
        view.setMinute(minute);
    }

    @Override
    public void setSecond(int second) {
        view.setSecond(second);
    }
    
    @Override
    public void stop() {
		stop = true;
    }
    
    @Override
    public boolean isRunning() {
        return !stop;
    }
    
    @Override
    public void config() {
        updateInt = 100; // updates every 100 milliseconds
	ready = true;
    }
    
    @Override
    public boolean isReady() {
		return ready;
    }
    
    @Override
    public String getTime(){
        return clock.getTime();
    }

   

    
}
