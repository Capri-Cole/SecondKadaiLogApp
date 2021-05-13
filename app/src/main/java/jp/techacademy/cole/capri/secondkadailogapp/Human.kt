package jp.techacademy.cole.capri.secondkadailogapp

import android.util.Log

class Human: Animal, Thinkable {

    var hobby: String

    constructor(name: String, age: Int, hobby: String): super(name, age) {
        this.hobby = hobby
    }

    override fun say() {
        Log.d("SecondKadaiLog", "私の名前は" + this.name + "です。年は" + this.age.toString() + "歳です。")
    }

    override fun think() {
        Log.d("SecondKadaiLog", "私は" + this.hobby + "について考える。")
    }

}