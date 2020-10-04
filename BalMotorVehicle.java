
abstract public class BalMotorVehicle {

	private int manufacturingYear;

	public enum Color {
	    RED, YELLOW, BLUE; //each is an instance of Color 
	}

	@Override
	public String toString() {
		return "BalMotorVehicle [manufacturingYear=" + manufacturingYear + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	};
	
   public abstract double calculateOilFee();
 	
	
}
