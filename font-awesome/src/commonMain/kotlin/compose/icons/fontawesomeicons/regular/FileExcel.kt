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
                moveTo(48.0f, 448.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                lineTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 154.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(274.7f, 18.7f)
                curveTo(262.7f, 6.7f, 246.5f, 0.0f, 229.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(154.9f, 233.3f)
                curveToRelative(-8.1f, -10.5f, -23.2f, -12.3f, -33.7f, -4.2f)
                reflectiveCurveToRelative(-12.3f, 23.2f, -4.2f, 33.7f)
                lineTo(161.6f, 320.0f)
                lineToRelative(-44.5f, 57.3f)
                curveToRelative(-8.1f, 10.5f, -6.3f, 25.5f, 4.2f, 33.7f)
                reflectiveCurveToRelative(25.5f, 6.3f, 33.7f, -4.2f)
                lineTo(192.0f, 359.1f)
                lineToRelative(37.1f, 47.6f)
                curveToRelative(8.1f, 10.5f, 23.2f, 12.3f, 33.7f, 4.2f)
                reflectiveCurveToRelative(12.3f, -23.2f, 4.2f, -33.7f)
                lineTo(222.4f, 320.0f)
                lineToRelative(44.5f, -57.3f)
                curveToRelative(8.1f, -10.5f, 6.3f, -25.5f, -4.2f, -33.7f)
                reflectiveCurveToRelative(-25.5f, -6.3f, -33.7f, 4.2f)
                lineTo(192.0f, 280.9f)
                lineToRelative(-37.1f, -47.6f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
