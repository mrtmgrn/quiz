package com.example.android.quiz;

public class Word {

    private String mPytanie;

    /** First answer*/
    private String mPierwsza;

    /** Second answer */
    private String mDruga;

    /** Third answer */
    private String mTrzecia;

    /** Fourth answer */
    private String mCzwarta;

    public Word(String pytanie, String pierwszaOdpowiedz, String drugaOdpowiedz, String trzeciaOdpowiedz, String czwartaOdpowiedz) {
        mPytanie = pytanie;
        mPierwsza = pierwszaOdpowiedz;
        mDruga = drugaOdpowiedz;
        mTrzecia = trzeciaOdpowiedz;
        mCzwarta = czwartaOdpowiedz;
    }

    public String getPytanie() {
        return mPytanie;
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