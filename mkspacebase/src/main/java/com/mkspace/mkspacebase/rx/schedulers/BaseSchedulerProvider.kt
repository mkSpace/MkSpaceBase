package com.mkspace.mkspacebase.rx.schedulers

import io.reactivex.Scheduler

interface BaseSchedulerProvider {
    fun io(): Scheduler
    fun computation(): Scheduler
    fun ui(): Scheduler
}