package com.pdsu.scs.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateUtils {

	public static String getSimpleDate() {
		
		return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		
	}
	
}
