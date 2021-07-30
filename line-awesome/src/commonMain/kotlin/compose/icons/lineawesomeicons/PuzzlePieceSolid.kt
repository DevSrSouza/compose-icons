package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.PuzzlePieceSolid: ImageVector
    get() {
        if (_puzzlePieceSolid != null) {
            return _puzzlePieceSolid!!
        }
        _puzzlePieceSolid = Builder(name = "PuzzlePieceSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                curveTo(14.7891f, 3.0f, 13.0f, 4.7891f, 13.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 12.0f)
                curveTo(4.7891f, 12.0f, 3.0f, 13.7891f, 3.0f, 16.0f)
                curveTo(3.0f, 18.2109f, 4.7891f, 20.0f, 7.0f, 20.0f)
                lineTo(7.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                curveTo(13.0f, 27.2109f, 14.7891f, 29.0f, 17.0f, 29.0f)
                curveTo(19.2109f, 29.0f, 21.0f, 27.2109f, 21.0f, 25.0f)
                lineTo(27.0f, 25.0f)
                lineTo(27.0f, 18.0f)
                lineTo(25.0f, 18.0f)
                curveTo(23.8086f, 18.0f, 23.0f, 17.1914f, 23.0f, 16.0f)
                curveTo(23.0f, 14.8086f, 23.8086f, 14.0f, 25.0f, 14.0f)
                lineTo(27.0f, 14.0f)
                lineTo(27.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                curveTo(21.0f, 4.7891f, 19.2109f, 3.0f, 17.0f, 3.0f)
                close()
                moveTo(17.0f, 5.0f)
                curveTo(18.1914f, 5.0f, 19.0f, 5.8086f, 19.0f, 7.0f)
                lineTo(19.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                lineTo(25.0f, 12.0f)
                curveTo(22.7891f, 12.0f, 21.0f, 13.7891f, 21.0f, 16.0f)
                curveTo(21.0f, 18.2109f, 22.7891f, 20.0f, 25.0f, 20.0f)
                lineTo(25.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                lineTo(19.0f, 25.0f)
                curveTo(19.0f, 26.1914f, 18.1914f, 27.0f, 17.0f, 27.0f)
                curveTo(15.8086f, 27.0f, 15.0f, 26.1914f, 15.0f, 25.0f)
                lineTo(15.0f, 23.0f)
                lineTo(9.0f, 23.0f)
                lineTo(9.0f, 18.0f)
                lineTo(7.0f, 18.0f)
                curveTo(5.8086f, 18.0f, 5.0f, 17.1914f, 5.0f, 16.0f)
                curveTo(5.0f, 14.8086f, 5.8086f, 14.0f, 7.0f, 14.0f)
                lineTo(9.0f, 14.0f)
                lineTo(9.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 7.0f)
                curveTo(15.0f, 5.8086f, 15.8086f, 5.0f, 17.0f, 5.0f)
                close()
            }
        }
        .build()
        return _puzzlePieceSolid!!
    }

private var _puzzlePieceSolid: ImageVector? = null
