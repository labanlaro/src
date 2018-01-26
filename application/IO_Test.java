package application;

import javax.inject.Inject;
import com.kuka.generated.ioAccess.ExternalIOIOGroup;
import com.kuka.roboticsAPI.controllerModel.Controller;

public class IO_Test {

	private ExternalIOIOGroup io;
	private Controller kuka_Sunrise_Cabinet_1;
	
	public IO_Test(Controller cont) {
		kuka_Sunrise_Cabinet_1 = cont;
		io = new ExternalIOIOGroup(kuka_Sunrise_Cabinet_1);
	}
	
	public void Set_IO(boolean state) {
		io.setOUT07(state);
	}

}
