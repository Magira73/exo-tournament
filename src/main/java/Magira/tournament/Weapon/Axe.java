package Magira.tournament.Weapon;

public class Axe extends Weapon{

	public Axe() {
		super(6);
	}
	
	@Override
	public boolean equals(Object obj){
	  
	  if(obj == null) return false;
	  
	  if(obj instanceof Axe) return true;
	  
	  return false;
	}

}
