package practice13.common;

public class SuperHero extends Hero{


	public SuperHero() {
		super(25, 10, 7);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	private Item equipment;

	public void setEquipment(Item equipment) {

		this.equipment = equipment;

	}
	public Item getEquipment() {

		return this.equipment;

	}


	public int attack() {

		return super.attack() + this.equipment.getAdditionalDamage();

	}

}
