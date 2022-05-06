package gafita.david.g1098.Composite;

import java.util.ArrayList;
import java.util.List;

public class StockStructure extends HierarchyNode {

	List<HierarchyNode> elements = new ArrayList<>();
	
	@Override
	public String getSymbol() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getName() {
		throw new UnsupportedOperationException();
	}

	@Override
	public double getPrice() {
		double Sum = 0;
		for(HierarchyNode node : elements) {
			Sum += node.getPrice();
		}
		return Sum;
	}

	@Override
	public String getInfo() {
		StringBuffer sb = new StringBuffer();
		for(HierarchyNode node : elements)
			sb.append("\t" + node.getInfo());
		return sb.toString();
	}

	@Override
	public void addChildNode(HierarchyNode node) {
		elements.add(node);
	}

	@Override
	public void deleteChildNode(HierarchyNode node) {
		elements.remove(node);
	}

	@Override
	public HierarchyNode getChildNode(int i) {
		return (HierarchyNode)elements.get(i);
	}
	
	

}
