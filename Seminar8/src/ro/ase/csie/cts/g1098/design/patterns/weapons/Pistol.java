package ro.ase.csie.cts.g1098.design.patterns.weapons;

public class Pistol implements IWeapon {
	
	public static final boolean NOT_USING_WATER = false;
	
	String model;
	boolean isUsingWater;
	
	public Pistol(String model, boolean isUsingWater) {
		super();
		this.model = model;
		this.isUsingWater = isUsingWater;
	}

	@Override
	public void shoot() {
		System.out.println("--->--->---> Poc Poc Poc");
		
	}

	@Override
	public void reload(int ammo) {
		System.out.println("Reloading pistol");
		
	}
	
	
}
