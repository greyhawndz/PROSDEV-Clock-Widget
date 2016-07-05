package main.app.core;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockWidgetView extends JFrame  {

        private static final long serialVersionUID = -8951174492255254603L;
	private JLabel labelSecond; 
	private JLabel labelColonMinuteSecond;
	private JLabel labelMinute;
	private JLabel labelColonHourMinute;
	private JLabel labelHour;
	/*
	 * initialize the UI(non-Javadoc)
	 * @see main.app.core.ClockWidget#initUI()
	 */
	public void initUI() {
		getContentPane().setLayout(null);
		
		labelSecond = new JLabel("HH"); 
		labelSecond.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelSecond.setBounds(120, 11, 30, 50);
		getContentPane().add(labelSecond);
		
		labelColonMinuteSecond = new JLabel(":"); 
		labelColonMinuteSecond.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelColonMinuteSecond.setBounds(103, 11, 11, 50);
		getContentPane().add(labelColonMinuteSecond);
		
		labelMinute = new JLabel("MM");
		labelMinute.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelMinute.setBounds(59, 11, 34, 50);
		getContentPane().add(labelMinute);
		
		labelColonHourMinute = new JLabel(":");
		labelColonHourMinute.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelColonHourMinute.setBounds(42, 11, 11, 50);
		getContentPane().add(labelColonHourMinute);
		
		labelHour = new JLabel("SS");
		labelHour.setFont(new Font("Segoe UI", Font.BOLD, 18));
		labelHour.setBounds(10, 11, 27, 50);
		getContentPane().add(labelHour);
		setSize(185, 111);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 * updates the time based from system time (hour (12hrs format), minute, second)(non-Javadoc)
	 * @see main.app.core.ClockWidget#updateTime()
	 */

	protected void setHour(int hour) {
		labelHour.setText((hour < 10 ? "0" : "") + hour);
	}
	
	protected void setMinute(int minute) {
		labelMinute.setText((minute < 10 ? "0" : "") + minute);
	}

	protected void setSecond(int second) {
		labelSecond.setText((second < 10 ? "0" : "") + second);
	}
}
