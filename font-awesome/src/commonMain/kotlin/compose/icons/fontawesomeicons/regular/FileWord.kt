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

public val RegularGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.3f, 93.38f)
                lineToRelative(-74.63f, -74.64f)
                curveTo(278.6f, 6.742f, 262.3f, 0.0f, 245.4f, 0.0f)
                horizontalLineTo(64.0f)
                curveTo(28.65f, 0.0f, 0.0f, 28.65f, 0.0f, 64.0f)
                lineToRelative(0.007f, 384.0f)
                curveToRelative(0.0f, 35.34f, 28.65f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(320.0f)
                curveToRelative(35.2f, 0.0f, 64.0f, -28.8f, 64.0f, -64.0f)
                verticalLineTo(138.6f)
                curveTo(384.0f, 121.7f, 377.3f, 105.4f, 365.3f, 93.38f)
                close()
                moveTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.836f, -7.164f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(64.02f)
                curveToRelative(-8.838f, 0.0f, -16.0f, -7.164f, -16.0f, -16.0f)
                lineTo(48.0f, 64.13f)
                curveToRelative(0.0f, -8.836f, 7.164f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(160.0f)
                lineTo(224.0f, 128.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(79.1f)
                verticalLineTo(448.0f)
                close()
                moveTo(214.6f, 248.0f)
                curveTo(211.3f, 238.4f, 202.2f, 232.0f, 192.0f, 232.0f)
                reflectiveCurveToRelative(-19.25f, 6.406f, -22.62f, 16.0f)
                lineTo(144.7f, 318.1f)
                lineToRelative(-25.89f, -77.66f)
                curveTo(114.6f, 227.8f, 101.0f, 221.2f, 88.41f, 225.2f)
                curveTo(75.83f, 229.4f, 69.05f, 243.0f, 73.23f, 255.6f)
                lineToRelative(48.0f, 144.0f)
                curveTo(124.5f, 409.3f, 133.5f, 415.9f, 143.8f, 416.0f)
                curveToRelative(10.17f, 0.0f, 19.45f, -6.406f, 22.83f, -16.0f)
                lineTo(192.0f, 328.1f)
                lineTo(217.4f, 400.0f)
                curveTo(220.8f, 409.6f, 229.8f, 416.0f, 240.0f, 416.0f)
                curveToRelative(10.27f, -0.094f, 19.53f, -6.688f, 22.77f, -16.41f)
                lineToRelative(48.0f, -144.0f)
                curveToRelative(4.188f, -12.59f, -2.594f, -26.16f, -15.17f, -30.38f)
                curveToRelative(-12.61f, -4.125f, -26.2f, 2.594f, -30.36f, 15.19f)
                lineToRelative(-25.89f, 77.66f)
                lineTo(214.6f, 248.0f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
