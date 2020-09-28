package com.oscar.usercenter.presenter.view

import com.oscar.baselibrary.presenter.view.BaseView

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 3:36 PM
 */
interface RegisterView: BaseView {
    fun onRegisterResult(result: Boolean)
}