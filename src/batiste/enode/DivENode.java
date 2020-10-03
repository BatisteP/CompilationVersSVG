package batiste.enode;

public class DivENode extends ENode {
	public ENode e1,e2;
	public static int N_ID = 4;
	public DivENode(ENode e1, ENode e2){
		
		this.e1 = e1;
		this.e2 = e2;
		
		
	}
	public int getN_ID() {
		return N_ID;
	}
	@Override
	public int getValue() {
		if (e2.getValue() != 0) {
			return e1.getValue() / e2.getValue();
		}
		else return 0;
	}
}
