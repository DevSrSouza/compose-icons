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

public val SolidGroup.Crow: ImageVector
    get() {
        if (_crow != null) {
            return _crow!!
        }
        _crow = Builder(name = "Crow", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 0.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                verticalLineToRelative(29.2f)
                lineTo(12.5f, 390.6f)
                curveToRelative(-14.0f, 10.8f, -16.6f, 30.9f, -5.9f, 44.9f)
                reflectiveCurveToRelative(30.9f, 16.6f, 44.9f, 5.9f)
                lineTo(126.1f, 384.0f)
                lineTo(259.2f, 384.0f)
                lineToRelative(46.6f, 113.1f)
                curveToRelative(5.0f, 12.3f, 19.1f, 18.1f, 31.3f, 13.1f)
                reflectiveCurveToRelative(18.1f, -19.1f, 13.1f, -31.3f)
                lineTo(311.1f, 384.0f)
                lineTo(352.0f, 384.0f)
                curveToRelative(1.1f, 0.0f, 2.1f, 0.0f, 3.2f, 0.0f)
                lineToRelative(46.6f, 113.2f)
                curveToRelative(5.0f, 12.3f, 19.1f, 18.1f, 31.3f, 13.1f)
                reflectiveCurveToRelative(18.1f, -19.1f, 13.1f, -31.3f)
                lineToRelative(-42.0f, -102.0f)
                curveTo(484.9f, 354.1f, 544.0f, 280.0f, 544.0f, 192.0f)
                lineTo(544.0f, 128.0f)
                verticalLineToRelative(-8.0f)
                lineToRelative(80.5f, -20.1f)
                curveToRelative(8.6f, -2.1f, 13.8f, -10.8f, 11.6f, -19.4f)
                curveTo(629.0f, 52.0f, 603.4f, 32.0f, 574.0f, 32.0f)
                lineTo(523.9f, 32.0f)
                curveTo(507.7f, 12.5f, 483.3f, 0.0f, 456.0f, 0.0f)
                close()
                moveTo(456.0f, 64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _crow!!
    }

private var _crow: ImageVector? = null
