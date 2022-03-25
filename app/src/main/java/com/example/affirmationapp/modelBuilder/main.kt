package com.example.affirmationapp.modelBuilder


fun main() {


    val orderList = mutableListOf<Order>()

    val vegetables = Vegetables()
    val noodle = Noodles()
    val order1 = Order(1)
        .addItem(Noodles()).addItem(Vegetables())
    orderList.add(order1)
//testing One
    val vegetables2 = Vegetables()
    val noodle2 = Noodles()
    val order2 = Order(2)
        .addItem(Noodles()).addItem(Vegetables())
    orderList.add(order2)

    val vegetables3 = Vegetables()
    val noodle3 = Noodles()
    val order3 = Order(3)
        .addItem(Noodles()).addItem(Vegetables())
    orderList.add(order3)

    for (order in orderList) {
        order.print()
        println()
    }

}