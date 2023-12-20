/*
 * Copyright (c) 2022 Kodeco Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 * 
 * This project and source code may use libraries or frameworks that are
 * released under various Open-Source licenses. Use of those libraries and
 * frameworks are governed by their own individual licenses.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.yourcompany.android.jetnotes.data.database.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ColorDbModel(
  @PrimaryKey(autoGenerate = true) val id: Long = 0,
  @ColumnInfo(name = "hex") val hex: String,
  @ColumnInfo(name = "name") val name: String
) {

  companion object {

    val DEFAULT_COLORS = listOf(
      ColorDbModel(1, "#FFFFFF", "White"),
      ColorDbModel(2, "#E57373", "Red"),
      ColorDbModel(3, "#F06292", "Pink"),
      ColorDbModel(4, "#CE93D8", "Purple"),
      ColorDbModel(5, "#2196F3", "Blue"),
      ColorDbModel(6, "#00ACC1", "Cyan"),
      ColorDbModel(7, "#26A69A", "Teal"),
      ColorDbModel(8, "#4CAF50", "Green"),
      ColorDbModel(9, "#8BC34A", "Light Green"),
      ColorDbModel(10, "#CDDC39", "Lime"),
      ColorDbModel(11, "#FFEB3B", "Yellow"),
      ColorDbModel(12, "#FF9800", "Orange"),
      ColorDbModel(13, "#BCAAA4", "Brown"),
      ColorDbModel(14, "#9E9E9E", "Gray")
    )

    val DEFAULT_COLOR = DEFAULT_COLORS[0]
  }
}
