package com.telekom.radio.preference;

import android.os.Bundle;
import com.telekom.radio.R;

public class AuthenticationSettingsFragment extends MumlaPreferenceFragment {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.settings_authentication, rootKey);
    }
}
