import java.util.*;

public class DroneGenerator {
	public static List<Drone> generateDrones(long n, double rangeX, double rangeY, double rangeZ) {
        Random rand = new Random();
        List<Drone> drones = new ArrayList<>();

        for (long i = 0; i < n; i++) {
        	double x = rand.nextDouble() * rangeX;
        	double y = rand.nextDouble() * rangeY;
        	double z = rand.nextDouble() * rangeZ;
            drones.add(new Drone(i, x, y, z));
        }
        return drones;
    }
}
