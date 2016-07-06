package test.app.core;

import main.app.core.ClockModel;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import main.app.core.ClockWidgetApp;
import main.app.core.ClockWidgetController;
import main.app.core.ClockWidgetView;

import org.junit.Test;

public class ClockWidgetAppTest {
	@Test
	public void shouldInitializeGUI() {
		// given
		ClockWidgetView app = new ClockWidgetView();
		
		// when
		app.initUI();
		
		// then
		assertEquals(true, app.isVisible());
	}
	
	@Test
	public void shouldConfigureClock() {
		// given
		ClockWidgetController controller = new ClockWidgetController();
		ClockModel clock = new ClockModel(controller);
		// when
		
		
		// then
		assertEquals(true, clock.isReady());
	}
	
	@Test
	public void shouldUpdateTime() throws InterruptedException {
		// given
		ClockWidgetView app = new ClockWidgetView();
                ClockWidgetController controller = new ClockWidgetController();
                ClockModel clock = new ClockModel(controller);
		app.initUI();
		String currentTime = clock.getTime();
		
		// when
		Thread.sleep(1000);
		clock.updateTime();
		
		// then
		assertNotSame(currentTime, clock.getTime());
	}
	
	@Test
	public void shouldStartTime() {
		// given
		ClockWidgetView app = new ClockWidgetView();
                ClockWidgetController controller = new ClockWidgetController();
                ClockModel clock = new ClockModel(controller);
		app.initUI();
		
		// when
		controller.start();
		
		// then
		assertEquals(true, clock.isRunning());
	}
	
	@Test
	public void shouldStopTime() {
		// given
		ClockWidgetView app = new ClockWidgetView();
                ClockWidgetController controller = new ClockWidgetController();
                ClockModel clock = new ClockModel(controller);
		app.initUI();
		controller.start();
		assertEquals(true, clock.isRunning());
		
		// when
		clock.stop();
		
		// then
		assertEquals(false, clock.isRunning());
	}
}
