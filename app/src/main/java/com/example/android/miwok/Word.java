package com.example.android.miwok;

/**
 * Created by PC on 06-Feb-17.
 */

public class Word {

    private String mMiwokTranslation;

    private String mDdefaultTranslation;

    private int mImageResourceId;

    private int mAudioResourceId;

    public Word(String mMiwokTranslation, String mDdefaultTranslation, int audioResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDdefaultTranslation = mDdefaultTranslation;
        this.mAudioResourceId = audioResourceId;
    }

    public Word(String miwokTranslation, String defaultTranslation, int imageResourceId, int audioResourceId) {
        this.mMiwokTranslation = miwokTranslation;
        this.mDdefaultTranslation = defaultTranslation;
        this.mImageResourceId = imageResourceId;
        this.mAudioResourceId = audioResourceId;
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

    public int getmAudioResourceId() {
        return mAudioResourceId;
    }

    public boolean hasImage() {
        return ( mImageResourceId != 0 );
    }

    @Override
    public String toString() {
        return "Word{" +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mDdefaultTranslation='" + mDdefaultTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}
