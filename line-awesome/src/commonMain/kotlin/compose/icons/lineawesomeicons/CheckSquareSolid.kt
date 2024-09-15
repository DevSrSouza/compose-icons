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

public val LineAwesomeIcons.CheckSquareSolid: ImageVector
    get() {
        if (_checkSquareSolid != null) {
            return _checkSquareSolid!!
        }
        _checkSquareSolid = Builder(name = "CheckSquareSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 12.188f)
                lineTo(26.0f, 14.188f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 6.0f)
                lineTo(25.813f, 6.0f)
                lineTo(27.813f, 4.0f)
                close()
                moveTo(27.281f, 7.281f)
                lineTo(16.0f, 18.563f)
                lineTo(11.719f, 14.281f)
                lineTo(10.281f, 15.719f)
                lineTo(15.281f, 20.719f)
                lineTo(16.0f, 21.406f)
                lineTo(16.719f, 20.719f)
                lineTo(28.719f, 8.719f)
                close()
            }
        }
        .build()
        return _checkSquareSolid!!
    }

private var _checkSquareSolid: ImageVector? = null
