package com.example.library.util;

import java.util.Locale;

public class TextUtils {
    public static String normalizeTitle(String raw){
        if(raw == null) return "";
        var s = raw.trim().replaceAll("\s+", " ").toLowerCase(Locale.ROOT);
        if(s.isEmpty()) return s;
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
