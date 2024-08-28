class BloodRunner {
    public static void main(String[] args){
        System.out.println("runnig main method");
		
        String result=Blood.group("B+");
        System.out.println("Blood Group : "+result);
		
        String name=Blood.personName("DEV");
        System.out.println("Name : "+name);
		
        double cost=Blood.cost(2000);
        System.out.println("Cost : "+cost);
       
		
        char tested=Blood.hospitalTested('F');
        System.out.println("Hospital tested : "+tested);
        
		
        boolean sick=Blood.sickness(true);
        System.out.println("Sick : "+sick);
        
		
        boolean donate=Blood.donate(true);
        System.out.println("Donate : "+donate);
		
    }
}