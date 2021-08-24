package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(number: Int): List<Affirmation> {
        val element = Affirmation(R.drawable.image1)
        return MutableList(number) { element }
    }
}