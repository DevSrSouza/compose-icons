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

public val LineAwesomeIcons.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.043f, 4.0f, 7.0f, 8.043f, 7.0f, 13.0f)
                curveTo(7.0f, 14.918f, 7.8438f, 16.9063f, 9.0f, 18.6875f)
                curveTo(9.8594f, 20.0117f, 10.8867f, 21.2305f, 12.0f, 22.1563f)
                lineTo(12.0f, 25.0f)
                curveTo(12.0f, 26.0938f, 12.9063f, 27.0f, 14.0f, 27.0f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(18.0f, 27.0f)
                curveTo(19.0938f, 27.0f, 20.0f, 26.0938f, 20.0f, 25.0f)
                lineTo(20.0f, 22.1563f)
                curveTo(21.1133f, 21.2305f, 22.1406f, 20.0117f, 23.0f, 18.6875f)
                curveTo(24.1563f, 16.9063f, 25.0f, 14.918f, 25.0f, 13.0f)
                curveTo(25.0f, 8.043f, 20.957f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(19.8789f, 6.0f, 23.0f, 9.1211f, 23.0f, 13.0f)
                curveTo(23.0f, 14.3086f, 22.3555f, 16.0352f, 21.3438f, 17.5938f)
                curveTo(20.4414f, 18.9844f, 19.2539f, 20.2227f, 18.1563f, 21.0f)
                lineTo(13.8438f, 21.0f)
                curveTo(12.7461f, 20.2227f, 11.5586f, 18.9844f, 10.6563f, 17.5938f)
                curveTo(9.6445f, 16.0352f, 9.0f, 14.3086f, 9.0f, 13.0f)
                curveTo(9.0f, 9.1211f, 12.1211f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(14.25f, 23.0f)
                lineTo(17.75f, 23.0f)
                curveTo(17.8281f, 23.0547f, 17.9102f, 23.0938f, 18.0f, 23.125f)
                lineTo(18.0f, 25.0f)
                lineTo(14.0f, 25.0f)
                lineTo(14.0f, 23.125f)
                curveTo(14.0898f, 23.0938f, 14.1719f, 23.0547f, 14.25f, 23.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
