package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardAppTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ProfileImage(
                        "Vinay Patel",
                        "Kotlin Wiz",
                        modifier = Modifier
                            .background(Color.Magenta)
                            .align(Alignment.Center)
                    )
                    ContactDetails(
                        "012456789",
                        "vp@not_my_real_mail.com",
                    )
                }
            }
        }
    }
}


@Composable
fun ProfileImage(profileName : String,
                 jobTitle: String,
                 modifier: Modifier = Modifier) {
    Box() {
        Row() {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Image(
                        painter = painterResource(R.drawable.icons8_android_os_100),
                        contentDescription = "profile image",
                        modifier = Modifier
                            .fillMaxHeight(0.5f)
                            .fillMaxWidth(0.5f)
                    )
                }
                Row {
                    Text(
                        text = profileName,
                        textAlign = TextAlign.Center,
                        fontSize = 46.sp
                    )
                }
                Row {
                    Text(
                        text = jobTitle,
                        textAlign = TextAlign.Center,
                        fontSize = 25.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 10.dp, start = 10.dp)
                    )
                }
            }
        }

        }
    }
@Composable
fun ContactDetails(
    phoneNumber: String,
    emailAddress: String,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize().padding(bottom = 100.dp),
        contentAlignment = Alignment.BottomCenter
    ) {
        Column(horizontalAlignment = Alignment.Start) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.icons8_android_phone_48),
                    contentDescription = "phone icon",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    text = phoneNumber,
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Italic
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(R.drawable.icons8_gmail_50),
                    contentDescription = "gmail icon",
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(
                    text = emailAddress,
                    fontSize = 15.sp,
                    fontStyle = FontStyle.Italic
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        ProfileImage(
            "Vinay Patel",
            "Kotlin Wiz",
            modifier = Modifier.background(Color.Magenta)
        )
        ContactDetails(
            "012456789",
            "vp@not_my_real_mail.com",
        )
    }
}