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

public val LineAwesomeIcons.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 10.0f)
                curveTo(9.0f, 12.543f, 10.3672f, 14.7734f, 12.4063f, 16.0f)
                curveTo(10.3672f, 17.2266f, 9.0f, 19.457f, 9.0f, 22.0f)
                lineTo(9.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 26.0f)
                lineTo(23.0f, 26.0f)
                lineTo(23.0f, 22.0f)
                curveTo(23.0f, 19.457f, 21.6328f, 17.2266f, 19.5938f, 16.0f)
                curveTo(21.6328f, 14.7734f, 23.0f, 12.543f, 23.0f, 10.0f)
                lineTo(23.0f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(25.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 10.0f)
                curveTo(21.0f, 12.7734f, 18.7734f, 15.0f, 16.0f, 15.0f)
                curveTo(13.2266f, 15.0f, 11.0f, 12.7734f, 11.0f, 10.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(18.7734f, 17.0f, 21.0f, 19.2266f, 21.0f, 22.0f)
                lineTo(21.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 22.0f)
                curveTo(11.0f, 19.2266f, 13.2266f, 17.0f, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
