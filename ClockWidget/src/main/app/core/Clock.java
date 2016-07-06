package main.app.core;

public class Clock {
	
	private int hour, minute, second;
	private int updateInt;
	private boolean stop;
	private boolean ready;
	
	public Clock(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
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
	
}

