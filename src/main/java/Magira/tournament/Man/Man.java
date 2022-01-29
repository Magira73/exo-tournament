package Magira.tournament.Man;

import Magira.tournament.Weapon.Axe;
import Magira.tournament.Weapon.Weapon;
import Magira.tournament.equipment.Buckler;

public class Man {
	private int pv;  //nombre de point de vie de base
	private Weapon weapon;  //arme utilisé
	private Buckler buckler;
	
	public Man(int pv, Weapon weapon) {
		this.pv = pv;
		this.weapon = weapon;
	}
	
	public int hitPoints() {
		return this.pv;
	}
	
	//méthode pour engager le combat contre un autre personnage
	public void engage(Man p2) {
		int countRound = 0;
		while(this.hitPoints() != 0 && p2.hitPoints() != 0) {
			if(countRound%2 == 0) {
				this.attackBloc(p2);
				if(p2.hitPoints() != 0) {
					p2.attackBloc(this);
				}
			}else {
				this.attack(p2);
				if(p2.hitPoints() != 0) {
					p2.attack(this);
				}
			}
			countRound++;
		}
		System.out.println();
	}
	
	
	// méthode pour rajouté de l'équipement au personnage
	public Man equip(String s) {
		switch(s) {
			case "buckler":
				this.buckler = new Buckler();
				break;
			default:
				break;
		}
		return this;
	}

	//méthode appelé quand l'adversaire essaye de bloqué l'attaque avec son bouclier
		private void attackBloc(Man p2) {
			int damage = this.weapon.getDamage();
			if(p2.buckler() && this.weapon.equals(new Axe())) {
				if(p2.hitBuckler() < 0) {
					p2.breakBuckler();
				}
			}else if(!p2.buckler()) {
				p2.hit(damage);
			}
			
		}

	//méthode appelé quand le personnage donne un coup 
	private void attack(Man p2) {
		int damage = this.weapon.getDamage();
		p2.hit(damage);
		
	}

	private void breakBuckler() {
		this.buckler = null;		
	}

	//méthode appelé si son bouclier est frappé par une hache
	private int hitBuckler() {
		if(this.buckler.hit() < 0) {
			return -1;
		}else {
			return 1;
		}
		
	}

	//méthode pour savoir si le personnage à un bouclier
	private boolean buckler() {
		if(buckler != null) {
			return true;
		}else {
			return false;
		}
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
