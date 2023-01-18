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

public val BoldGroup.LinuxLogo: ImageVector
    get() {
        if (_linuxLogo != null) {
            return _linuxLogo!!
        }
        _linuxLogo = Builder(name = "LinuxLogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 88.0f, 112.0f)
                close()
                moveTo(168.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 168.0f, 112.0f)
                close()
                moveTo(151.3f, 141.0f)
                lineTo(128.0f, 150.9f)
                lineTo(104.7f, 141.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.4f, 22.0f)
                lineToRelative(28.0f, 12.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 9.4f, 0.0f)
                lineToRelative(28.0f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.4f, -22.0f)
                close()
                moveTo(161.2f, 202.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, -66.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.7f, 22.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 6.6f, -2.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 39.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.3f, -20.0f)
                close()
                moveTo(230.8f, 207.0f)
                curveToRelative(-0.3f, -0.5f, -22.8f, -50.4f, -22.8f, -103.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, -160.0f, 0.0f)
                curveToRelative(0.0f, 52.5f, -22.5f, 102.4f, -22.8f, 103.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 5.9f, 15.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 5.0f, 1.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 11.0f, -7.0f)
                curveToRelative(1.0f, -2.2f, 24.9f, -55.0f, 24.9f, -113.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 112.0f, 0.0f)
                curveToRelative(0.0f, 58.0f, 23.9f, 110.8f, 24.9f, 113.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.9f, -10.0f)
                close()
            }
        }
        .build()
        return _linuxLogo!!
    }

private var _linuxLogo: ImageVector? = null
