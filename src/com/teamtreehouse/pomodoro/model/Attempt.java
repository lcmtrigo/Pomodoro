package com.teamtreehouse.pomodoro.model;

/**
 * Created by RamonTrigo on 15-10-12.
 */
public class Attempt {
    private String mMessage;
    private int mRemainingSeconds;
    private AttemptKind mKind;

    public Attempt(AttemptKind kind, String message) {
        mMessage = message;
        mKind = kind;
        mRemainingSeconds = kind.getTotalSeconds();
    }

    public String getMessage() {
        return mMessage;
    }

    public int getRemainingSeconds() {
        return mRemainingSeconds;
    }

    public AttemptKind getKind() {
        return mKind;
    }

    public void setMessage(String message) {
        mMessage = message;
    }
}
