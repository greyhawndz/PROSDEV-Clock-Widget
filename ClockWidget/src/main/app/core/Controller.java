/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.app.core;

/**
 *
 * @author William
 */
public interface Controller {
/*    public void config();
    public boolean isReady();
    public void stop();
    public boolean isRunning();*/
    public void start();
    public void setHour(int hour);
    public void setMinute(int minute);
    public void setSecond(int second);
    public void stop();
    public boolean isRunning();
    public void config();
    public boolean isReady();
    public String getTime();
}
