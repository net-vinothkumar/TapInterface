package com.interviewdot.TapInterface;

import java.util.*;

public class TapInterfaceApplication {

	public static void main(String[] args) {

		Tap brassTap = new BrassTap();
		brassTap.tapOpen();

		Tap silverTap = new SilverTap();
		silverTap.tapClose();

		Tap plasticTap = new PlasticTap();
		plasticTap.fix();
		plasticTap.unPlug();

		//Java
		List list 		  = new ArrayList<>();
		List linkedList   = new LinkedList();
		Map map 		  = new HashMap();
		Map linkedHashMap = new LinkedHashMap();

	}
}
