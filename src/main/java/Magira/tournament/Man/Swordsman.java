package Magira.tournament.Man;

import Magira.tournament.Weapon.Sword;

public class Swordsman extends Man{

	public Swordsman() {
		super(100,new Sword());
	}
	
	@Override
    public Swordsman equip(String s) {
        super.equip(s);
        return this;
    }

}
