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

public val LineAwesomeIcons.TrashAlt: ImageVector
    get() {
        if (_trashAlt != null) {
            return _trashAlt!!
        }
        _trashAlt = Builder(name = "TrashAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                curveTo(14.477f, 4.0f, 13.941f, 4.184f, 13.563f, 4.563f)
                curveTo(13.184f, 4.941f, 13.0f, 5.477f, 13.0f, 6.0f)
                lineTo(13.0f, 7.0f)
                lineTo(7.0f, 7.0f)
                lineTo(7.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 25.0f)
                curveTo(8.0f, 26.645f, 9.355f, 28.0f, 11.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                curveTo(24.645f, 28.0f, 26.0f, 26.645f, 26.0f, 25.0f)
                lineTo(26.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 7.0f)
                lineTo(21.0f, 7.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 5.477f, 20.816f, 4.941f, 20.438f, 4.563f)
                curveTo(20.059f, 4.184f, 19.523f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(15.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(10.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 25.0f)
                curveTo(24.0f, 25.555f, 23.555f, 26.0f, 23.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                curveTo(10.445f, 26.0f, 10.0f, 25.555f, 10.0f, 25.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 23.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                lineTo(16.0f, 23.0f)
                lineTo(18.0f, 23.0f)
                lineTo(18.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineTo(20.0f, 23.0f)
                lineTo(22.0f, 23.0f)
                lineTo(22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trashAlt!!
    }

private var _trashAlt: ImageVector? = null
