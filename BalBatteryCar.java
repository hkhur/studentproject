
public class BalBatteryCar extends BalMotorVehicle implements BalStreetLegal {

	private String batteryCarwheel;
	private Double batteryCarPrice;
	private int batteryCarFrequency;
	@Override
	public double calculateOilFee() {
		
		return batteryCarPrice*batteryCarFrequency;
	}
	@Override
	public void steetSignalStop() {
	System.out.println("Car Stop");	
	}
	@Override
	public void steetSingalLeftTurn() {
    System.out.println("Car LeftTurn");	
		}
	@Override
	public void streetSignalRightTurn() {
		System.out.println("Car RightTurn");	
		}
	
}
