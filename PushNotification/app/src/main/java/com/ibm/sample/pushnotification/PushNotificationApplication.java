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

package com.ibm.sample.pushnotification;

import android.app.Application;
import android.util.Log;

import com.ibm.mobilefirstplatform.clientsdk.android.push.api.MFPPush;

public class PushNotificationApplication extends Application {

    private static final String TAG = "Application";

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize MobileFirst Push
        // Initialization in the application class, allows you to obtain an instance of MFPPush from any class without reinitializing it.
        MFPPush.getInstance().initialize(this);

        Log.i(TAG, "Push has been initialized in the PushNotificationApplication.class.");

    }
}
