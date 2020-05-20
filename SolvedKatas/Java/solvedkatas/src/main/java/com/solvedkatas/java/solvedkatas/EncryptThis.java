package com.solvedkatas.java.solvedkatas;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class EncryptThis {

    private static Log LOGGER = LogFactory.getLog(EncryptThis.class);

    public static String encryptThis(String text) {
        LOGGER.info(text.replaceAll("\\b[A-Za-z]", String.valueOf((int) text.charAt(0))));
        return text.replaceAll("\\b[A-Za-z]", String.valueOf((int) text.charAt(0)));
    }
}