package batiste.enode;

public class MinusENode extends ENode {
	public ENode e;
	public static int N_ID = 7;
	public MinusENode(ENode e){
		
		this.e = e;
		
		
		
	}
	public int getN_ID() {
		return N_ID;
	}
	@Override
	public int getValue() {
		return - e.getValue();
	}
}
