package com.microdreams.modules.util;

import org.springframework.util.StringUtils;

public class QcjrUtil {

    private QcjrUtil() {
    }

    public static String dealTags(String tags){
        if(!StringUtils.isEmpty(tags))
            tags = tags.replaceAll("，",",");
        return tags;
    }
}
