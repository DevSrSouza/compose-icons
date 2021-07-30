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
                lineTo(28.0f, 12.1875f)
                lineTo(26.0f, 14.1875f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 6.0f)
                lineTo(25.8125f, 6.0f)
                lineTo(27.8125f, 4.0f)
                close()
                moveTo(27.2813f, 7.2813f)
                lineTo(16.0f, 18.5625f)
                lineTo(11.7188f, 14.2813f)
                lineTo(10.2813f, 15.7188f)
                lineTo(15.2813f, 20.7188f)
                lineTo(16.0f, 21.4063f)
                lineTo(16.7188f, 20.7188f)
                lineTo(28.7188f, 8.7188f)
                close()
            }
        }
        .build()
        return _checkSquareSolid!!
    }

private var _checkSquareSolid: ImageVector? = null
