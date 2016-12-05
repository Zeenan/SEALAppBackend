package org.seal.util;

public class SlugGenerator {
	
	public static String generateSlug(String name) {
		
		String[] sliced = name.split(" ");
		String slug = "";
		
		for(String slice : sliced) {
			
			if (!slice.equals(sliced[sliced.length-1])) {
				slug = slug.concat(slice + "_").toLowerCase();
			} else {
				slug = slug.concat(slice).toLowerCase();
			}
		}
		
		return slug;
	}

}
