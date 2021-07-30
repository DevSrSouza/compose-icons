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

public val LineAwesomeIcons.CheckSquare: ImageVector
    get() {
        if (_checkSquare != null) {
            return _checkSquare!!
        }
        _checkSquare = Builder(name = "CheckSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(21.2813f, 11.2813f)
                lineTo(14.0f, 18.5625f)
                lineTo(10.7188f, 15.2813f)
                lineTo(9.2813f, 16.7188f)
                lineTo(13.2813f, 20.7188f)
                lineTo(14.0f, 21.4063f)
                lineTo(14.7188f, 20.7188f)
                lineTo(22.7188f, 12.7188f)
                close()
            }
        }
        .build()
        return _checkSquare!!
    }

private var _checkSquare: ImageVector? = null
