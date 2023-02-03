package com.example.login

import android.content.Context

class SharedPreferences(context : Context?) {
    val privateMode = 0

    private val prefName = "SharedPreferences"
    private val isLogin = "isLogin"

    val pref: android.content.SharedPreferences? = context?.getSharedPreferences(prefName,privateMode)
    val editor: android.content.SharedPreferences.Editor? = pref?.edit()

    fun setLogin(is_Login : Boolean){
        editor?.putBoolean(isLogin,is_Login)
        editor?.commit()
    }

    fun setUsername(username : String?){
        editor?.putString("username", username)
        editor?.commit()
    }

    fun is_Login(): Boolean?{
        return pref?.getBoolean(isLogin, false)
    }

    fun getUsername() : String?{
        return pref?.getString("username", "")

    }

    fun removeData(){
        editor?.clear()
        editor?.commit()
    }

}
