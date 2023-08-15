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
                    var intArray: IntArray = intArrayOf(1, 3, 2, 5, 4, 5, 2, 3)
                    PrintResult(result = orangeSelect(6, intArray).toString())
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