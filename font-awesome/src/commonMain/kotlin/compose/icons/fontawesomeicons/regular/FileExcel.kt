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

public val RegularGroup.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
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
                moveTo(229.1f, 233.3f)
                lineTo(192.0f, 280.9f)
                lineTo(154.9f, 233.3f)
                curveTo(146.8f, 222.8f, 131.8f, 220.9f, 121.3f, 229.1f)
                curveTo(110.8f, 237.2f, 108.9f, 252.3f, 117.1f, 262.8f)
                lineTo(161.6f, 320.0f)
                lineToRelative(-44.53f, 57.25f)
                curveToRelative(-8.156f, 10.47f, -6.25f, 25.56f, 4.188f, 33.69f)
                curveTo(125.7f, 414.3f, 130.8f, 416.0f, 135.1f, 416.0f)
                curveToRelative(7.156f, 0.0f, 14.25f, -3.188f, 18.97f, -9.25f)
                lineTo(192.0f, 359.1f)
                lineToRelative(37.06f, 47.65f)
                curveTo(233.8f, 412.8f, 240.9f, 416.0f, 248.0f, 416.0f)
                curveToRelative(5.125f, 0.0f, 10.31f, -1.656f, 14.72f, -5.062f)
                curveToRelative(10.44f, -8.125f, 12.34f, -23.22f, 4.188f, -33.69f)
                lineTo(222.4f, 320.0f)
                lineToRelative(44.53f, -57.25f)
                curveToRelative(8.156f, -10.47f, 6.25f, -25.56f, -4.188f, -33.69f)
                curveTo(252.2f, 220.9f, 237.2f, 222.8f, 229.1f, 233.3f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
