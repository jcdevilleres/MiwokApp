package com.example.android.miwok;

/**
 * Created by Jean Claude on 1/9/2018.
 */

public class ReportCard {
    private String mStudentName;
    private String mEnglishGrade;
    private String mHistoryGrade;
    private String mMathGrade;


    public ReportCard(String studentName, String englishGrade, String historyGrade, String mathGrade) {
        mStudentName = studentName;
        mEnglishGrade = englishGrade;
        mHistoryGrade = historyGrade;
        mMathGrade = mathGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public String getMathGrade() {
        return mMathGrade;
    }

    public void setEnglishGrade(String grade) {
        mEnglishGrade = grade;
    }

    public void setHistoryGrade(String grade) {
        mEnglishGrade = grade;
    }

    public void setMathGrade(String grade) {
        mEnglishGrade = grade;
    }

    public String toString() {
        return "Name " + mStudentName +
                "; English grade: " + mEnglishGrade +
                "; History grade: " + mHistoryGrade +
                "; Math grade: " + mMathGrade + ";" ;
    }
}
