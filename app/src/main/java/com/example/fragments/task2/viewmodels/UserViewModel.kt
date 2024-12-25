package com.example.fragments.task2.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fragments.task2.models.User

class UserViewModel : ViewModel() {
    private val _users = MutableLiveData<List<User>>()
    val users: LiveData<List<User>> get() = _users

    init {
        _users.value = listOf(
            User(1, com.example.fragments.R.drawable.user1, "Иван", "Иванов", "+7 900 123-45-67"),
            User(2, com.example.fragments.R.drawable.user2, "Анна", "Смирнова", "+7 901 234-56-78"),
            User(3, com.example.fragments.R.drawable.user3, "Петр", "Кузнецов", "+7 902 345-67-89"),
            User(4, com.example.fragments.R.drawable.user4, "Елена", "Новикова", "+7 903 456-78-90")
        )
    }

    fun updateUser(userId: Int, updatedUser: User) {
        _users.value = _users.value?.map {
            if (it.id == userId) updatedUser else it
        }
    }
}
