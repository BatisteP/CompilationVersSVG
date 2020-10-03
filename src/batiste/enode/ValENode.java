package batiste.enode;


public class ValENode extends ENode{
	public static int N_ID = 1;
	public int value;
	public ValENode(int val){
		
		
		this.value = val;
		
	}
	public int getN_ID() {
		return N_ID;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
