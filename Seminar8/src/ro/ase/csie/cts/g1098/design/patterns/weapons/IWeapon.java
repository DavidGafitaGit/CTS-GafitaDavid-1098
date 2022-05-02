package ro.ase.csie.cts.g1098.design.patterns.weapons;

public interface IWeapon extends Cloneable {

	public abstract void shoot();
	public abstract void reload(int ammo);
}
