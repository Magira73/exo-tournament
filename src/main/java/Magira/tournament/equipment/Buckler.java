package Magira.tournament.equipment;

public class Buckler {
	private int pv;
	
	public Buckler() {
		this.pv = 3;
	}

	public int hit() {
		this.pv = this.pv - 1;
		if(this.pv > 0) {
			return 1;
		}else {
			return -1;
		}
	}

}
