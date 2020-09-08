package com.example.composeapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composeapplication.ui.typography

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory() {
        val image = imageResource(id = R.drawable.header)
        MaterialTheme {

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                val imageModifier = Modifier
                    .preferredHeight(180.dp)
                    .fillMaxWidth()
                    .clip(shape = RoundedCornerShape(28.dp))

                Image(
                    asset = image,
                    modifier = imageModifier,
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.preferredHeight(16.dp))

                Text(
                    text = "A Day in the life of an Android Dev" +
                    " when COVID-19 strikes, there's no need to panic. aight?",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(text = getString(R.string.app_name), style = typography.body2)
                Text(text = "2020", style = typography.body2)
            }
        }
    }

    @Preview
    @Composable
    fun PreviewNewsStory() {
        NewsStory()
    }
}