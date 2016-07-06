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
    
/*    private int updateInt;
    private boolean stop;
    private boolean ready;*/
    private ClockWidgetView view;
    private ClockModel clock;
    private int updateInt;
    private boolean stop;

    public ClockWidgetController() {
        view = new ClockWidgetView();
        clock = new ClockModel(this);
        clock.config();
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

   

    
}
