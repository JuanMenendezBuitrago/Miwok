package com.example.android.miwok;

import static android.R.string.no;

/**
 * Created by juan on 23/07/17.
 */

public class Word {
    /**
     * Miwok translation of the word.
     */
    private String mMiwokTranslation;
    /**
     * Default translation of the word.
     */
    private String mDefaultTranslation;
    /**
     * Resource id of the associated image.
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Resource id of the associated sound.
     */
    private int mSoundResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;


    /**
     * Create a ew Word object.
     * @param mMiwokTranslation is the word in a language the user is familiar with.
     * @param mDefaultTranslation is the word in the Miwok language.
     * @param mImageResourceId resource id of the image
     * @param mSoundResourceId resource id of the audio
     */
    public Word(String mMiwokTranslation, String mDefaultTranslation, int mImageResourceId, int mSoundResourceId) {
        this.mMiwokTranslation = mMiwokTranslation;
        this.mDefaultTranslation = mDefaultTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mSoundResourceId = mSoundResourceId;
    }

    /**
     * Create a new Word object.
     * @param miwokTranslation is the word in a language the user is familiar with.
     * @param defaultTranslation is the word in the Miwok language.
     */
    public Word(String miwokTranslation, String defaultTranslation, int mSoundResourceId)
    {
        this.mMiwokTranslation = miwokTranslation;
        this.mDefaultTranslation = defaultTranslation;
        this.mSoundResourceId = mSoundResourceId;
    }

    /**
     * @return the miwok translarion
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * @return the default translation of the word.
     */
    public String getDefaultTranslation() { return mDefaultTranslation; }

    /**
     * @return the resource id of the word image.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * @return the resource id of the word sound.
     */
    public int getSoundResourceId() { return mSoundResourceId; }

    /**
     * @return whether or not the word has an image associated
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
