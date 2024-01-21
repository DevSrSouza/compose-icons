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

public val SolidGroup.VideoSlash: ImageVector
    get() {
        if (_videoSlash != null) {
            return _videoSlash!!
        }
        _videoSlash = Builder(name = "VideoSlash", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-86.4f, -67.7f)
                lineToRelative(13.8f, 9.2f)
                curveToRelative(9.8f, 6.5f, 22.4f, 7.2f, 32.9f, 1.6f)
                reflectiveCurveToRelative(16.9f, -16.4f, 16.9f, -28.2f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -11.8f, -6.5f, -22.6f, -16.9f, -28.2f)
                reflectiveCurveToRelative(-23.0f, -5.0f, -32.9f, 1.6f)
                lineToRelative(-96.0f, 64.0f)
                lineTo(448.0f, 174.9f)
                verticalLineTo(192.0f)
                verticalLineTo(320.0f)
                verticalLineToRelative(5.8f)
                lineToRelative(-32.0f, -25.1f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                horizontalLineTo(113.9f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(407.0f, 416.7f)
                lineTo(32.3f, 121.5f)
                curveToRelative(-0.2f, 2.1f, -0.3f, 4.3f, -0.3f, 6.5f)
                verticalLineTo(384.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(352.0f)
                curveToRelative(23.4f, 0.0f, 43.9f, -12.6f, 55.0f, -31.3f)
                close()
            }
        }
        .build()
        return _videoSlash!!
    }

private var _videoSlash: ImageVector? = null
