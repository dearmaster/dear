package com.master.dearmaster.util;

import org.apache.log4j.Logger;

public class LoggerFactory {

    public static final Logger getLogger(Class<?> c) {
        return Logger.getLogger(c.getSimpleName());
    }

}