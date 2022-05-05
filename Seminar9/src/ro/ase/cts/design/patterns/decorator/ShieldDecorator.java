package ro.ase.cts.design.patterns.decorator;

public class ShieldDecorator extends HeroDecorator {

	int shieldStrenght;
	
	public ShieldDecorator(AbstractHero hero, int shieldPoints) {
		super(hero);
		this.shieldStrenght = shieldPoints;
	}
	
	@Override
	public void defend(int hitPoints) {
		System.out.println("The knight is using a shield!");
		hitPoints -= this.shieldStrenght;
		if(hitPoints > 0)
			this.hero.defend(hitPoints);
		
	}
}
