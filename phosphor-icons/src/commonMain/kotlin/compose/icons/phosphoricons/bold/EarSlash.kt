package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.EarSlash: ImageVector
    get() {
        if (_earSlash != null) {
            return _earSlash!!
        }
        _earSlash = Builder(name = "EarSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.9f, 207.9f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -0.8f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, -0.8f)
                lineToRelative(-36.5f, -40.2f)
                lineTo(160.0f, 183.9f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                arcToRelative(35.6f, 35.6f, 0.0f, false, true, 0.4f, -5.7f)
                lineTo(97.1f, 111.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 88.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                arcToRelative(49.8f, 49.8f, 0.0f, false, true, 1.8f, -13.4f)
                lineTo(65.5f, 77.1f)
                arcTo(68.1f, 68.1f, 0.0f, false, false, 60.0f, 104.0f)
                curveToRelative(0.0f, 25.0f, 7.6f, 32.3f, 16.3f, 40.8f)
                reflectiveCurveTo(96.0f, 163.7f, 96.0f, 188.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 56.7f, 20.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.5f, 15.2f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 72.0f, 188.0f)
                curveToRelative(0.0f, -14.1f, -4.6f, -18.6f, -12.3f, -26.0f)
                curveTo(49.1f, 151.9f, 36.0f, 139.2f, 36.0f, 104.0f)
                arcTo(90.7f, 90.7f, 0.0f, false, true, 48.3f, 58.1f)
                lineToRelative(-9.2f, -10.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.9f, 31.9f)
                lineTo(72.2f, 48.8f)
                horizontalLineToRelative(0.1f)
                lineToRelative(27.9f, 30.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(75.4f, 83.0f)
                horizontalLineToRelative(0.1f)
                close()
                moveTo(99.3f, 42.3f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 196.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, -92.0f)
                arcToRelative(91.1f, 91.1f, 0.0f, false, false, -38.8f, 8.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 99.3f, 42.3f)
                close()
                moveTo(163.5f, 122.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 3.5f, 0.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 11.5f, -8.6f)
                arcTo(38.1f, 38.1f, 0.0f, false, false, 180.0f, 104.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -52.0f, -52.0f)
                lineToRelative(-5.1f, 0.2f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -10.8f, 13.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 13.1f, 10.7f)
                lineTo(128.0f, 76.1f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -0.5f, 4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 163.5f, 122.9f)
                close()
            }
        }
        .build()
        return _earSlash!!
    }

private var _earSlash: ImageVector? = null
