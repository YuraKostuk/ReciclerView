package com.example.reciclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val adapter = AdapterChar()
    var index = 0
    private val imageList = listOf(R.drawable.a, R.drawable.image00001, R.drawable.oblakobasa, R.drawable.oblakocontrol,
    R.drawable.oblakoiknown, R.drawable.oblakouchi, R.drawable.t)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
        for (i in imageList ){
            val buckvi = Foto(imageList[index], "буква $index")
            adapter.addList(buckvi)
            adapter.addList(buckvi)
            adapter.addList(buckvi)
            index++
        }
//        while (index <= 6 ) {
//            val buckvi = Buckvi(imageList[index], "буква $index")
//            adapter.addList(buckvi)
//            index++
//        }
    }
}