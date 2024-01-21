package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.Hourglass: ImageVector
    get() {
        if (_hourglass != null) {
            return _hourglass!!
        }
        _hourglass = Builder(name = "Hourglass", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                reflectiveCurveTo(10.7f, 48.0f, 24.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                lineTo(32.0f, 67.0f)
                curveToRelative(0.0f, 40.3f, 16.0f, 79.0f, 44.5f, 107.5f)
                lineTo(158.1f, 256.0f)
                lineTo(76.5f, 337.5f)
                curveTo(48.0f, 366.0f, 32.0f, 404.7f, 32.0f, 445.0f)
                verticalLineToRelative(19.0f)
                lineTo(24.0f, 464.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineTo(360.0f, 512.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(352.0f, 445.0f)
                curveToRelative(0.0f, -40.3f, -16.0f, -79.0f, -44.5f, -107.5f)
                lineTo(225.9f, 256.0f)
                lineToRelative(81.5f, -81.5f)
                curveTo(336.0f, 146.0f, 352.0f, 107.3f, 352.0f, 67.0f)
                lineTo(352.0f, 48.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(192.0f, 289.9f)
                lineToRelative(81.5f, 81.5f)
                curveTo(293.0f, 391.0f, 304.0f, 417.4f, 304.0f, 445.0f)
                verticalLineToRelative(19.0f)
                lineTo(80.0f, 464.0f)
                lineTo(80.0f, 445.0f)
                curveToRelative(0.0f, -27.6f, 11.0f, -54.0f, 30.5f, -73.5f)
                lineTo(192.0f, 289.9f)
                close()
                moveTo(192.0f, 222.0f)
                lineToRelative(-81.5f, -81.5f)
                curveTo(91.0f, 121.0f, 80.0f, 94.6f, 80.0f, 67.0f)
                lineTo(80.0f, 48.0f)
                lineTo(304.0f, 48.0f)
                lineTo(304.0f, 67.0f)
                curveToRelative(0.0f, 27.6f, -11.0f, 54.0f, -30.5f, 73.5f)
                lineTo(192.0f, 222.1f)
                close()
            }
        }
        .build()
        return _hourglass!!
    }

private var _hourglass: ImageVector? = null
