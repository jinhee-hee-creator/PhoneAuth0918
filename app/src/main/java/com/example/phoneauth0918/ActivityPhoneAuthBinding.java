package com.example.phoneauth0918;

import android.app.Notification;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import java.text.BreakIterator;

class ActivityPhoneAuthBinding {
    public View buttonStartVerification;
    public View buttonVerifyPhone;
    public View buttonResend;
    public View signOutButton;
    public TextView fieldPhoneNumber;
    public TextView fieldVerificationCode;
    public BreakIterator detail;
    public Notification.Builder phoneAuthFields;
    public View signedInButtons;
    public BreakIterator status;

    public static ActivityPhoneAuthBinding inflate(LayoutInflater layoutInflater) {
    }

    public int getRoot() {
    }
}
