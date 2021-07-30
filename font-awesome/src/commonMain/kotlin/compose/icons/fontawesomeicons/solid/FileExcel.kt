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

public val SolidGroup.FileExcel: ImageVector
    get() {
        if (_fileExcel != null) {
            return _fileExcel!!
        }
        _fileExcel = Builder(name = "FileExcel", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(284.1f, 242.5f)
                lineTo(224.0f, 336.0f)
                lineToRelative(60.1f, 93.5f)
                curveToRelative(5.1f, 8.0f, -0.6f, 18.5f, -10.1f, 18.5f)
                horizontalLineToRelative(-34.9f)
                curveToRelative(-4.4f, 0.0f, -8.5f, -2.4f, -10.6f, -6.3f)
                curveTo(208.9f, 405.5f, 192.0f, 373.0f, 192.0f, 373.0f)
                curveToRelative(-6.4f, 14.8f, -10.0f, 20.0f, -36.6f, 68.8f)
                curveToRelative(-2.1f, 3.9f, -6.1f, 6.3f, -10.5f, 6.3f)
                lineTo(110.0f, 448.1f)
                curveToRelative(-9.5f, 0.0f, -15.2f, -10.5f, -10.1f, -18.5f)
                lineToRelative(60.3f, -93.5f)
                lineToRelative(-60.3f, -93.5f)
                curveToRelative(-5.2f, -8.0f, 0.6f, -18.5f, 10.1f, -18.5f)
                horizontalLineToRelative(34.8f)
                curveToRelative(4.4f, 0.0f, 8.5f, 2.4f, 10.6f, 6.3f)
                curveToRelative(26.1f, 48.8f, 20.0f, 33.6f, 36.6f, 68.5f)
                curveToRelative(0.0f, 0.0f, 6.1f, -11.7f, 36.6f, -68.5f)
                curveToRelative(2.1f, -3.9f, 6.2f, -6.3f, 10.6f, -6.3f)
                lineTo(274.0f, 224.1f)
                curveToRelative(9.5f, -0.1f, 15.2f, 10.4f, 10.1f, 18.4f)
                close()
                moveTo(384.0f, 121.9f)
                verticalLineToRelative(6.1f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0.0f, 12.5f, 2.5f, 17.0f, 7.0f)
                lineToRelative(97.9f, 98.0f)
                curveToRelative(4.5f, 4.5f, 7.0f, 10.6f, 7.0f, 16.9f)
                close()
            }
        }
        .build()
        return _fileExcel!!
    }

private var _fileExcel: ImageVector? = null
