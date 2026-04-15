package com.telekom.radio.app;

import android.app.Activity;

import androidx.annotation.NonNull;

public interface IStartupAction {
    void execute(@NonNull Activity activity);
}
