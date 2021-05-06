package com.example.smsreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    private static EditText otp;

    public void setEditText_otp(EditText editText) {
        MyReceiver.otp = editText;
    }


    @Override
    public void onReceive(Context context, Intent intent) {
        SmsMessage[] smsMessages = Telephony.Sms.Intents.getMessagesFromIntent(intent);
        for (SmsMessage smsMessage : smsMessages) {
        String message_body=smsMessage.getMessageBody();
        String[] mid=message_body.split("is",2);
        String getOTP=mid[0].replaceAll("[^0-9]","");
        otp.setText(getOTP);

        }
    }
}