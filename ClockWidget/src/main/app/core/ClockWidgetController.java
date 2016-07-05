/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app.core;

import java.util.Calendar;

/**
 *
 * @author William
 */
public class ClockWidgetController implements Controller, Runnable {
    
    private int updateInt;
    private boolean stop;
    private boolean ready;
    private ClockWidgetView view;

    public ClockWidgetController(ClockWidgetView view) {
        this.view = view;
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
    public void stop() {
        stop = true;
    }

    @Override
    public void start() {
        new Thread(this).start();
    }

    

    @Override
    public boolean isRunning() {
        return !stop;
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
			updateTime();
		}
    }

    @Override
    public void updateTime() {
        setHour();
	setMinute();
	setSecond();
    }

    @Override
    public void setHour() {
        Calendar cal = Calendar.getInstance();
	int hour = cal.get(Calendar.HOUR);
        view.setHour(hour);
    }

    @Override
    public void setMinute() {
        Calendar cal = Calendar.getInstance();
	int minute = cal.get(Calendar.MINUTE);
        view.setMinute(minute);
    }

    @Override
    public void setSecond() {
        Calendar cal = Calendar.getInstance();
	int second = cal.get(Calendar.SECOND);
        view.setSecond(second);
    }

   
    
}
