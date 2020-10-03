package batiste.enode;



public class VarENode extends ENode {
	public int value;
	public String id;
	public static int N_ID = 6;
	public VarENode(String s){
		
		this.id = s;
		
	}
	public int getN_ID() {
		return N_ID;
	}
	@Override
	public int getValue() {
		return value;
	}
	public void setValue(ENode e) {
		value = e.getValue();
	}
	public void setValue(int d) {
		value = d;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
