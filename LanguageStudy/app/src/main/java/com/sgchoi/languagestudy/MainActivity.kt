package com.sgchoi.languagestudy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sgchoi.languagestudy.level1.*
import com.sgchoi.languagestudy.level2.*
import com.sgchoi.languagestudy.ui.theme.LanguageStudyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanguageStudyTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    var stringArray: Array<String> = arrayOf("banana", "apple", "rice", "pork", "pot")
                    var stringArray2: Array<String> = arrayOf("chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana")
                    var intArray: IntArray = intArrayOf(3,2,2,2,1)
                    PrintResult(result = discountDay(want = stringArray, number = intArray, discount = stringArray2).toString())
                }
            }
        }
    }
}

@Composable
fun PrintResult(result: String, modifier: Modifier = Modifier) {
    Text(
        text = result,
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LanguageStudyTheme {
        PrintResult("Android")
    }
}