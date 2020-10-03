package batiste;

import java.util.HashMap;

import batiste.svgnode.RacineSVGNode;
import batiste.svgnode.SVGNode;
import batiste.util.Factory;

public class Context {
	public RacineSVGNode racine;
	public Factory factory;
	public SVGNode currentParent;
	public SVGNode getCurrentParent() {
		return currentParent;
	}
	public void setCurrentParent(SVGNode currentParent) {
		this.currentParent = currentParent;
	}

	public HashMap<String, Integer> symMap;
	public Context(){
		this.factory = new Factory(this);
		this.symMap = new HashMap<String, Integer>();

	}
	
	public HashMap<String, Integer> getSymMap() {
		return symMap;
	}
	public void setSymMap(HashMap<String, Integer> symMap) {
		this.symMap = symMap;
	}
	public Factory getFactory() {
		return factory;
	}

	public void setFactory(Factory factory) {
		this.factory = factory;
	}

	public RacineSVGNode getRacine() {
		return racine;
	}

	public void setRacine(RacineSVGNode racine) {
		this.racine = racine;
		this.currentParent = racine;
	}
}
