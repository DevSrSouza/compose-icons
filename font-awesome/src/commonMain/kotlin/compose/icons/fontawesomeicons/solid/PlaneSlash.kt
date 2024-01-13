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

public val SolidGroup.PlaneSlash: ImageVector
    get() {
        if (_planeSlash != null) {
            return _planeSlash!!
        }
        _planeSlash = Builder(name = "PlaneSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.6f, 320.0f)
                horizontalLineToRelative(73.8f)
                curveToRelative(34.2f, 0.0f, 93.7f, -28.0f, 93.7f, -64.0f)
                curveToRelative(0.0f, -35.0f, -59.5f, -64.0f, -93.7f, -64.0f)
                lineToRelative(-116.6f, 0.0f)
                lineTo(297.2f, 16.1f)
                curveTo(291.5f, 6.2f, 280.9f, 0.0f, 269.4f, 0.0f)
                lineTo(213.2f, 0.0f)
                curveToRelative(-10.6f, 0.0f, -18.3f, 10.2f, -15.4f, 20.4f)
                lineToRelative(40.3f, 140.9f)
                lineTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineTo(440.6f, 320.0f)
                close()
                moveTo(362.5f, 381.6f)
                lineTo(41.5f, 128.7f)
                curveTo(36.0f, 130.6f, 32.0f, 135.9f, 32.0f, 142.0f)
                curveToRelative(0.0f, 1.3f, 0.2f, 2.6f, 0.5f, 3.9f)
                lineTo(64.0f, 256.0f)
                lineTo(32.5f, 366.1f)
                curveToRelative(-0.4f, 1.3f, -0.5f, 2.6f, -0.5f, 3.9f)
                curveToRelative(0.0f, 7.8f, 6.3f, 14.0f, 14.0f, 14.0f)
                lineTo(88.0f, 384.0f)
                curveToRelative(5.0f, 0.0f, 9.8f, -2.4f, 12.8f, -6.4f)
                lineTo(144.0f, 320.0f)
                lineTo(246.9f, 320.0f)
                lineToRelative(-49.0f, 171.6f)
                curveToRelative(-2.9f, 10.2f, 4.8f, 20.4f, 15.4f, 20.4f)
                lineToRelative(56.2f, 0.0f)
                curveToRelative(11.5f, 0.0f, 22.1f, -6.2f, 27.8f, -16.1f)
                lineToRelative(65.3f, -114.3f)
                close()
            }
        }
        .build()
        return _planeSlash!!
    }

private var _planeSlash: ImageVector? = null
