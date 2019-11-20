package controle;

public abstract class Aparelho implements Controle{

	private boolean status;
	private int volume;
	
	public void getStatus() {
		if(this.status==true) {
			System.out.println("ON");
		}
		else {
			System.out.println("OFF");
		}
	}
	
	public void setStatus() {
		if(this.status==true) {
			this.status=false;
		}
		else {
			this.status=true;
		}
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	public void power() {
		if(status==true) {
			status=false;
		}
		else {
			status=true;
		}
	}
	
}