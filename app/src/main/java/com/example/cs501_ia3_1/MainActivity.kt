package com.example.cs501_ia3_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MaterialTheme {
                Surface(Modifier.fillMaxSize()) {
                    SplitLayoutScreen()
                }
            }
        }
    }
}

@Composable
fun SplitLayoutScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(12.dp)
    ) {
        // Left section: 25%, weight = 1 with label
        Box(
            modifier = Modifier
                .weight(1f) // 1 : 3  => 25% : 75%
                .fillMaxHeight()
                .background(Color(0xFFB3E5FC)), // light blue
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "25%",
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(Modifier.width(12.dp))

        // Right section 75%, weight = 3
        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxHeight()
        ) {
            // Inside the larger section a Column with weights 2:3:5
            Box(
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth()
                    .background(Color(0xFFC8E6C9)), // light green
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Top (2/10 = 20%)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .weight(3f)
                    .fillMaxWidth()
                    .background(Color(0xFFFFF9C4)), // light yellow
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Middle (3/10 = 30%)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }

            Spacer(Modifier.height(12.dp))

            Box(
                modifier = Modifier
                    .weight(5f)
                    .fillMaxWidth()
                    .background(Color(0xFFFFCCBC)), // light orange
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Bottom (5/10 = 50%)",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }
}

@Preview(showBackground = true, widthDp = 420, heightDp = 800)
@Composable
private fun SplitLayoutPreview() {
    MaterialTheme {
        Surface(Modifier.fillMaxSize()) {
            SplitLayoutScreen()
        }
    }
}