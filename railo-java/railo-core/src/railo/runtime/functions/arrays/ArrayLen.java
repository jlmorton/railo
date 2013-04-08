/**
 * Implements the CFML Function arraylen
 */
package railo.runtime.functions.arrays;

import railo.runtime.PageContext;
import railo.runtime.exp.PageException;
import railo.runtime.functions.BIF;
import railo.runtime.op.Caster;
import railo.runtime.type.Array;

public final class ArrayLen extends BIF {

	private static final long serialVersionUID = -1530118609194349457L;

	public static double call(PageContext pc , Array array) {
		return array.size();
	}
	
	@Override
	public Object invoke(PageContext pc, Object[] args) throws PageException {
		return call(pc,Caster.toArray(args[0]));
	}
}