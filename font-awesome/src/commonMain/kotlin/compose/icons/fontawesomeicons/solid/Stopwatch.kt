package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 304.0f)
                curveToRelative(0.0f, 114.9f, -93.1f, 208.0f, -208.0f, 208.0f)
                reflectiveCurveTo(16.0f, 418.9f, 16.0f, 304.0f)
                curveToRelative(0.0f, -104.0f, 76.3f, -190.2f, 176.0f, -205.5f)
                lineTo(192.0f, 64.0f)
                horizontalLineToRelative(-28.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, -5.4f, -12.0f, -12.0f)
                lineTo(152.0f, 12.0f)
                curveToRelative(0.0f, -6.6f, 5.4f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(120.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, 5.4f, 12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.6f, -5.4f, 12.0f, -12.0f, 12.0f)
                horizontalLineToRelative(-28.0f)
                verticalLineToRelative(34.5f)
                curveToRelative(37.5f, 5.8f, 71.7f, 21.6f, 99.7f, 44.6f)
                lineToRelative(27.5f, -27.5f)
                curveToRelative(4.7f, -4.7f, 12.3f, -4.7f, 17.0f, 0.0f)
                lineToRelative(28.3f, 28.3f)
                curveToRelative(4.7f, 4.7f, 4.7f, 12.3f, 0.0f, 17.0f)
                lineToRelative(-29.4f, 29.4f)
                lineToRelative(-0.6f, 0.6f)
                curveTo(419.7f, 223.3f, 432.0f, 262.2f, 432.0f, 304.0f)
                close()
                moveTo(256.0f, 340.0f)
                lineTo(256.0f, 188.5f)
                curveToRelative(0.0f, -6.6f, -5.4f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-40.0f)
                curveToRelative(-6.6f, 0.0f, -12.0f, 5.4f, -12.0f, 12.0f)
                lineTo(192.0f, 340.0f)
                curveToRelative(0.0f, 6.6f, 5.4f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(6.6f, 0.0f, 12.0f, -5.4f, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
