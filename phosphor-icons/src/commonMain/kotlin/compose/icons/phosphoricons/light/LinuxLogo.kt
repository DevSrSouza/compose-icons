package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.0f, 221.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.2f, -2.2f)
                curveToRelative(-1.3f, -2.4f, -32.8f, -58.2f, -32.8f, -123.0f)
                arcTo(58.0f, 58.0f, 0.0f, false, false, 70.0f, 96.0f)
                curveToRelative(0.0f, 64.8f, -31.5f, 120.6f, -32.8f, 123.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.2f, 3.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -3.0f, -0.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -2.2f, -8.2f)
                curveToRelative(0.4f, -0.7f, 31.2f, -55.5f, 31.2f, -117.0f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, true, 140.0f, 0.0f)
                curveToRelative(0.0f, 61.6f, 30.9f, 116.5f, 31.2f, 117.0f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 227.0f, 221.2f)
                close()
                moveTo(100.0f, 98.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 100.0f, 98.0f)
                close()
                moveTo(166.0f, 108.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, -10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 166.0f, 108.0f)
                close()
                moveTo(98.7f, 138.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.4f, 10.8f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 5.4f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -5.4f, -10.8f)
                lineTo(128.0f, 153.3f)
                close()
                moveTo(128.0f, 186.0f)
                arcToRelative(54.3f, 54.3f, 0.0f, false, false, -46.8f, 27.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, 8.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.2f, -2.2f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 72.8f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 3.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 3.0f, -0.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, -8.2f)
                arcTo(54.3f, 54.3f, 0.0f, false, false, 128.0f, 186.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
