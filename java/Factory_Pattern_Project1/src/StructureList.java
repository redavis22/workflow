
public class StructureList extends StructureFactory {

	//@Override
	Structure createStructure(String item) {
		if (item.equals("ark")) {
			return new NoahsArk();
		} else if (item.equals("temple")) {
			return new SolomonsTemple();
		} else {
		}
		return null;	
		}
		
			
	}

