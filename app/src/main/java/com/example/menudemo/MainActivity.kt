package com.example.menudemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.menudemo.MenuAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = MenuAdapter(
            listOf(
                MenuItem("Entrées", isSection = true),
                MenuItem("Spicy Ramen", "Rich pork broth with chili oil and scallions", "$12.99"),
                MenuItem("Grilled Chicken Salad", "Served with balsamic vinaigrette", "$10.49"),
                MenuItem(
                    "Eggplant Parmesan",
                    "Breaded eggplant baked with marinara and mozzarella",
                    "$11.99"
                ),
                MenuItem("Seared Salmon", "With lemon butter sauce and roasted veggies", "$14.99"),
                MenuItem("Stuffed Bell Peppers", "Quinoa, black beans, corn & cheddar", "$10.79"),

                MenuItem("Desserts", isSection = true),
                MenuItem("Tiramisu", "Coffee-soaked ladyfingers with mascarpone cream", "$5.99"),
                MenuItem("Lava Cake", "Molten chocolate center with vanilla ice cream", "$6.49"),
                MenuItem("Baklava", "Flaky pastry with nuts and honey syrup", "$4.99"),
                MenuItem("Cheesecake", "Classic New York-style with graham crust", "$5.49"),
                MenuItem("Macarons", "Assorted French cookies (5 pack)", "$6.29"),

                MenuItem("Drinks", isSection = true),
                MenuItem("Matcha Latte", "Hot or iced, served with oat milk", "$4.99"),
                MenuItem("Sparkling Water", "Imported Italian mineral water", "$2.49"),
                MenuItem("Hibiscus Iced Tea", "Tart floral brew, lightly sweetened", "$3.49"),
                MenuItem("Cold Brew Coffee", "Strong and smooth, served over ice", "$3.99"),
                MenuItem("Fresh Lemonade", "Hand-squeezed with mint", "$3.79")
            )
        )

    }
}