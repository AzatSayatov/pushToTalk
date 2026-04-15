package com.telekom.radio.app;

import static com.telekom.radio.app.DialogUtils.maybeShowNewsDialog;

import android.app.Activity;

import androidx.annotation.NonNull;

public class StartupAction implements IStartupAction {
    @Override
    public void execute(@NonNull Activity activity) {
        maybeShowNewsDialog(activity);
    }
}
