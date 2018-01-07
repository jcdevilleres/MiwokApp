package com.example.android.miwok;

import android.content.Context;
import android.view.View;
import android.widget.TextView;


/**
 * Created by Jean Claude on 1/7/2018.
 */

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private Context mContext;

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
//        super(context);
//        mDefaultTranslation = "";
//        mMiwokTranslation = "";
//        mContext = context;
    }

//    public void setDefaultTranslation(String defaultTranslation) {
//        mDefaultTranslation = defaultTranslation;
//    }
//
//    public void setmMiwokTranslation(String miwokTranslation) {
//        mMiwokTranslation = miwokTranslation;
//    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}