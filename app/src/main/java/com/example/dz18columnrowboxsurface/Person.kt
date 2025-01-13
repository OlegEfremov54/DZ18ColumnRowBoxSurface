package com.example.dz18columnrowboxsurface

data class Person(val name: String,
                  var salary: Int,
                  var phone: String = getRandomPhoneNumber()) {
    companion object {
        private fun getRandomPhoneNumber(): String {
            return "+79" + (100000000..999999999).random()
        }
        val personList = listOf(
            Person("Андрей", 25000),
            Person("Иван", 130000),
            Person("Анна", 85000),
            Person("Игорь", 97000),
            Person("Яна", 87000),
            Person("Дмитрий", 62000),
            Person("Вова", 45000),
            Person("Маша", 200000),
        )
    }
}