package com.example.shoplist.domain

class GiveIdUseCase (private val shopListRepository: ShopListRepository){

    fun giveId(shopItemId: Int) : ShopItem{
        return shopListRepository.giveId(shopItemId)
    }
}