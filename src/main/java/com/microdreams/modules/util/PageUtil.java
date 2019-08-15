package com.microdreams.modules.util;

public class PageUtil {

	private PageUtil() {
	}

	public static int ifNextPage(int page, int size, int total) {
		if (total < size) {
			return 1;
		}
		if (total > size * page) {
			return 0;
		} else {
			return 1;
		}
	}
}
