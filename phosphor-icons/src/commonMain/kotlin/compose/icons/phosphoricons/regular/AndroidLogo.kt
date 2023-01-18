package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 156.0f)
                close()
                moveTo(92.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 144.0f)
                close()
                moveTo(240.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(32.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(16.0f, 169.1f)
                arcTo(113.4f, 113.4f, 0.0f, false, true, 51.4f, 86.7f)
                lineToRelative(-25.1f, -25.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 37.7f, 50.3f)
                lineTo(63.8f, 76.5f)
                arcToRelative(111.5f, 111.5f, 0.0f, false, true, 128.6f, -0.2f)
                lineToRelative(25.9f, -26.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                lineTo(204.8f, 86.5f)
                lineToRelative(2.3f, 2.2f)
                arcTo(111.2f, 111.2f, 0.0f, false, true, 240.0f, 168.0f)
                close()
                moveTo(224.0f, 168.0f)
                arcToRelative(95.3f, 95.3f, 0.0f, false, false, -28.2f, -68.0f)
                arcToRelative(98.5f, 98.5f, 0.0f, false, false, -7.7f, -6.8f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, false, -0.1f, -0.1f)
                arcTo(95.0f, 95.0f, 0.0f, false, false, 128.0f, 72.0f)
                horizontalLineToRelative(-0.3f)
                curveTo(74.9f, 72.2f, 32.0f, 115.8f, 32.0f, 169.1f)
                lineTo(32.0f, 192.0f)
                lineTo(224.0f, 192.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
