package com.example.mad_practical2_21012011131


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"
    val v = findViewById<ConstraintLayout>(R.id.mainlayout)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showMessage("onCreate() method is called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart() method is called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("OnResume() method is called")
    }
    private fun showMessage(msg:String){
        Log.i(TAG, "$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        if (v!=null)
        {
        Snackbar.make(v,"$msg",Snackbar.LENGTH_LONG).show()
        }
    }

    override fun onPause() {
        super.onPause()
        showMessage("OnPause() method is called")

    }
    override fun onStop() {
        super.onStop()
        showMessage("OnStop() method is called")

    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("OnDestroy() method is called")

    }

}