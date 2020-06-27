package com.gqgx.common.lang;

/**
 * Created by Hunter on 2020-06-23.
 */
public class Objects {

    public static boolean isEmpty(Integer value) {
        if (value == null || value == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(Long value) {
        if (value == null || value == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEmpty(String value) {
        if (value == null || "".equals(value.trim())) {
            return true;
        }
        return false;
    }

}
