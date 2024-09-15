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
                curveTo(9.938f, 7.0f, 5.0f, 11.938f, 5.0f, 18.0f)
                curveTo(5.0f, 24.063f, 9.938f, 29.0f, 16.0f, 29.0f)
                curveTo(22.063f, 29.0f, 27.0f, 24.063f, 27.0f, 18.0f)
                curveTo(27.0f, 15.082f, 25.863f, 12.41f, 24.0f, 10.438f)
                lineTo(25.719f, 8.719f)
                lineTo(24.281f, 7.281f)
                lineTo(22.469f, 9.094f)
                curveTo(20.656f, 7.773f, 18.41f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(20.98f, 9.0f, 25.0f, 13.02f, 25.0f, 18.0f)
                curveTo(25.0f, 22.98f, 20.98f, 27.0f, 16.0f, 27.0f)
                curveTo(11.02f, 27.0f, 7.0f, 22.98f, 7.0f, 18.0f)
                curveTo(7.0f, 13.02f, 11.02f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(15.0f, 11.0f)
                lineTo(15.0f, 16.281f)
                curveTo(14.402f, 16.629f, 14.0f, 17.262f, 14.0f, 18.0f)
                curveTo(14.0f, 18.738f, 14.402f, 19.371f, 15.0f, 19.719f)
                lineTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 19.719f)
                curveTo(17.598f, 19.371f, 18.0f, 18.738f, 18.0f, 18.0f)
                curveTo(18.0f, 17.262f, 17.598f, 16.629f, 17.0f, 16.281f)
                lineTo(17.0f, 11.0f)
                close()
            }
        }
        .build()
        return _stopwatchSolid!!
    }

private var _stopwatchSolid: ImageVector? = null
