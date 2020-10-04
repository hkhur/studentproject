
public class BalPuntBoat extends BalMotorVehicle{

	private String puntBoatQuant;
	private Double puntBoatPrice;  
	private int puntBoatFrequency;
	
	@Override
	public double calculateOilFee() {
		return puntBoatPrice*puntBoatFrequency;
	}
	}
