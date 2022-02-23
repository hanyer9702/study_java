package com.urdomain.lecture.ch06;

public class Earth {

	static final int EARTH_RADIUS = 6400;
	static final int EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = (int) (4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS);
	}
	
	static final String HOME_URL = "https://www.11st.co.kr/main";
}
