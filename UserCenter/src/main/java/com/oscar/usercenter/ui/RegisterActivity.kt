package com.oscar.usercenter.ui

import android.os.Bundle
import com.oscar.baselibrary.ui.activity.BaseMVPActivity
import com.oscar.usercenter.R
import com.oscar.usercenter.presenter.RegisterPresenter
import com.oscar.usercenter.presenter.view.RegisterView
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.toast

class RegisterActivity : BaseMVPActivity<RegisterPresenter>(), RegisterView {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        mPresenter = RegisterPresenter()
        mPresenter.mView = this

        mBtnRegister.setOnClickListener {
            mPresenter.register("", "", "")
        }
    }

    override fun onRegisterResult(result: Boolean) {
        toast("注册成功")
    }
}