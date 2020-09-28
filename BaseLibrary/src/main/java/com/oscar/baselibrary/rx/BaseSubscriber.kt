package com.oscar.baselibrary.rx

import rx.Subscriber

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 4:42 PM
 */
open class BaseSubscriber<T>: Subscriber<T>() {
    override fun onNext(t: T) {}

    override fun onCompleted() {}

    override fun onError(e: Throwable?) {}
}