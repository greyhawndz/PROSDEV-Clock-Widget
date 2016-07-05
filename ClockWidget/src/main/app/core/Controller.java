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
    public void config();
    public boolean isReady();
    public void stop();
    public void start();
    public boolean isRunning();
    public void updateTime();
    public void setHour();
    public void setMinute();
    public void setSecond();
}
