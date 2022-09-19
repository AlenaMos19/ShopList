package com.example.shoplist.domain

class RemoveObjectUseCase (private val shopListRepository: ShopListRepository){

    fun removeObject(shopItem: ShopItem){
         shopListRepository.removeObject(shopItem)
    }
}