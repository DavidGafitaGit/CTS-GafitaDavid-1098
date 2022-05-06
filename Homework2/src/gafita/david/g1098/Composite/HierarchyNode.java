package gafita.david.g1098.Composite;

public abstract class HierarchyNode {
	
	public abstract String getSymbol();
	public abstract String getName();
	public abstract double getPrice();
	
	public String getInfo(){
		return this.getSymbol() + " - "+ this.getName() + " - " + this.getPrice();
	}
	
	public void addChildNode(HierarchyNode node)
	{
		throw new UnsupportedOperationException();
	}
	
	public void deleteChildNode(HierarchyNode node){
		throw new UnsupportedOperationException();
	}
	
	public HierarchyNode getChildNode(int i){
		throw new UnsupportedOperationException();
	}
	
}
