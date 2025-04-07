package com.shageldi.androidcicd

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.shageldi.androidcicd.ui.theme.AndroidCICDTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidCICDTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        modifier = Modifier
                            .padding(innerPadding)
                            .consumeWindowInsets(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    var counter by remember { mutableIntStateOf(0) }
    Column(modifier) {
        Button(modifier = Modifier.padding(16.dp), onClick = { counter++ })
        {
            Text(text = stringResource(R.string.increment_counter))
        }
        Text(text = stringResource(R.string.clicks, counter))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AndroidCICDTheme {
        Greeting()
    }
}