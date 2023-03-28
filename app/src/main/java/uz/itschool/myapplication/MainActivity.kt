package uz.itschool.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.itschool.myapplication.adapter.RecyclerViewAdapter
import uz.itschool.myapplication.data.FoodItem
import uz.itschool.myapplication.data.FoodList
import uz.itschool.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        val list = getModel()
        val adapter = RecyclerViewAdapter(list)

        binding.recyclerview.adapter = adapter


    }

    fun getModel(): MutableList<FoodItem> {
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


