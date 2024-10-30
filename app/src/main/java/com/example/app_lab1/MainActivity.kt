package com.example.app_lab1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.app_lab1.ui.theme.App_Lab1Theme


var flag: Boolean = false

class MainActivity : ComponentActivity() {
    private lateinit var myTextView: TextView
    private lateinit var myButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView = findViewById(R.id.textView)
        myButton = findViewById(R.id.button2)

        myButton.setOnClickListener {
            if(!flag){
            myTextView.text = getString(R.string.app_name)
            flag = !flag
                } else{
                myTextView.text = getString(R.string.hello_text)
                flag = !flag
            }
        }
    }

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    App_Lab1Theme {
        Greeting("Android")
    }
}