package com.example.composearticle

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle.ui.theme.ComposeArticleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeArticleTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
                Column {
                    ComposeImage()
                    ComposeTitle()
                    ComposeText(text = stringResource(R.string.compose_text1))
                    ComposeText(text = stringResource(R.string.compose_text2))
                }
            }
        }
    }
}

@Composable
fun ComposeImage(modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.bg_compose_background)

    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@Composable
fun ComposeTitle(modifier: Modifier = Modifier) {
    Text(
        text = stringResource(R.string.compose_title),
        fontSize = 24.sp,
        modifier = Modifier.padding(16.dp)
    )
}

@Composable
fun ComposeText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        textAlign = TextAlign.Justify,
        modifier = Modifier.padding(16.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun ComposePreview() {
    ComposeArticleTheme {
        Column {
            ComposeText(text = stringResource(R.string.compose_text1))
            ComposeText(text = stringResource(R.string.compose_text2))
        }
    }
}