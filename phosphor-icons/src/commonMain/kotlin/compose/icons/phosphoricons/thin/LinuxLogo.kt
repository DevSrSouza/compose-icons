package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.0f, 219.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, -2.0f, 0.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.5f, -2.0f)
                curveToRelative(-1.3f, -2.3f, -32.5f, -57.7f, -32.5f, -122.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 68.0f, 96.0f)
                curveToRelative(0.0f, 64.3f, -31.2f, 119.7f, -32.5f, 122.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.0f, -4.0f)
                curveToRelative(0.3f, -0.5f, 31.5f, -55.9f, 31.5f, -118.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 62.1f, 31.2f, 117.5f, 31.5f, 118.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 226.0f, 219.5f)
                close()
                moveTo(100.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 100.0f, 100.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 108.0f)
                close()
                moveTo(97.8f, 140.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.6f, 7.2f)
                lineToRelative(32.0f, 16.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.6f, 0.0f)
                lineToRelative(32.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -3.6f, -7.2f)
                lineTo(128.0f, 155.5f)
                close()
                moveTo(128.0f, 188.0f)
                arcToRelative(52.1f, 52.1f, 0.0f, false, false, -45.0f, 26.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.9f, 4.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 76.2f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.0f, -0.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 173.0f, 214.0f)
                arcTo(52.1f, 52.1f, 0.0f, false, false, 128.0f, 188.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
