public class BalTestVehicle {

public static void main(String[] args) {
	
	BalStreetLegal[] streetlegal = new BalStreetLegal[2]; // creating array of objects to store other classes objects
	
	BalMotorVehicle[] motorvehicle = new BalMotorVehicle[2]; //creating array of objects to store other classes objects
	
	BalBatteryCar batterycar = new BalBatteryCar();// creating object of BatteryCar
	
	BalPuntBoat puntboat = new BalPuntBoat();// creating object of PuntBoat
	
	BalDriveBicycle bicycle = new BalDriveBicycle();// creating object of Bicycle
	
	BalGoPedestrian pedestrian = new BalGoPedestrian();// creating object of Pedestrian
	
    motorvehicle[0] = batterycar;// storing  batterycar object in to array of objects
    
	motorvehicle[1] = puntboat;// storing puntboat object into array of objects
	
	streetlegal[0] =  bicycle;// storing bicycle object into array of objects
	
	streetlegal[1] = pedestrian;// storing pedestrian object into array of objects
	
	for(BalMotorVehicle balmotorvehicle:motorvehicle) {
		System.out.println(balmotorvehicle + "");
	}
	for(BalStreetLegal slegal:streetlegal) {
		System.out.println(slegal + "");
	}
	}
	
}
