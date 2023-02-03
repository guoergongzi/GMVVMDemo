package com.gegz.gviewmodeldemo;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class TestViewModel extends ViewModel {

    private Timer timer;
    private int timeCount = 0;

    public void startTimer() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                timeCount++;
                Log.v("G", "timeCount = " + timeCount);
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 1000, 1000);
    }

    public int getTimeCount() {
        return timeCount;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        timer.cancel();
    }
}
