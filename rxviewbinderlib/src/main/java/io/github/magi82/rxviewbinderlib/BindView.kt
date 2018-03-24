package io.github.magi82.rxviewbinder

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by magi on 2018. 3. 23..
 */

interface BindView {
    val disposable: CompositeDisposable
    fun command()
    fun state()
}

fun BindView.binding() {
    this.state()
    this.command()
}