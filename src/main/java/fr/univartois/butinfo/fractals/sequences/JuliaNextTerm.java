package fr.univartois.butinfo.fractals.sequences;

import fr.univartois.butinfo.fractals.complex.IComplex;

/**
 * La classe JuliaNextTerm correspond à la stratégie (strategy) pour calculer le
 * prochain terme de la suite de Julia.
 *
 * @author Sébastien Coze
 *
 * @version 0.1.0
 */
public class JuliaNextTerm implements INextTerm {

	/**
	 * Premier terme de la suite de Julia.
	 */
	private IComplex firstTerm;

	/**
	 * Terme courant de la suite.
	 */
	private IComplex presentTerm;

	/**
	 * Nombre complexe z permettant de générer la suite de Julia.
	 */
	private IComplex z;

	/**
	 * Nombre complexe c permettant de générer la suite de Julia.
	 */
	private IComplex c;
	
	/**
	 * Suite de la strategy.
	 */
	private Sequence sequence;

	/**
	 * Crée une nouvelle instance de JuliaNextTerm.
	 * 
	 * @param z Le nombre complexe z de la suite de Julia.
	 * @param c Le nombre complexe c de la suite de Julia.
	 */
	public JuliaNextTerm(IComplex z, IComplex c, Sequence sequence) {
		//System.out.println(sequence);
		setFirstTerm(c.add(z.multiply(z)));
		this.sequence = sequence;
	}

	@Override
	public IComplex calculateNextTerm(IComplex lastTerm) {
		if (lastTerm == null)
			return firstTerm;
		else
			return c.add(lastTerm.multiply(z.multiply(z)));
	}
	
	public IComplex getFirstTerm() {
		return firstTerm;
	}

	@Override
	public void setFirstTerm(IComplex firstTerme) {
		this.firstTerm = firstTerme;
		sequence.setFirstTerm(firstTerme);
		sequence.setPresentTerm(firstTerme);
	}
	
	public IComplex getPresentTerm() {
		return presentTerm;
	}

	@Override
	public void setPresentTerm(IComplex presentTerm) {
		this.presentTerm = presentTerm;
		sequence.setPresentTerm(presentTerm);
	}

}
