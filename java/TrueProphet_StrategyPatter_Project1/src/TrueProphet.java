
public abstract class TrueProphet {
	/*
	 * Declare two reference variable for the behavior interface types
	 * All subclasses in the same package inherit these
	 */
	ProphetBehavior prophetBehavior;
	MiracleWorkingBehavior miracleWorkingBehavior;
	
	public TrueProphet() {
		
	}
		
	public void setProphetBehavior (ProphetBehavior pb) {
		prophetBehavior = pb;
	}
	
	public void setMiracleWorkingBehavior (MiracleWorkingBehavior mb) {
		miracleWorkingBehavior = mb;		
	}
	
	
	public void giveProphecy() {
		prophetBehavior.prophesy(); 
		//delegate to the behavior class
	}
	
	public void workMiracle() {
		miracleWorkingBehavior.workMiracle();
		//delegate to behavior class
	} 
}
