package io.github.magi82.rxviewbinder

import io.reactivex.disposables.CompositeDisposable

/**
 * Created by magi on 2018. 3. 23..
 */

interface ViewBindable<out Action, out State> {
    val disposable: CompositeDisposable
    val action: Action
    val state: State
}