package com.hanghae.finalProject.config.model;

public class CacheKey {
    public static final int DEFAULT_EXPIRE_SEC = 60; // 1 minutes
    public static final String CALENDAR = "Calendar";
    public static final int CALENDAR_EXPIRE_SEC = 60 * 2;// 30 sec

    public static final String EMAIL = "Email";

    public static final int EMAIL_EXPIRE_SEC = 30; //180 sec

}