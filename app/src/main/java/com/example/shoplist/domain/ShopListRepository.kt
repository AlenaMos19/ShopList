package com.example.shoplist.domain

interface ShopListRepository {

    fun addObject(shopItem: ShopItem)
    fun removeObject(shopItem: ShopItem)
    fun changeObject(shopItem: ShopItem)
    fun giveId(shopItemId: Int) : ShopItem
    fun getShopList() : List<ShopItem>
}