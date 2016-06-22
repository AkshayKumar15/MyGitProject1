package pack1;

class HomeSecuritySystem{
	boolean isDoorOpen = false;
	boolean isArmed = false;
	float onDuration = 0.0f;
	String passCode = "";
	
        //constructor
	HomeSecuritySystem(){
	}
	
        //constructor
	HomeSecuritySystem(boolean isArmed){
		this.isArmed = isArmed;
	}
	
        //constructor
	HomeSecuritySystem(boolean isDoorOpen, boolean isArmed, float onDuration){
		this.isDoorOpen = isDoorOpen;
		this.isArmed = isArmed;
		this.onDuration = onDuration;
	}
	
        //constructor
	HomeSecuritySystem(String passCode){
		this.passCode = passCode;
	}
	
        //setArmedStatus method
	public void setArmedStatus(boolean status){
		this.isArmed = status;
	}
	
        //getDoorStatus method
	public boolean getDoorStatus(){
		return this.isDoorOpen;
	}
	
        //setOnDuration method
	public void setOnDuration(float duration){
		this.onDuration = duration;
	}
	
        //getOnDuration method
	public float getOnDuration(){
		return this.onDuration;
	}
	
        //setPassCode method
	public void setPassCode(String passCode){
		this.passCode = passCode;
	}
	
        
        //main method
	public static void main(String[] args){
		HomeSecuritySystem hs1 = new HomeSecuritySystem(false, true, 1.0f);
		System.out.println("Armed Status before: " + hs1.isArmed);
		hs1.setArmedStatus(false);
		System.out.println("Armed Status after: " + hs1.isArmed);
		System.out.println("On duration before: " + hs1.onDuration);
		hs1.setOnDuration(2.0f);
		System.out.println("On duration after: " + hs1.onDuration);
		HomeSecuritySystem hs2 = new HomeSecuritySystem("abc");
		System.out.println("Passcode before: " + hs2.passCode);
		hs2.setPassCode("def");
		System.out.println("Passcode after: " + hs2.passCode);
	}

}

