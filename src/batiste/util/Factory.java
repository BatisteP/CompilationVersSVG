package batiste.util;

import java.util.ArrayList;

import batiste.Context;
import batiste.enode.AddENode;
import batiste.enode.DivENode;
import batiste.enode.ENode;
import batiste.enode.MinusENode;
import batiste.enode.MulENode;
import batiste.enode.SubENode;
import batiste.enode.ValENode;
import batiste.enode.VarENode;
import batiste.svgnode.AnimateTransformSVGNode;
import batiste.svgnode.AnimationSVGNode;
import batiste.svgnode.CircleSVGNode;
import batiste.svgnode.ContainerSVGNode;
import batiste.svgnode.LineSVGNode;
import batiste.svgnode.PolygonSVGNode;
import batiste.svgnode.RacineSVGNode;
import batiste.svgnode.RectSVGNode;
import batiste.svgnode.TextSVGNode;


public class Factory {
	private Context context;
	public Factory(Context context) {
		this.context = context;
	}
	public RectSVGNode createRectangleNode(int width, int length, int x, int y, String c) {
		return new RectSVGNode(width,length,x,y,c, this.context.getCurrentParent());
		
		
	}
	public RectSVGNode createNamedRectangleNode(String name, int width, int length, int x, int y, String c,String transf) {
		return new RectSVGNode(width,length,x,y,c,transf,name, this.context.getCurrentParent());
		
		
	}
	public ContainerSVGNode createContainerNode(String name, String c,int strokeWidth, String animation) {
		return new ContainerSVGNode(c,strokeWidth, animation, name, this.context.getCurrentParent());
		
		
	}
	public CircleSVGNode createNamedCircleNode(String name, int cx, int cy, int r, String c){
		return new CircleSVGNode(cx, cy, r, c, name, this.context.getCurrentParent());
		
		
	}
	public CircleSVGNode createCircleNode( int cx, int cy, int r, String c){
		return new CircleSVGNode(cx, cy, r, c, this.context.getCurrentParent());
		
		
	}
	public TextSVGNode createNamedTextNode(String id, int x, int y, String text){
		return new TextSVGNode(x, y, text, id, this.context.getCurrentParent());
		
		
	}
	public RacineSVGNode createRacineNode(int width, int length) {
		if (this.context.getRacine() == null) {
			this.context.setRacine(new RacineSVGNode(width,length,null))   ;
			return this.context.getRacine();
		}
		else {
			return this.context.getRacine();
		}
		
	}
	public ValENode createValueENode(int i) {
		return new ValENode(i);
	}
	public AddENode createAddENode(ENode e1, ENode e2) {
		return new AddENode(e1,e2);
	}
	public SubENode createSubENode(ENode e1, ENode e2) {
		return new SubENode(e1,e2);
	}
	public MulENode createMultENode(ENode e1, ENode e2) {
		return new MulENode(e1,e2);
	}
	public DivENode createDivENode(ENode e1, ENode e2) {
		return new DivENode(e1,e2);
	}
	public MinusENode createMinusENode(ENode e1) {
		return new MinusENode(e1);
	}
	public VarENode createVarENode(String id) {
		return new VarENode(id);
	}
	public AnimationSVGNode createNamedAnimation(String name,String on, String attribut, String from, String to, int duree, String begin,
			String actionAtEnd) {
		
		return new AnimationSVGNode(from, to, duree, begin,  attribut,actionAtEnd, this.context.getCurrentParent(), on, name);
	}
	public AnimateTransformSVGNode createNamedAnimateTransform(String name,String on,String type, String attribut, String from, String to, int duree, String begin,
			String repeatCount) {
		
		return new AnimateTransformSVGNode(from, to, duree, begin,  repeatCount,type,attribut, this.context.getCurrentParent(), on, name);
	}
	public LineSVGNode createNamedLineNode(String id, int x1, int y1, int x2, int y2, String color) {
		return new LineSVGNode(x1, y1, x2, y2,id,color, this.context.getCurrentParent());
		
	}
	public PolygonSVGNode createNamedPolygonNode(String id, String pts, String color, String transf) {
		// TODO Auto-generated method stub
		
		return new PolygonSVGNode(this.context.getCurrentParent(), splittingPoints(pts),id,color, transf);
	}
	public ArrayList<Point> splittingPoints(String pts){
		
		String[] splited = pts.split(" ");
		ArrayList<Point> array = new ArrayList<Point>();
		for(String s : splited) {
			if (!s.equals("")) {
				String[] resplitted = s.split(",");
				
				Point p = new Point(Integer.parseInt(resplitted[0]),Integer.parseInt(resplitted[1]));
				array.add(p);
			}
			
		}
		return array;
		
	}
	

}
