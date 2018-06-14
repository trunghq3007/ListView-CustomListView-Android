package com.imic.admin.listviewandroid;

/**
 * @author Hà Quang Trung
 * @version 1.0.0
 * @description
 * @desc Technical Director, FPT-Software.
 * @created 6/13/2018
 * @updated 6/13/2018
 * @modified by
 * @updated on 6/13/2018
 * @since 1.0
 */
public class MobileEntity {
    private String title;
    private int resImg;

    public MobileEntity(String title, int resImg) {
        this.title = title;
        this.resImg = resImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getResImg() {
        return resImg;
    }

    public void setResImg(int resImg) {
        this.resImg = resImg;
    }


}
