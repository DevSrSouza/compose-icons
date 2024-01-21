package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HandScissors: ImageVector
    get() {
        if (_handScissors != null) {
            return _handScissors!!
        }
        _handScissors = Builder(name = "HandScissors", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 208.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, 17.9f, -40.0f, 40.0f)
                reflectiveCurveToRelative(17.9f, 40.0f, 40.0f, 40.0f)
                lineToRelative(180.2f, 0.0f)
                curveToRelative(-7.6f, 8.5f, -12.2f, 19.7f, -12.2f, 32.0f)
                curveToRelative(0.0f, 25.3f, 19.5f, 46.0f, 44.3f, 47.9f)
                curveToRelative(-7.7f, 8.5f, -12.3f, 19.8f, -12.3f, 32.1f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(32.0f, 0.0f)
                lineToRelative(64.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                lineToRelative(0.0f, -113.1f)
                curveToRelative(0.0f, -40.2f, -16.0f, -78.8f, -44.4f, -107.3f)
                curveTo(444.8f, 76.8f, 413.9f, 64.0f, 381.7f, 64.0f)
                lineTo(336.0f, 64.0f)
                curveToRelative(-21.3f, 0.0f, -39.3f, 13.9f, -45.6f, 33.1f)
                lineToRelative(74.5f, 23.7f)
                curveToRelative(8.4f, 2.7f, 13.1f, 11.7f, 10.4f, 20.1f)
                reflectiveCurveToRelative(-11.7f, 13.1f, -20.1f, 10.4f)
                lineTo(288.0f, 129.9f)
                lineToRelative(0.0f, 0.1f)
                lineTo(84.0f, 65.8f)
                curveTo(62.9f, 59.2f, 40.5f, 70.9f, 33.8f, 92.0f)
                reflectiveCurveToRelative(5.1f, 43.5f, 26.2f, 50.2f)
                lineTo(269.5f, 208.0f)
                lineTo(40.0f, 208.0f)
                close()
            }
        }
        .build()
        return _handScissors!!
    }

private var _handScissors: ImageVector? = null
