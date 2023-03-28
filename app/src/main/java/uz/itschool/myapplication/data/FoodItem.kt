package uz.itschool.myapplication.data

import uz.itschool.myapplication.R

data class FoodItem(var img:Int, var name: String, var number:String)

object FoodList{

    fun getModel(): List<FoodItem>{
        val food1 = FoodItem(
            R.drawable.burger,
            "Burger",
            "54545 views"
        )

        val food2 = FoodItem(
            R.drawable.pizza,
            "Pizza",
            "121541 views"
        )

        val food3 = FoodItem(
            R.drawable.salad,
            "Salad",
            "98989 views"
        )

        val foodList: ArrayList<FoodItem> = ArrayList()
        foodList.add(food1)
        foodList.add(food2)
        foodList.add(food3)

        return foodList
    }
}
