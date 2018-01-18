package com.router1011.atimemod2.lazymodder.helpers;

public class FlagHelper {
	private int flag;

	public FlagHelper(int startFlag) {
		this.flag = startFlag;
	}
	
	public void reset() {
		flag = 0;
	}
	
	public void or(int bit) {
		flag |= bit;
	}
	
	public boolean and(int bit) {
		return (flag & bit) > 0;
	}
}
