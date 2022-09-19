package com.example.shoplist.domain

class AddObjectUseCase(private val shopListRepository: ShopListRepository) {

    fun addObject(shopItem: ShopItem){
        shopListRepository.addObject(shopItem)
    }
}

