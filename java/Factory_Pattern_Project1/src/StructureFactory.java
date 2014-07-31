
public abstract class StructureFactory {
	
	abstract Structure createStructure(String item);
	
	public Structure buildStructure(String type) {
		Structure structure = createStructure(type);
		//System.out.println("And God said, ye shall build" + structure.getName());
		structure.initHeader();
		structure.initStructure();
		structure.recieveInstructions();
		structure.acquireMaterials();
		structure.buildLength();
		structure.buildBreadth();
		structure.buildHeight();
		structure.initFooter();
		return structure;
		
	}
	
}
