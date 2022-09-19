package com.example.shoplist.domain

class ChangeObjectUseCase (private val shopListRepository: ShopListRepository){

    fun changeObject(shopItem: ShopItem) {
        shopListRepository.changeObject(shopItem)
    }
}