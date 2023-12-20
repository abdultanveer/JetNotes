package com.yourcompany.android.jetnotes.ui.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yourcompany.android.jetnotes.domain.model.ColorModel
import com.yourcompany.android.jetnotes.ui.components.NoteColor
import com.yourcompany.android.jetnotes.util.fromHex

@Composable
fun ColorPicker() {
    
}


@Composable
fun ColorItem(
    color: ColorModel,
    onColorSelect: (ColorModel)->Unit
) {
    Row (modifier = Modifier
        .fillMaxWidth()
        .clickable(onClick = {
            onColorSelect(color)
        })
    ){
        NoteColor(
            myModifier = Modifier.padding(10.dp),
            color = Color.fromHex(color.hex),
            size = 80.dp, border = 2.dp )
        Text(text = color.name, fontSize = 22.sp,
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .align(Alignment.CenterVertically))
    }

}
@Preview
@Composable
fun ColorItemPreview(){
    ColorItem(color = ColorModel.DEFAULT, onColorSelect = {} )
}