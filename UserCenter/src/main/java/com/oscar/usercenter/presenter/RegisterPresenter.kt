package com.oscar.usercenter.presenter

import com.oscar.baselibrary.ext.execute
import com.oscar.baselibrary.presenter.BasePresenter
import com.oscar.baselibrary.rx.BaseSubscriber
import com.oscar.usercenter.presenter.view.RegisterView
import com.oscar.usercenter.service.impl.UserServiceImpl

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 3:35 PM
 */
class RegisterPresenter : BasePresenter<RegisterView>() {
    fun register(mobile: String, verifyCode: String, pwd: String) {
        val userService = UserServiceImpl()
        userService.register(mobile, verifyCode, pwd)
            .execute(object : BaseSubscriber<Boolean>() {
                override fun onNext(t: Boolean) {
                    mView.onRegisterResult(t)
                }
            })
    }
}