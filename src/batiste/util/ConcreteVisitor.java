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

public class ConcreteVisitor extends Visitor {
	
	public ConcreteVisitor(PrintWriter p) {
		this.pw = p;
	}
	public void visitNode(RectSVGNode paramNode) {
		this.pw.write( "<rect ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("width=\""+paramNode.getWidth()+"\" height=\""+paramNode.getHeight()+"\" x=\""+paramNode.getX()+"\" y=\""+paramNode.getY()+"\" fill=\""+paramNode.getColor()+"\"");
		if (paramNode.getTransf()!=null) {
			this.pw.write(" transform=\""+paramNode.getTransf()+"\"");
		}
		if(paramNode.getChildren().size() == 0) {
			this.pw.write("/>");
		}
		else {
			this.pw.write(">");
		}
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		
		if(paramNode.getChildren().size() > 0) {
			this.pw.write("\r\n");
			for (int i = 1; i< paramNode.getProfondeur(); i++){
				this.pw.write("  ");
			}
			this.pw.write( "</rect>");
		}
	}
	public void visitNode(RacineSVGNode paramNode) {
		this.pw.write("<?xml version=\"1.0\" encoding=\"utf-8\"?>\r\n" + 
				"<svg xmlns=\"http://www.w3.org/2000/svg\" version=\"1.1\" width=\""+paramNode.getWidth()+"\" height=\""+paramNode.getHeigth()+"\"\r\n" + 
				"     xmlns:xlink=\"http://www.w3.org/1999/xlink\">\r\n" +
				"  <title>Exemple simple de figure SVG</title>\r\n" + 
				"  <desc>\r\n" + 
				"    genere par l'API de batiste Pretesac, TP compilation 2020\r\n" + 
				"  </desc>");
		for ( SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n");
			visitNode(c);
		}
		this.pw.write( "\n</svg>");
	}
	@Override
	public void visitNode(AnimationSVGNode paramNode) {
		 this.pw.write( "<animate" ); 
		 if (paramNode.getXlink() != null)	this.pw.write("  xlink:href=\"#"+paramNode.getXlink()+"\"");	 
		 this.pw.write(" attributeName=\""+paramNode.getAttributeName()+"\""+
				" from=\""+paramNode.getFrom()+"\"" + 
				" to=\""+paramNode.getTo()+"\"" + 
				" dur=\""+paramNode.getDur()+"s\"" + 
				" begin=\""+paramNode.getBegin()+"\"" + 
				" fill=\""+paramNode.getFill()+"\"");
		 if (paramNode.getId()!=null) {
			this.pw.write(" id=\""+paramNode.getId()+"\"");
			//System.out.println("pogchamp");
		 }
		 this.pw.write("/>");
		
	}
	@Override
	public void visitNode(CircleSVGNode paramNode) {
		this.pw.write( "<circle ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("cx=\""+paramNode.getCx()+"\" cy=\""+paramNode.getCy()+"\" r=\""+paramNode.getR()+"\" fill=\""+paramNode.getColor()+"\"");
		if (paramNode.getTransf()!=null) {
			this.pw.write(" transform=\""+paramNode.getTransf()+"\"");
		}
		if(paramNode.getChildren().size() == 0) {
			this.pw.write("/>");
		}
		else {
			this.pw.write(">");
		}
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		if(paramNode.getChildren().size() > 0) {
			this.pw.write("\r\n");
			for (int i = 1; i< paramNode.getProfondeur(); i++){
				this.pw.write("  ");
			}
			this.pw.write( "</circle>");
		}
		
	}
	public void visitNode(LineSVGNode paramNode) {
		this.pw.write( "<line ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("x1=\""+paramNode.getX1()+"\" y1=\""+paramNode.getY1()+"\" x2=\""+paramNode.getX2()+"\" y2=\""+paramNode.getY2()+"\" stroke=\""+paramNode.getColor()+"\"");
		if(paramNode.getChildren().size() == 0) {
			this.pw.write("/>");
		}
		else {
			this.pw.write(">");
		}
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		if(paramNode.getChildren().size() > 0) {
			this.pw.write("\r\n");
			for (int i = 1; i< paramNode.getProfondeur(); i++){
				this.pw.write("  ");
			}
			this.pw.write( "</line>");
		}
		
	}
	@Override
	public void visitNode(TextSVGNode paramNode) {
		this.pw.write( "<text ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("x=\""+paramNode.getX()+"\" y=\""+paramNode.getY()+"\"");
		this.pw.write(">");
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		this.pw.write(paramNode.getText());
		this.pw.write("\r\n");
		for (int i = 1; i< paramNode.getProfondeur(); i++){
			this.pw.write("  ");
		}
		this.pw.write( "</text>");
		
		
	}
	@Override
	public void visitNode(ContainerSVGNode paramNode) {
		this.pw.write( "<g ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("stroke=\""+paramNode.getColor()+"\" stroke-width=\""+paramNode.getStrokeWidth()+"\" transform=\""+paramNode.getTransformation()+"\"");
		this.pw.write(">");
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		this.pw.write( "\n  </g>");
		
		
	}
	@Override
	public void visitNode(AnimateTransformSVGNode paramNode) {
		 this.pw.write( "<animateTransform" ); 
		 if (paramNode.getXlink() != null)	this.pw.write("  xlink:href=\"#"+paramNode.getXlink()+"\"");	 
		 this.pw.write(" attributeName=\""+paramNode.getAttributeName()+"\""+
				" from=\""+paramNode.getFrom()+"\"" + 
				" to=\""+paramNode.getTo()+"\"" + 
				" dur=\""+paramNode.getDur()+"s\"" + 
				" begin=\""+paramNode.getBegin()+"\"" + 
				" repeatCount=\""+paramNode.getRepeatCount()+"\""+
				" type=\""+paramNode.getType()+"\"");
		 if (paramNode.getId()!=null) {
			this.pw.write(" id=\""+paramNode.getId()+"\"");
			//System.out.println("pogchamp");
		 }
		 this.pw.write("/>");
		
	}
	@Override
	public void visitNode(PolygonSVGNode paramNode) {
		
		this.pw.write( "<polygon ");
		if (paramNode.getID() != null) this.pw.write( "id=\""+paramNode.getID()+"\" ");
		this.pw.write("fill=\""+paramNode.getColor()+"\"");
		if (paramNode.getTransf()!=null) {
			this.pw.write(" transform=\""+paramNode.getTransf()+"\"");
		}
		this.pw.write(" points=\""+Point.pointsToString(paramNode.getAr())+"\"");
		if(paramNode.getChildren().size() == 0) {
			this.pw.write("/>");
		}
		else {
			this.pw.write(">");
		}
		for (SVGNode c : paramNode.getChildren()) {
			this.pw.write( "\n\r");
			visitNode(c);
		}
		
		if(paramNode.getChildren().size() > 0) {
			this.pw.write("\r\n");
			for (int i = 1; i< paramNode.getProfondeur(); i++){
				this.pw.write("  ");
			}
			this.pw.write( "</polygon>");
		}
		
	}


}
