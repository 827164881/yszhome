package com.microdreams.errorformat;

import java.io.IOException;
import java.util.Properties;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

public class Constance {
    private static Properties ErrorCode = null;
    
    private static final Log LOG = LogFactory.getLog(Constance.class);

    private Constance() {
        //nothing here
    }

    /**
     * 读取错误代码对应的翻译，如果没有找到错误代码，返回Unknow Error
     * 
     * @param code
     *            错误代码
     * @return
     * @since 1.0
     */
    public static String getErrorMessage(int code) {
        // 初始化错误代码表
        if (ErrorCode == null) {
            Resource resource = new ClassPathResource("/errorcode.properties");
            try {
                Properties props = PropertiesLoaderUtils
                        .loadProperties(resource);
                ErrorCode = props;
            } catch (IOException e) {
            	LOG.info(e);
            }
        }
        return ErrorCode!=null?ErrorCode.getProperty(String.valueOf(code), "Unknow Error"):"Unknow Error";
    }
}
