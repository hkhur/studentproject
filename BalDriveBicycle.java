
public class BalDriveBicycle implements BalStreetLegal {

	private String bicyclePedal;

	@Override
	public String toString() {
		return "DriveBicycle [bicyclePedal=" + bicyclePedal + "]";
	}

	@Override
	public void steetSignalStop() {
	System.out.println("Bicycle Stop");	
	}

	@Override
	public void steetSingalLeftTurn() {
	System.out.println("Bicycle LeftTurn");	
	}

	@Override
	public void streetSignalRightTurn() {
	System.out.println("Bicycle RightTurn");
		}
	}
