/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.car;

import android.content.Context;
import android.support.car.Car;
import android.support.car.CarSensorEvent;
import android.support.car.CarSensorManager;

import com.android.car.hal.SensorHalServiceBase.SensorListener;

import java.io.PrintWriter;

//TODO
public class DayNightModePolicy extends CarSensorService.LogicalSensorHalBase {

    private final Context mContext;
    private SensorListener mSensorListener;
    private boolean mIsReady = false;
    private boolean mStarted = false;

    public DayNightModePolicy(Context context) {
        mContext = context;
    }

    @Override
    public synchronized void init() {
        mIsReady = true;
    }

    @Override
    public synchronized void release() {
        // TODO Auto-generated method stub
    }

    @Override
    public synchronized CarSensorEvent getDefaultValue(int sensorType) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public synchronized void registerSensorListener(SensorListener listener) {
        mSensorListener = listener;
        if (mIsReady) {
            mSensorListener.onSensorHalReady(this);
        }
    }

    @Override
    public synchronized void onSensorServiceReady() {
        // TODO Auto-generated method stub
    }

    @Override
    public synchronized boolean isReady() {
        return mIsReady;
    }

    @Override
    public synchronized int[] getSupportedSensors() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public synchronized boolean requestSensorStart(int sensorType, int rate) {
        mStarted = true;
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public synchronized void requestSensorStop(int sensorType) {
        // TODO Auto-generated method stub
    }

    @Override
    public synchronized void dump(PrintWriter writer) {
        // TODO Auto-generated method stub
    }
}