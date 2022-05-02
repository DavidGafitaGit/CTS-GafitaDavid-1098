package ro.ase.csie.cts.g1098.design.patterns.weapons;

public class Bazooka implements IWeapon {
	String model;
	float maxDistance;
	
	public Bazooka(String model, float maxDistance) {
		super();
		this.model = model;
		this.maxDistance = maxDistance;
	}
	
	@Override
	public void shoot() {
		System.out.println("Boom boom");
		
	}
	@Override
	public void reload(int ammo) {
		System.out.println("Reloading Bazooka");
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public float getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(float maxDistance) {
		this.maxDistance = maxDistance;
	}
	
	
}
