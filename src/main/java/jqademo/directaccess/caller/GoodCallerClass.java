package jqademo.directaccess.caller;

import jqademo.directaccess.proxy.ProxyInterface;

/**
 * Normal access through proxy
 */
public class GoodCallerClass {

	private ProxyInterface proxyInterfaceInterface;

	public GoodCallerClass(ProxyInterface proxyInterfaceInterface) {
		this.proxyInterfaceInterface = proxyInterfaceInterface;
	}

	public String callWithProxy(String value) {
		return proxyInterfaceInterface.getCheckedValue(value);
	}
}
