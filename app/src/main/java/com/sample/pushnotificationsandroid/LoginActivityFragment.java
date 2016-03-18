/*
 * Copyright 2016 IBM Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.sample.pushnotificationsandroid;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Project: PushNotificationsAndroid
 * Created by: Eric N Garcia on 3/17/16.
 * IBM
 * Software Engineer
 * Mobile First Platform Foundation CORD
 */

public class LoginActivityFragment extends Fragment implements OnClickListener {

    private static final String TAG = "LoginActivityFragment";

    private EditText userNameET;
    private EditText passwordET;
    private TextView errorLabelTV;
    private TextView remainingAttemptsTV;

    private String error;
    private Integer remainingAttempts;


    public LoginActivityFragment() {
        // Mandatory empty constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        remainingAttempts = 3;

    }

    @Override
    public void onResume() {
        super.onResume();

        if (remainingAttempts != null) {
            remainingAttemptsTV.setText(String.valueOf(remainingAttempts));
        }

        if (error != null) {
            errorLabelTV.setText(error);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        userNameET = (EditText) view.findViewById(R.id.et_username);
        passwordET = (EditText) view.findViewById(R.id.et_password);
        errorLabelTV = (TextView) view.findViewById(R.id.tv_error_message);
        remainingAttemptsTV = (TextView) view.findViewById(R.id.tv_remaining_attempts);

        Button cancelBtn = (Button) view.findViewById(R.id.btn_cancel);
        cancelBtn.setOnClickListener(this);

        Button loginBtn = (Button) view.findViewById(R.id.btn_login);
        loginBtn.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            // Login button pressed
            case R.id.btn_login:
                String username = String.valueOf(userNameET.getText());
                String password = String.valueOf(passwordET.getText());

                if (!username.equals("") && !password.equals("")) {
                    //TODO: send challenge
                }
                break;

            // Cancel button pressed
            case R.id.btn_cancel:
                // TODO: setup cancel
                break;
            default:
                Log.d(TAG, "OnClick not handled");
        }
    }
}
