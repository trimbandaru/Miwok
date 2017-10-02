package com.example.android.miwok;

/**
 * Created by Trim on 10/1/2017.
 */

public class Word {

    private String miwokTranslation;
    private String defaultTranslation;
    private int imageUri;

    private static final int NO_VALID_IMAGE = -1;


    public Word(String miwokTranslation, String defaultTranslation,int imageUri) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageUri = imageUri;
    }
    public Word(String miwokTranslation, String defaultTranslation) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public int getImageUri(){
        return imageUri;
    }

    public boolean hasImage(){
        return this.imageUri != NO_VALID_IMAGE;
    }
}
