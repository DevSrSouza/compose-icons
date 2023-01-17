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

public val RegularGroup.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) {
            return _fileAudio!!
        }
        _fileAudio = Builder(name = "FileAudio", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(365.3f, 93.38f)
                lineToRelative(-74.63f, -74.64f)
                curveTo(278.6f, 6.742f, 262.3f, 0.0f, 245.4f, 0.0f)
                lineTo(64.0f, -0.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
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
                moveTo(171.5f, 259.5f)
                lineTo(136.0f, 296.0f)
                horizontalLineTo(92.0f)
                curveTo(85.38f, 296.0f, 80.0f, 301.4f, 80.0f, 308.0f)
                verticalLineToRelative(56.0f)
                curveTo(80.0f, 370.7f, 85.38f, 376.0f, 92.0f, 376.0f)
                horizontalLineTo(136.0f)
                lineToRelative(35.5f, 36.5f)
                curveTo(179.1f, 420.0f, 192.0f, 414.8f, 192.0f, 404.0f)
                verticalLineToRelative(-136.0f)
                curveTo(192.0f, 257.3f, 179.1f, 251.9f, 171.5f, 259.5f)
                close()
                moveTo(235.1f, 260.7f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.62f)
                curveTo(235.3f, 283.5f, 256.0f, 305.1f, 256.0f, 336.0f)
                curveToRelative(0.0f, 30.94f, -20.77f, 52.53f, -20.91f, 52.69f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0.0f, 22.62f)
                curveTo(238.2f, 414.4f, 242.3f, 416.0f, 246.4f, 416.0f)
                reflectiveCurveToRelative(8.188f, -1.562f, 11.31f, -4.688f)
                curveTo(258.1f, 410.1f, 288.0f, 380.5f, 288.0f, 336.0f)
                reflectiveCurveToRelative(-29.05f, -74.06f, -30.28f, -75.31f)
                curveTo(251.5f, 254.4f, 241.3f, 254.4f, 235.1f, 260.7f)
                close()
            }
        }
        .build()
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
