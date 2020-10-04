public class BalGoPedestrian implements BalStreetLegal {

	private String pedestrianLeg;

	@Override
	public String toString() {
		return "GoPedestrian [pedestrianLeg=" + pedestrianLeg + "]";
	}

	@Override
	public void steetSignalStop() {
		System.out.println("Pedestrian Stop");
	}

	@Override
	public void steetSingalLeftTurn() {
		System.out.println("Pedestrian LeftTurn");
		}

	@Override
	public void streetSignalRightTurn() {
		System.out.println("Pedestrian RightTurn");
		}
}
