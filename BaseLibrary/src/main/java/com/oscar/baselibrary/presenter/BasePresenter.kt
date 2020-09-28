package com.oscar.baselibrary.presenter

import com.oscar.baselibrary.presenter.view.BaseView

/**
 *
 * @Description：MVP中P层 基类
 * @Author: haishan
 * @CreateDate: 2020/9/28 3:25 PM
 */
open class BasePresenter<T: BaseView> {
    lateinit var mView: T
}