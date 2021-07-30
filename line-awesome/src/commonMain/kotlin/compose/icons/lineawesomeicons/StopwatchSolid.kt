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

public val LineAwesomeIcons.StopwatchSolid: ImageVector
    get() {
        if (_stopwatchSolid != null) {
            return _stopwatchSolid!!
        }
        _stopwatchSolid = Builder(name = "StopwatchSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(9.9375f, 7.0f, 5.0f, 11.9375f, 5.0f, 18.0f)
                curveTo(5.0f, 24.0625f, 9.9375f, 29.0f, 16.0f, 29.0f)
                curveTo(22.0625f, 29.0f, 27.0f, 24.0625f, 27.0f, 18.0f)
                curveTo(27.0f, 15.082f, 25.8633f, 12.4102f, 24.0f, 10.4375f)
                lineTo(25.7188f, 8.7188f)
                lineTo(24.2813f, 7.2813f)
                lineTo(22.4688f, 9.0938f)
                curveTo(20.6563f, 7.7734f, 18.4102f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(20.9805f, 9.0f, 25.0f, 13.0195f, 25.0f, 18.0f)
                curveTo(25.0f, 22.9805f, 20.9805f, 27.0f, 16.0f, 27.0f)
                curveTo(11.0195f, 27.0f, 7.0f, 22.9805f, 7.0f, 18.0f)
                curveTo(7.0f, 13.0195f, 11.0195f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(15.0f, 16.2813f)
                curveTo(14.4023f, 16.6289f, 14.0f, 17.2617f, 14.0f, 18.0f)
                curveTo(14.0f, 18.7383f, 14.4023f, 19.3711f, 15.0f, 19.7188f)
                lineTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 19.7188f)
                curveTo(17.5977f, 19.3711f, 18.0f, 18.7383f, 18.0f, 18.0f)
                curveTo(18.0f, 17.2617f, 17.5977f, 16.6289f, 17.0f, 16.2813f)
                lineTo(17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _stopwatchSolid!!
    }

private var _stopwatchSolid: ImageVector? = null
