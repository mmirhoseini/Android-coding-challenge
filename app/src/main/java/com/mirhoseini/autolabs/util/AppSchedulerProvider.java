package com.mirhoseini.autolabs.util;

import javax.inject.Inject;

import rx.Scheduler;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by Mohsen on 03/01/2017.
 */

public class AppSchedulerProvider implements SchedulerProvider {

    @Inject
    public AppSchedulerProvider() {
    }

    @Override
    public Scheduler mainThread() {
        return AndroidSchedulers.mainThread();
    }

    @Override
    public Scheduler backgroundThread() {
        return Schedulers.io();
    }

}
