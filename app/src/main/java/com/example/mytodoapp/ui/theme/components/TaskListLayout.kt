package com.example.mytodoapp.ui.theme.components

import android.widget.CheckBox
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material3.Checkbox
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TaskListLayout () {
    LazyColumn (
        content = {
            items ( count = 50 ) {
                item -> TaskTitle()
            }
        }
    )
}


@Composable
fun TaskTitle () {
    var isChecked by remember {mutableStateOf(value = false)}
    Box (
        contentAlignment = Alignment.CenterStart,
        modifier = Modifier
            .background(color = Color.Green),
        content = {
            Row (
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.Top,
                horizontalArrangement = Arrangement.SpaceBetween,
                content = {
                    Checkbox (
                        checked = isChecked,
                        onCheckedChange = {if (isChecked == true) isChecked = false else isChecked = true}
                    )
                    Column (
                        modifier = Modifier
                            .weight(1f),
                        content = {
                            Spacer( modifier = Modifier.height(12.dp))
                            Text(
                                text = "Break Fast",
                                fontSize = 18.sp,
                                fontWeight = FontWeight.SemiBold
                            )
                            Text(
                                text = "08:00 PM - 20/11/2024",
                                fontSize = 15.sp,
                                fontWeight = FontWeight.Normal
                            )
                            Text(text = "Enjoy a healthy breakfast to kickstart your day!")
                        }
                    )

                    Icon(
                        imageVector = Icons.Default.MoreVert,
                        contentDescription = "view more"
                    )
                }
            )
        }
    )
    HorizontalDivider()
}