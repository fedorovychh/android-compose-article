package com.example.jetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposetutorial.ui.theme.JetPackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}

@Composable
fun ComposeArticleApp() {
    Column {
        HeadImage()
        Title(text = stringResource(id = R.string.title_text))
        Body(text = stringResource(id = R.string.description_text))
        Body(text = stringResource(id = R.string.body_text))

    }
}

@Composable
private fun HeadImage() {
    Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
    )
}

@Composable
private fun Title(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(16.dp),
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp
    )
}

@Composable
private fun Body(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier.padding(16.dp),
        textAlign = TextAlign.Justify
    )
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetPackComposeTutorialTheme {
        ComposeArticleApp()
    }
}
