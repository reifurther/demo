package com.cup.common;

public class Count {
	
	//点击次数 ，应设为静态变量，全局共享
	static private int hitCounts;

	public static int getHitCounts() {
		return hitCounts;
	}

	public static void setHitCounts(int hitCounts) {
		Count.hitCounts = hitCounts;
	}

}
