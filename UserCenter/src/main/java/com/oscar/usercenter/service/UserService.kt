package com.oscar.usercenter.service

import rx.Observable

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 4:31 PM
 */
interface UserService {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean>
}