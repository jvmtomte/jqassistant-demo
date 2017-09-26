package jqademo.directaccess.caller;

import jqademo.directaccess.target.TargetClass;

/**
 * Our evil direct caller
 */
public class EvilCallerClass {

	private TargetClass targetClass;

	public EvilCallerClass() {
		this.targetClass = new TargetClass();
	}

	public String getUncheckedValue(String param) {
		return targetClass.getValue(param); // here is the evil part
	}
}
