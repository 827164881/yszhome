package com.microdreams.modules.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class QiNiuImageUtil {

  private static final Logger LOGGER = LoggerFactory.getLogger(QiNiuImageUtil.class);
  public static final String IMGURL = "http://qcjrh5testimgs.geekdana.com/";
  public static final String ACCESS_KEY = "fKfi5yWOWnq19P61pq1mwHwoDpqwBcAJ_sh2wHeY";
  public static final String SECRET_KEY = "jfuW2dhpyWrNz1TKEgsid2tU9e7tG1bHj_s7DK_4";
  public static final String BUCKET = "qcjr_test";
  public static final String PROJECT_NAME = "qcjrcms/";


  private QiNiuImageUtil(){}

  public static String getKeyByUrl(String url) {
    if(StringUtils.isEmpty(url))return "";
    int index=url.lastIndexOf('/');
    if(index!=-1) {
      url=url.substring(index+1, url.length()-1);
    }
    return url;
  }

  public static String addPrefixPath(String imgKey) {
    if (org.springframework.util.StringUtils.isEmpty(imgKey)){return "";}
    if (imgKey.startsWith("/") || imgKey.startsWith("\\")) {
      return IMGURL + imgKey.substring(1,imgKey.length());
    } else {
      return IMGURL + imgKey;
    }
  }

  public static String removePrefixPath(String imgPath) {
    if (org.springframework.util.StringUtils.isEmpty(imgPath)){return "";}
    imgPath=imgPath.replaceAll(PROJECT_NAME,"");
    return imgPath.replaceAll(IMGURL,"/");
  }
}
