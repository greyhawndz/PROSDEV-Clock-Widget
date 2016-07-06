package main.app.core;

import java.util.Calendar;

public class ClockModel {
	
    private int hour, minute, second;
    private int updateInt;
    private boolean stop;
    private boolean ready;
    private String time;
    private ClockWidgetController controller;
        
    public ClockModel(ClockWidgetController controller){
        this.controller = controller;
    }

    public String getTime() {
        time = hour + ":" + minute + ":" + second;
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
	
    public void setHour() {
        Calendar cal = Calendar.getInstance();
        hour = cal.get(Calendar.HOUR);
        controller.setHour(hour);
    }

    public void setMinute() {
        Calendar cal = Calendar.getInstance();
        minute = cal.get(Calendar.MINUTE);
        controller.setMinute(minute);
    }

    public void setSecond() {
        Calendar cal = Calendar.getInstance();
	second = cal.get(Calendar.SECOND);
        controller.setSecond(second);
    }
	
    public int getHour() {
		return hour;
    }
	
    public int getMinute() {
		return minute;
    }
	
    public int getSecond() {
		return second;
    }
	
    public void stop() {
		stop = true;
    }
	
    public boolean isReady() {
		return ready;
    }
	
    public void config() {
        updateInt = 100; // updates every 100 milliseconds
	ready = true;
    }
	
    public boolean isRunning() {
        return !stop;
    }
        
    public void updateTime() {
        setHour();
        setMinute();
        setSecond();
    }
	
}

