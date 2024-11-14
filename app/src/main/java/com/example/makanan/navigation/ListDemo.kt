package com.example.makanan.navigation

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.makanan.R


data class MarvaCahr(
    val charName: String,
    val name: String,
    val imageRes: Int
)

// Sample list for MarvaCahr items
fun getAllMarvaCahr(): List<MarvaCahr> {
    return listOf(
        MarvaCahr("Nasigoreng", "Makanan Sedap", R.drawable.nasigoreng),
        MarvaCahr("Panggang", "Makanan Sedap", R.drawable.panggang),
        MarvaCahr("Bakso", "Makanan Sedap", R.drawable.bakso),
        MarvaCahr("Penyet", "Makanan Sedap", R.drawable.penyet),
        MarvaCahr("Mie Ayam", "Makanan Sedap", R.drawable.mieayam),
        MarvaCahr("rendang", "Makanan Sedap", R.drawable.rendang),
        MarvaCahr("bakmi", "Makanan Sedap", R.drawable.bakmi),
        MarvaCahr("ayam", "Makanan Sedap", R.drawable.ayam),
        MarvaCahr("telur", "Makanan Sedap", R.drawable.telur),
        MarvaCahr("nasipadang", "Makanan Sedap", R.drawable.nasipadang)
    )
}

data class Course(
    val title: String,
    val description: String,
    val imageRes: Int
)

fun getAllCourses(): List<Course> {
    return listOf(
        Course("Gambar Nasi goreng", "Makanan sangat sedap", R.drawable.nasigoreng),
        Course("Gambar Ayam penyet", "Makanan sangat sedap", R.drawable.penyet),
        Course("Gambar Bakso", "Makanan sangat sedap", R.drawable.bakso),
        Course("Gambar Mie Ayam", "Makanan sangat sedap", R.drawable.mieayam),
        Course("Gambar Panggang", "Makanan sangat sedap", R.drawable.panggang),
        Course("Gambar rendang", "Makanan sangat sedap", R.drawable.rendang),
        Course("Gambar bakmi", "Makanan sangat sedap", R.drawable.bakmi),
        Course("Gambar ayam", "Makanan sangat sedap", R.drawable.ayam),
        Course("Gambar telur", "Makanan sangat sedap", R.drawable.telur),
        Course("Gambar nasipadang", "Makanan sangat sedap", R.drawable.nasipadang)

    )
}

@Composable
fun ListDemo() {
    SimpleColumn()
    LazyColumnDemo()
}

@Composable
fun LazyColumnDemo() {
    val myList = getAllMarvaCahr()
    LazyColumn {
        itemsIndexed(myList) { index, item ->
            MarvaCahrItem(item = item)
        }
    }
}

@Composable
fun MarvaCahrItem(item: MarvaCahr) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = item.imageRes),
            contentDescription = item.name,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
                .scale(1.0f)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Column(
            modifier = Modifier
                .weight(1f)
                .padding(start = 8.dp)
        ) {
            Text(
                text = item.charName,
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = item.name,
                style = TextStyle(
                    fontSize = 18.sp
                )
            )
        }
    }
}

@Composable
fun CourseScreen(
    courses: List<Course>,
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(courses) { course ->
            CourseItem(course = course)
        }
    }
}

@Composable
fun CourseItem(course: Course) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = course.imageRes),
            contentDescription = course.title,
            modifier = Modifier
                .clip(CircleShape)
                .size(64.dp)
        )
        Text(
            text = course.title,
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 8.dp)
        )
        Text(
            text = course.description,
            fontSize = 14.sp,
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}

@Composable
fun SimpleColumn() {
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(scrollState)
    ) {
        for (i in 1..10) {
            Text(
                text = "Item $i",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}

@Composable
fun TextItem(text: String) {
    Log.i("TEXTITEM RENDER-->", text)
    Text(
        text = text,
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        textAlign = TextAlign.Center,
        fontSize = 20.sp
    )
}
