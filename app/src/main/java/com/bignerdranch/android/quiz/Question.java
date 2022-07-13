package com.bignerdranch.android.quiz;

public class Question {
    private int mTextResId; //reference to question textview
    private boolean mAnswerTrue;

    //constructor
    public Question(int textResId, boolean answerTrue){
        mTextResId=textResId;
        mAnswerTrue=answerTrue;
    }


    //methods
    public int getTextResId() {
        return mTextResId;
    }
    public void setTextResId(int textResId){
        mTextResId=textResId;
    }

    public boolean isAnswerTrue(){
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue){
        mAnswerTrue=answerTrue;
    }
}

