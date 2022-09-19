package com.example.shoplist.data

import com.example.shoplist.domain.ShopItem
import com.example.shoplist.domain.ShopListRepository
import java.lang.RuntimeException
import kotlin.RuntimeException

object ShopListRepositoryImpl : ShopListRepository{

    private val shopList = mutableListOf<ShopItem>()
    private var shopId = 0

    override fun addObject(shopItem: ShopItem) {
        if (shopItem.id == ShopItem.UNDEFIND_ID){
            shopItem.id = shopId++
        }
        shopList.add(shopItem)
    }

    override fun removeObject(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

    override fun changeObject(shopItem: ShopItem) {
        val oldElement = giveId(shopItem.id)
        shopList.remove(oldElement)
        shopList.add(shopItem)
    }

    override fun giveId(shopItemId: Int): ShopItem {
        return shopList.find {
            it.id == shopItemId
        } ?: throw RuntimeException("Element with id $shopItemId not found")
    }

    override fun getShopList(): List<ShopItem> {
        return shopList
    }

}