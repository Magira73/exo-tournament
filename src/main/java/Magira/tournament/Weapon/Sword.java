package Magira.tournament.Weapon;

public class Sword extends Weapon{

	public Sword() {
		super(5);
	}
	
	@Override
	public boolean equals(Object obj){
	  
	  if(obj == null) return false;
	  
	  if(obj instanceof Sword ) return true;
	  
	  return false;
	}

}
