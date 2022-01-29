package Magira.tournament.Man;

import Magira.tournament.Weapon.Weapon;

public class Man {
	private int pv;  //nombre de point de vie de base
	private Weapon weapon;  //arme utilisé
	
	public Man(int pv, Weapon weapon) {
		this.pv = pv;
		this.weapon = weapon;
	}
	
	public int hitPoints() {
		return this.pv;
	}
	
	//méthode pour engager le combat contre un autre personnage
	public void engage(Man p2) {
		while(this.hitPoints() != 0 && p2.hitPoints() != 0) {
			this.attack(p2);
			if(p2.hitPoints() != 0) {
				p2.attack(this);
			}
		}
	}

	//méthode appelé quand le personnage donne un coup 
	private void attack(Man p2) {
		int damage = this.weapon.getDamage();
		p2.hit(damage);
	}

	//méthode appelé quand le personnage reçoi un coup
	private void hit(int damage) {
		int newPv = this.pv - damage;
		if(newPv < 0) {
			newPv = 0;
		}
		this.setPv(newPv);
		
	}

	private void setPv(int newPv) {
		this.pv = newPv;		
	}

}
