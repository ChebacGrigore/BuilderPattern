package com.example.affirmationapp.modelBuilder



class Order(val orderNumber: Int) {

    private val itemList = mutableListOf<Item>()

    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    fun print() {

        println("Order #${orderNumber}")
        var total = 0
        for (item in itemList) {
            println("${item} : $${item.price}")
            total += item.price
        }
        println("Total: $${total}")
    }
}
