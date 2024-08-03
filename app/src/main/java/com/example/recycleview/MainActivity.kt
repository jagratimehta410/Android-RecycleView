package com.example.recycleview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView) // Ensure this ID matches

        val items = arrayListOf(
            MyModel("Kola Bear", "\n" +
                    "Koalas are marsupials native to Australia, known for their grey fur, large ears, and diet of eucalyptus leaves.", R.drawable.img), // Ensure drawable resource exists
            MyModel("African bush Elephant","\n"+"\n" + "Earth's largest land mammal, features large ears, long tusks, and is vital to African ecosystems.", R.drawable.img_2),
            MyModel("Capuchin Monkeys","\n"+"\n"+ " agile primates with white faces and dark bodies, known for tool use, social behavior, and adaptability..", R.drawable.img_3),
            MyModel("Giant Panda", "\n"+" large bear with distinctive black-and-white fur, native to China, known for its bamboo diet and conservation status.", R.drawable.img_4),
// Ensure drawable resource exists

        )

        val adapter = MyAdapter(this, items)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}

