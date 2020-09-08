package com.example.composeapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composeapplication.ui.typography
import com.koduok.compose.glideimage.GlideImage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsStory()
        }
    }

    @Composable
    fun NewsStory() {
        MaterialTheme {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                ExploreImageContainer {
                    GlideImage("https://www.xda-developers.com/files/2018/07/Android-Jetpack-featured.png") {
                        centerCrop()
                    }
                }

                Spacer(modifier = Modifier.preferredHeight(16.dp))

                Text(
                    text = "A Day in the life of an Android Dev " +
                            "when COVID-19 strikes, there's no need to panic. All right?",
                    style = typography.h6,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(text = getString(R.string.app_name), style = typography.body2)
                Text(text = "2020", style = typography.body2)
            }
        }
    }

    @Composable
    private fun ExploreImageContainer(children: @Composable () -> Unit) {
        Surface(
            Modifier.preferredHeight(height = 240.dp).fillMaxWidth(),
            RoundedCornerShape(16.dp)
        ) {
            children()
        }
    }

    @Preview
    @Composable
    fun PreviewNewsStory() {
        NewsStory()
    }
}