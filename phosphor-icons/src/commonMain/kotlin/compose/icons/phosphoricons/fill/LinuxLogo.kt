package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.2f, 217.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 6.3f)
                lineTo(98.1f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, -6.3f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 66.4f, 0.0f)
                close()
                moveTo(229.8f, 221.5f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.0f, 2.5f)
                lineTo(184.6f, 224.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.8f, -2.7f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -105.6f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.8f, 2.7f)
                lineTo(32.2f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.0f, -2.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -1.1f, -9.5f)
                curveToRelative(0.3f, -0.5f, 30.9f, -55.0f, 30.9f, -116.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 72.5f, -72.0f)
                curveToRelative(39.6f, 0.3f, 71.4f, 32.9f, 71.5f, 72.5f)
                curveToRelative(0.2f, 60.8f, 30.6f, 115.0f, 30.9f, 115.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 229.8f, 221.5f)
                close()
                moveTo(88.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 88.0f, 108.0f)
                close()
                moveTo(167.2f, 140.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -10.8f, -3.6f)
                lineTo(128.0f, 151.1f)
                lineTo(99.6f, 136.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -7.2f, 14.4f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 7.2f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 167.2f, 140.4f)
                close()
                moveTo(168.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 168.0f, 108.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
