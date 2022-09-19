package com.example.shoplist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoplist.R
import com.example.shoplist.domain.AddObjectUseCase
import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopListRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}