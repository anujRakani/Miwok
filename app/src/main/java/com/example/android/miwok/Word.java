package com.example.android.miwok;

/**
 * Created by PC on 06-Feb-17.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDdefaultTranslation;

    private int mImageResourceId;

    public Word(String mMiwokTranslation, String mDdefaultTranslation) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDdefaultTranslation = mDdefaultTranslation;
    }

    public Word(String mMiwokTranslation, String mDdefaultTranslation,int mImageResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDdefaultTranslation = mDdefaultTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    public String getmDdefaultTranslation() {
        return mDdefaultTranslation;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return ( mImageResourceId != 0 );
    }

}
