package batiste.util;

import java.io.PrintWriter;

import batiste.svgnode.AnimateTransformSVGNode;
import batiste.svgnode.AnimationSVGNode;
import batiste.svgnode.CircleSVGNode;
import batiste.svgnode.ContainerSVGNode;
import batiste.svgnode.LineSVGNode;
import batiste.svgnode.PolygonSVGNode;
import batiste.svgnode.RacineSVGNode;
import batiste.svgnode.RectSVGNode;
import batiste.svgnode.SVGNode;
import batiste.svgnode.TextSVGNode;

public abstract  class Visitor {
	protected PrintWriter pw;
	public abstract void visitNode(LineSVGNode n);
	public abstract void visitNode(AnimateTransformSVGNode n);
	public abstract void visitNode(AnimationSVGNode n);
	public abstract void visitNode(RacineSVGNode n);
	public abstract void visitNode(RectSVGNode n);
	public abstract void visitNode(CircleSVGNode n);
	public abstract void visitNode(TextSVGNode n);
	public abstract void visitNode(ContainerSVGNode n);
    public abstract void visitNode(PolygonSVGNode n);
	public void visitNode(SVGNode n) {
		for (int i = 1; i< n.getProfondeur(); i++){
			this.pw.write("  ");
		}
		switch (n.getN_ID()) {
			case 1:
				visitNode((RacineSVGNode) n);
				break;
			case 2:
				visitNode((RectSVGNode) n);
				break;
			case 3:
				visitNode((AnimationSVGNode) n);
				break;
			case 4:
				visitNode((LineSVGNode) n);
				break;
			case 5:
				visitNode((CircleSVGNode) n);
				break;
			case 6:
				visitNode((TextSVGNode) n);
				break;
			case 7:
				visitNode((ContainerSVGNode) n);
				break;
			case 8:
				visitNode((AnimateTransformSVGNode) n);
				break;
			case 9:
				visitNode((PolygonSVGNode) n);
				break;
				
		}
	
	}
	
	

}
