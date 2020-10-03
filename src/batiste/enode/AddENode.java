package batiste.enode;

public class AddENode extends ENode {
	public ENode e1,e2;
	public static int N_ID = 5;
	public AddENode(ENode e1, ENode e2){
		
		this.e1 = e1;
		this.e2 = e2;
		
		
	}
	public int getN_ID() {
		return N_ID;
	}
	@Override
	public int getValue() {
		return e1.getValue() + e2.getValue();
	}
}
