package test.app.core;

import main.app.core.ClockWidgetModel;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
//import main.app.core.ClockWidgetApp;
import main.app.core.ClockWidgetController;
import main.app.core.ClockWidgetView;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

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
		
		// when
		
		
		// then
		assertEquals(true, controller.isReady());
	}
	
	@Test
	public void shouldUpdateTime() throws InterruptedException {
		// given
		
                ClockWidgetController controller = new ClockWidgetController();
		
		String currentTime = controller.getTime();
		
		// when
		Thread.sleep(1000);
		
		
		// then
		assertNotSame(currentTime, controller.getTime());
	}
	
	@Test
	public void shouldStartTime() {
		// given
		
                ClockWidgetController controller = new ClockWidgetController();
               
		
		
		// when
		controller.start();
		
		// then
		assertEquals(true, controller.isRunning());
	}
	
	@Test
	public void shouldStopTime() {
		// given
                ClockWidgetController controller = new ClockWidgetController();
		controller.start();
		assertEquals(true, controller.isRunning());
		
		// when
		controller.stop();
		
		// then
		assertEquals(false, controller.isRunning());
	}
}
