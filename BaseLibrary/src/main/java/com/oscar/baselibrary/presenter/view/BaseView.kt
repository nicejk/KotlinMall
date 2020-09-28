package com.oscar.baselibrary.presenter.view

/**
 *
 * @Description：MVP中视图回调 基类
 * @Author: haishan
 * @CreateDate: 2020/9/28 3:25 PM
 */
interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun onError(text: String)
}