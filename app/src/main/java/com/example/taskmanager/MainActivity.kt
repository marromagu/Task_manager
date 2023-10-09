package com.example.taskmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.taskmanager.ui.theme.TaskManagerTheme
import androidx.compose.foundation.Image
import androidx.compose.material3.Text

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TaskManagerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeTaskManagerThemeApp()
                }
            }
        }
    }
    @Preview(showBackground = true)
    @Composable
    fun ComposeTaskManagerThemeApp() {
        TaskManagerThemeApp(
            text1 = stringResource(R.string.text1),
            text2 = stringResource(R.string.text2),
            imagen = painterResource(R.drawable.ic_task_completed)
        )
    }

    @Composable
    private fun TaskManagerThemeApp(
        text1: String,
        text2: String,
        imagen: Painter,
        modifier: Modifier = Modifier
    ) {
        Column(modifier = modifier) {
            Image(painter = imagen, contentDescription = null)
            Text(
                text = text1,
                modifier = Modifier.padding(20.dp),
                fontSize = 24.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = text2,
                modifier = Modifier.padding(20.dp),
                textAlign = TextAlign.Center
            )
        }

        @Composable
        fun TaskManagerThemePreview() {
            TaskManagerTheme {
                ComposeTaskManagerThemeApp()
            }
        }
    }
}