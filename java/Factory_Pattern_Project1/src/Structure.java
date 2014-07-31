

public abstract class Structure {
	String name;
	String timeframe;
	String builder;
	String location;
	String length, height, breadth;
	String instructions;
	String materials;
	
	

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	
	public String getTimeframe() {
		return timeframe;
	}
	
	public String getBuilder() {
		return builder;
	}
	
	public String getLocation() {
		return location;
	}
	
	public String getLength() {
		return length;
	}
	
	public String getHeight() {
		return height;
	}
	
	public String getBreadth() {
		return breadth;
	}
	
	public String getInstructions() {
		return instructions;
	}
	
	public String getMaterials() {
		return materials;
	}
	
	public void initHeader() {
		System.out.println("*************START****************");
		System.out.println("Using Factory Method Pattern to build the following structure: " + name + "\n");
	}
	
	public void recieveInstructions() {
		// TODO Auto-generated method stub
		System.out.println("Acquiring Building Instructions for: " + name + "\n"  + instructions +  "\n");
		
		
	}

	public void acquireMaterials() {
		// TODO Auto-generated method stub
		System.out.println("Acquiring Building materials.....\n");
		System.out.println("Building materials for this project are: " + materials + "\n");
	}

	public void buildLength() {
		// TODO Auto-generated method stub
		System.out.println(name + " Shall shall be " + length + "\n" );
	}

	public void buildBreadth() {
		// TODO Auto-generated method stub
		System.out.println(name + " Shall shall be " + breadth + "\n");
	}

	public void buildHeight() {
		// TODO Auto-generated method stub
		System.out.println(name + " Shall shall be " + height + "\n");
	}
	
	public void initStructure() {
		System.out.println("And God said, ye shalt build: " + name + "\n");
		
	}
	
	public void initFooter() {
		System.out.println(name + " Has been completed!\n");
		System.out.println("*************END*******************\n");
	}

}

