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

public val LineAwesomeIcons.BookOpenSolid: ImageVector
    get() {
        if (_bookOpenSolid != null) {
            return _bookOpenSolid!!
        }
        _bookOpenSolid = Builder(name = "BookOpenSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 25.0f)
                lineTo(13.0f, 25.0f)
                curveTo(14.1016f, 25.0f, 15.0f, 25.8984f, 15.0f, 27.0f)
                lineTo(17.0f, 27.0f)
                curveTo(17.0f, 25.8984f, 17.8984f, 25.0f, 19.0f, 25.0f)
                lineTo(29.0f, 25.0f)
                lineTo(29.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                curveTo(17.8086f, 6.0f, 16.7344f, 6.5273f, 16.0f, 7.3594f)
                curveTo(15.2656f, 6.5273f, 14.1914f, 6.0f, 13.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(13.0f, 8.0f)
                curveTo(14.1016f, 8.0f, 15.0f, 8.8984f, 15.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                curveTo(17.0f, 8.8984f, 17.8984f, 8.0f, 19.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 23.0f)
                lineTo(19.0f, 23.0f)
                curveTo(17.8086f, 23.0f, 16.7344f, 23.5273f, 16.0f, 24.3594f)
                curveTo(15.2656f, 23.5273f, 14.1914f, 23.0f, 13.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                close()
                moveTo(15.0f, 12.0f)
                lineTo(15.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(15.0f, 16.0f)
                lineTo(15.0f, 18.0f)
                lineTo(17.0f, 18.0f)
                lineTo(17.0f, 16.0f)
                close()
                moveTo(15.0f, 20.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bookOpenSolid!!
    }

private var _bookOpenSolid: ImageVector? = null
