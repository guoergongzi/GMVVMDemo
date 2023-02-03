package com.gegz.glivedatademo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.Timer;
import java.util.TimerTask;

public class TestViewModel extends ViewModel {

    private Timer timer;
    private final MutableLiveData<Integer> timeCount = new MutableLiveData<>();

    {
        timeCount.setValue(0);
    }

    public void startTimer() {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                if (timeCount.getValue() != null) {
                    timeCount.postValue(timeCount.getValue() + 1);
                }
            }
        };
        timer = new Timer();
        timer.schedule(timerTask, 1000, 1000);
    }

    public LiveData<Integer> getTimeCount() {
        return timeCount;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        timer.cancel();
    }
}
