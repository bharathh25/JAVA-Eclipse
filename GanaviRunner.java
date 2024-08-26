class GanaviRunner{
	public static void main(String[] args){
		
		Clip clip = new Clip("Black", "Plastic");
		Ganavi ganavi = new Ganavi("ganavi420@gmail.com",clip);
		ganavi.display();
		
		System.out.println("---------------------");
		
		Clip clip1 = new Clip("Red", "Plastic");
		Ganavi ganavi1 = new Ganavi("ganavi840@gmail.com",clip1);
		ganavi1.display();
		
		System.out.println("---------------------");
		
		Clip clip2 = new Clip("Yellow", "Plastic");
		Ganavi ganavi2 = new Ganavi("ganavi1260@gmail.com",clip2);
		ganavi2.display();
		
		System.out.println("---------------------");
	}
}