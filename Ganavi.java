class Ganavi{
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
	}
	
	public void display(){
		this.clip.details();
		System.out.println("Ganavi Email :"+this.email);
	}
}