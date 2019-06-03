package com.example.iteradmin.bottomnavigation

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class Main2Activity : BaseActivity(), BottomNavigationView.OnNavigationItemSelectedListener {
    override fun getItemId(): Int {
       return R.id.second
    }

    override fun getContentView(): Int {
        return R.layout.activity_main2
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(getItemId()){
            R.id.first ->{
                startActivity(Intent(this,MainActivity::class.java))
                return true
            }
            R.id.second ->{
                startActivity(Intent(this,Main2Activity::class.java))
                return true
            }
            R.id.third ->{
                startActivity(Intent(this,Main3Activity::class.java))
                return true
            }
        }
        return false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val btn=findViewById<BottomNavigationView>(R.id.bottom1)

        btn.setOnNavigationItemSelectedListener(this)
    }
}
