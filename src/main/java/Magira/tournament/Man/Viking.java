package Magira.tournament.Man;

import Magira.tournament.Weapon.Axe;

public class Viking extends Man{

	public Viking() {
		super(120, new Axe());
	}
	
	@Override
    public Viking equip(String s) {
        super.equip(s);
        return this;
    }

}
