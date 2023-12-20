package com.yourcompany.android.jetnotes.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Checkbox
import androidx.compose.material.Colors
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yourcompany.android.jetnotes.domain.model.ColorModel
import com.yourcompany.android.jetnotes.domain.model.NoteModel
import com.yourcompany.android.jetnotes.theme.green

@Composable
fun Note(
    myNote:NoteModel, onNoteClick : (NoteModel)->Unit = {},
    onNoteCheckedChange: (NoteModel)->Unit ={}
){
    val backgroundShape: Shape = RoundedCornerShape(4.dp)

    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp)
        .shadow(1.dp, backgroundShape)
        .heightIn(min = 64.dp)
        .background(Color.White, backgroundShape)
        .clickable (onClick = {onNoteClick(myNote)})
    ) {
        NoteColor(
            myModifier = Modifier.align(Alignment.CenterVertically)
                .padding(start = 16.dp,end = 16.dp),
            color = green, size = 40.dp, border = 1.dp )
        Column(modifier = Modifier
            .weight(1f)
            .align(Alignment.CenterVertically)) {

            Text(text = myNote.title, maxLines = 1, color = Color.Black,
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp,
                    letterSpacing = 0.15.sp
                )
            )
            Text(text = myNote.content, maxLines = 1, color = Color.Black.copy(alpha = 0.75f),
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 14.sp,
                    letterSpacing = 0.25.sp
                )
            )
        }
        Checkbox(
            checked = myNote.isCheckedOff == true, onCheckedChange = { isChecked ->
                val newNote = myNote.copy(isCheckedOff =  isChecked)
            },
            modifier = Modifier
                .padding(start = 8.dp)
                .align(Alignment.CenterVertically)
        )
    }
}

@Preview
@Composable
private  fun NotePreview(){
    Note(NoteModel(1,title = "my tile", content = "my content", isCheckedOff = true, color = ColorModel.DEFAULT))
}