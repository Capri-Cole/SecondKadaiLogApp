package jp.techacademy.cole.capri.secondkadailogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val human1 = Human("田中", 18, "プログラミング")
        human1.say()
        human1.think()

        val human2 = Human("山田",25,"Kotlin")
        human2.say()
        human2.think()
    }
}