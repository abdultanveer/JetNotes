package com.yourcompany.android.jetnotes.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun NoteColor(color: Color, size: Dp, padding: Dp = 0.dp, border:Dp) {
    Box(modifier = Modifier
        .padding(padding)
        .size(size)
        .clip(CircleShape)
        .background(Color.Red)
        .border(
            BorderStroke(
                border,
                SolidColor(Color.Black)), CircleShape
        )
    )

}

@Preview
@Composable
fun NoteColorPreview() {
    NoteColor( color =  Color.Red, size =  40.dp, padding = 4.dp, border = 2.dp)
}