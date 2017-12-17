package com.boot.replicastackoverflow.util;

import org.springframework.stereotype.Component;

@Component
public class OverflowUtil {
private String username;
	public String separateUsername(String value) {
		String[] s1 = value.split(":");
		username = s1[0];
		return username;
	}
}
