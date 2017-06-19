package com.master.dearmaster.util;

import org.apache.log4j.Logger;
import sun.reflect.Reflection;

public class LoggerFactory {

    public static final Logger getLogger() {
        return Logger.getLogger(Reflection.getCallerClass().getSimpleName());
    }

}