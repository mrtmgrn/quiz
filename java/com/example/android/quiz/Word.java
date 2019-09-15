package com.example.android.quiz;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    /** Default first answer*/
    private String mPierwsza;

    /** Miwok second answer */
    private String mDruga;

    /** Miwok third answer */
    private String mTrzecia;

    /** Miwok fourth answer */
    private String mCzwarta;

    public Word(String pierwszaOdpowiedz, String drugaOdpowiedz, String trzeciaOdpowiedz, String czwartaOdpowiedz) {
        mPierwsza = pierwszaOdpowiedz;
        mDruga = drugaOdpowiedz;
        mTrzecia = trzeciaOdpowiedz;
        mCzwarta = czwartaOdpowiedz;
    }

    public String getPierwszaOdpowiedz() {
        return mPierwsza;
    }

    public String getDrugaOdpowiedz() {
        return mDruga;
    }

    public String getTrzeciaOdpowiedz() {
        return mTrzecia;
    }

    public String getCzwartaOdpowiedz() {
        return mCzwarta;
    }

}