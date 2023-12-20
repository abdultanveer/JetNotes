package com.yourcompany.android.jetnotes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yourcompany.android.jetnotes.theme.green

@Composable
fun Note(){
    val backgroundShape: Shape = RoundedCornerShape(4.dp)

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .shadow(1.dp, backgroundShape)
        .heightIn(min = 64.dp)
        .background(Color.White, backgroundShape)
    ) {
        NoteColor(color = green, size = 40.dp, border = 1.dp )
        Column(modifier = Modifier.weight(1f)) {

            Text(text = "title", maxLines = 1)
            Text(text = "Content", maxLines = 1)
        }
        Checkbox(
            checked = false, onCheckedChange = {},
            modifier = Modifier.padding(start = 8.dp)
        )
    }
}

@Preview
@Composable
private  fun NotePreview(){
    Note()
}