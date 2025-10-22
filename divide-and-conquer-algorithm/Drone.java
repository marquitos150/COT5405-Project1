public class Drone {
	private long id;
	
	private double x;
    private double y;
    private double z;

    public Drone(long id, double x, double y, double z) {
    	this.id = id;
    	
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public long getID() {
    	return id;
    }
    
    public double getX() {
    	return x;
    }
    
    public double getY() {
    	return y;
    }
    
    public double getZ() {
    	return z;
    }
}
