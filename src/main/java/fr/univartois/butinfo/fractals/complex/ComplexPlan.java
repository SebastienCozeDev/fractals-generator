package fr.univartois.butinfo.fractals.complex;
/* cette classe  propose une représentation du plan complexe permettant de faire la relation entre les pixels
d’une image et un nombre complexe */

public class ComplexPlan implements IComplexPlan {

	private int height;
	
	private int width;
	
	public ComplexPlan(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public Complex asComplex(int row, int column) {
		double re = (column + .5) - (width / 2.);
		double im = (height / 2.) - (row + .5);
		return new Complex(re,im);
	}

}
