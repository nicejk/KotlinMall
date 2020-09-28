package com.oscar.baselibrary.ui.activity

import com.oscar.baselibrary.presenter.BasePresenter
import com.oscar.baselibrary.presenter.view.BaseView

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 3:30 PM
 */
open class BaseMVPActivity<T: BasePresenter<*>>: BaseActivity(), BaseView {
    override fun showLoading() {
    }

    override fun hideLoading() {
    }

    override fun onError(text: String) {
    }

    lateinit var mPresenter: T
}