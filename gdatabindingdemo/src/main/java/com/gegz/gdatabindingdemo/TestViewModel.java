package com.gegz.gdatabindingdemo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class TestViewModel extends ViewModel {

    private Timer timer;
    private final MutableLiveData<String> timeCountString = new MutableLiveData<>();
    private int timeCount = 0;

    {
        timeCountString.setValue("计时到第" + timeCount + "秒");
    }

    public void startTimer() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                timeCount += 1;
                timeCountString.postValue("计时到第" + timeCount + "秒");
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 1000, 1000);
    }

    public LiveData<String> getTimeCount() {
        return timeCountString;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        timer.cancel();
    }
}
