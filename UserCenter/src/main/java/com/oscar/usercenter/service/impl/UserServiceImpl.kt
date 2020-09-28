package com.oscar.usercenter.service.impl

import com.oscar.usercenter.service.UserService
import rx.Observable

/**
 *
 * @Description：
 * @Author: haishan
 * @CreateDate: 2020/9/28 4:32 PM
 */
class UserServiceImpl: UserService {
    override fun register(mobile: String, verifyCode: String, pwd: String): Observable<Boolean> {
        return Observable.just(true)
    }
}