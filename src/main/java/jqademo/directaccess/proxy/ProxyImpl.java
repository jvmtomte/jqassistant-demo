package jqademo.directaccess.proxy;

import jqademo.directaccess.target.TargetClass;

import java.util.Objects;

/**
 * A simple proxy with null safety
 */
public class ProxyImpl implements ProxyInterface {

	private TargetClass targetClass = new TargetClass();

	@Override
	public String getCheckedValue(String param) {
		String arg = targetClass.getValue(param);
		if (Objects.isNull(arg)) {
			return "";
		}
		return arg;
	}
}
