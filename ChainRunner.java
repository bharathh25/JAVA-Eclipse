class ChainRunner {
    public static void main(String[] args){
        System.out.println("runnig main method");
		
        int carat=Chain.carat(24);
	    System.out.println("carat : "+carat);
        
		
        double price=Chain.costPerGram(6000);
        System.out.println("cost_per_gram : "+price);
        
		
        String chainType=Chain.type("Rope Chain");
        System.out.println("chaintype : "+chainType);
        
		
        String quality=Chain.quality("First class");
        System.out.println("quality : "+quality);
        
		
        int quantity=Chain.quantity(2);
        System.out.println("quantity : "+quantity);
        
		
        String wastage=Chain.wastage("10%");
        System.out.println("quantity : "+wastage);
        
		
        double serviceCharge=Chain.serviceCharge(500);
        System.out.println("serviceCharge : "+serviceCharge);
        
		
        double gst=Chain.gst(100);
        System.out.println("gst : "+gst);
    }
}