package fr.univartois.butinfo.fractals.complex;

/**
 * La classe {@link AdaptateurComplex} correspond à l'adaptateur permettant de
 * calculer des suites de points dans le plan réel.
 * 
 * @author Shahin Shakuri
 * 
 * @version 0.1.0
 */
public class AdaptateurComplex implements IPlanPoint {

	/**
	 * Le nombre complexe.
	 */
	private IComplex complex;

	/**
	 * Crée une instance de {@link AdaptateurComplex}.
	 * 
	 * @param complex Le nombre complexe de l'adaptateur.
	 */
	public AdaptateurComplex(IComplex complex) {
		this.complex = complex;
	}

	@Override
	public double x() {
		return this.complex.getRealPart();
	}

	@Override
	public double y() {
		return this.complex.getImaginaryPart();
	}

	@Override
	public double distance(IPlanPoint point) {
		return Math.sqrt(Math.pow(point.x() - x(), 2) + Math.pow(point.y() - y(), 2));
	}

	@Override
	public IComplex convertirEnIComplex() {
		return complex;
	}

}
