package com.wthrnrslt.lightsightsnursultan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_rvarch.*

class RVArch : AppCompatActivity() {
    val data = listOf(
        DataModel(R.drawable.img_1, "Khan Shatyr"),
        DataModel(R.drawable.img_2, "Bayterek Monument"),
        DataModel(R.drawable.img_3, "Duman Entertainment Center"),
        DataModel(R.drawable.img_4, "Circus"),
        DataModel(R.drawable.img_5, "Palace of Peace and Reconciliation"),
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rvarch)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RVAdapter(data)

    }
}