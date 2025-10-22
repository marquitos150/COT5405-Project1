import java.util.*;

public class DroneDetector {
	private static double calcDist3D(Drone a, Drone b) {
		return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) 
				+ Math.pow(a.getY() - b.getY(), 2) 
				+ Math.pow(a.getZ() - b.getZ(), 2));
	}
	
	private static void printClosestPair(Drone a, Drone b) {
		System.out.println("Closest pair:");
		System.out.println("[" + a.getID() + "]: (" 
				+ a.getX() + ", " + a.getY() + ", " + a.getZ() + ")");
		System.out.println("[" + b.getID() + "]: (" 
				+ b.getX() + ", " + b.getY() + ", " + b.getZ() + ")");
	}
	
	// divide and conquer algorithm
	private static double findClosestPairDivideAndConquer(List<Drone> drones) {		
		if (drones.size() <= 1)
			return Double.MAX_VALUE;
		
		if (drones.size() == 2) {
			Drone a = drones.get(0);
			Drone b = drones.get(1);
			printClosestPair(a, b);
			
			return calcDist3D(a, b);
		}
		
		// divide and conquer still needs to be implemented
		return -1;
	}
	
	public static double getMinDistanceBetweenPairOfDrones(List<Drone> drones) {
		if (drones == null || drones.isEmpty())
			return -1;
		
		drones.sort(Comparator.comparingDouble(m -> m.getX()));
		
		return findClosestPairDivideAndConquer(drones);
	}
}
