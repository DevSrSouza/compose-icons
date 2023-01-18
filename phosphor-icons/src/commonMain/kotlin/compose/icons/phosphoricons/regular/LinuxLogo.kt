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

public val RegularGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 222.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -10.9f, -2.9f)
                curveToRelative(-1.4f, -2.4f, -33.1f, -58.6f, -33.1f, -124.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 72.0f, 96.0f)
                curveToRelative(0.0f, 65.4f, -31.7f, 121.6f, -33.1f, 124.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, true, -6.9f, 4.0f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -4.0f, -1.1f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 25.1f, 212.0f)
                curveToRelative(0.3f, -0.5f, 30.9f, -55.0f, 30.9f, -116.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 144.0f, 0.0f)
                curveToRelative(0.0f, 61.0f, 30.6f, 115.5f, 30.9f, 116.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 228.0f, 222.9f)
                close()
                moveTo(100.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 100.0f, 96.0f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
                moveTo(99.6f, 136.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.2f, 14.4f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 7.2f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.2f, -14.4f)
                lineTo(128.0f, 151.1f)
                close()
                moveTo(128.0f, 184.0f)
                arcToRelative(56.2f, 56.2f, 0.0f, false, false, -48.5f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 13.8f, 8.0f)
                arcToRelative(40.1f, 40.1f, 0.0f, false, true, 69.4f, 0.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 6.9f, 4.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, false, 4.0f, -1.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.9f, -10.9f)
                arcTo(56.2f, 56.2f, 0.0f, false, false, 128.0f, 184.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
