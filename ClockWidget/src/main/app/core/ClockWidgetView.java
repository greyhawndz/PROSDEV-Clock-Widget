package main.app.core;

import java.awt.Font;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockWidgetView {


	private JLabel lblSs; // label for hour
	private JLabel lblColMs; // colon between hour and minute
	private JLabel lblMm; // label for minute
	private JLabel lblColHm; // label for colon between minute and second
	private JLabel lblHh; // label for second
	/*
	 * initialize the UI(non-Javadoc)
	 * @see main.app.core.ClockWidget#initUI()
	 */
	public void initUI() {
		getContentPane().setLayout(null);
		
		lblSs = new JLabel("HH"); 
		lblSs.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblSs.setBounds(120, 11, 30, 50);
		getContentPane().add(lblSs);
		
		lblColMs = new JLabel(":"); 
		lblColMs.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblColMs.setBounds(103, 11, 11, 50);
		getContentPane().add(lblColMs);
		
		lblMm = new JLabel("MM");
		lblMm.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblMm.setBounds(59, 11, 34, 50);
		getContentPane().add(lblMm);
		
		lblColHm = new JLabel(":");
		lblColHm.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblColHm.setBounds(42, 11, 11, 50);
		getContentPane().add(lblColHm);
		
		lblHh = new JLabel("SS");
		lblHh.setFont(new Font("Segoe UI", Font.BOLD, 18));
		lblHh.setBounds(10, 11, 27, 50);
		getContentPane().add(lblHh);
		setSize(185, 111);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
	 * updates the time based from system time (hour (12hrs format), minute, second)(non-Javadoc)
	 * @see main.app.core.ClockWidget#updateTime()
	 */
	public void updateTime() {
		setHour();
		setMinute();
		setSecond();
	}

	private void setHour() {
		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR);
		lblHh.setText((hour < 10 ? "0" : "") + hour);
	}
	
	private void setMinute() {
		Calendar cal = Calendar.getInstance();
		int minute = cal.get(Calendar.MINUTE);
		lblMm.setText((minute < 10 ? "0" : "") + minute);
	}

	private void setSecond() {
		Calendar cal = Calendar.getInstance();
		int second = cal.get(Calendar.SECOND);
		lblSs.setText((second < 10 ? "0" : "") + second);
	}
}
