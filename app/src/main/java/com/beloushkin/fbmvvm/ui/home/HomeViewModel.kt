package com.beloushkin.fbmvvm.ui.home

import android.view.View
import androidx.lifecycle.ViewModel
import com.beloushkin.fbmvvm.data.repositories.UserRepository
import com.beloushkin.fbmvvm.utils.startLoginActivity

class HomeViewModel(
    private val repository: UserRepository
) : ViewModel() {

    val user by lazy {
        repository.currentUser()
    }

    fun logout(view: View){
        repository.logout()
        view.context.startLoginActivity()
    }
}