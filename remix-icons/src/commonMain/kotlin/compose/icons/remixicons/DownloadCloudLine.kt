package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.DownloadCloudLine: ImageVector
    get() {
        if (_downloadCloudLine != null) {
            return _downloadCloudLine!!
        }
        _downloadCloudLine = Builder(name = "DownloadCloudLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0f, 14.5f)
                arcToRelative(6.496f, 6.496f, 0.0f, false, true, 3.064f, -5.519f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, true, 15.872f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.936f, 12.0f)
                lineTo(7.0f, 21.0f)
                curveToRelative(-3.356f, -0.274f, -6.0f, -3.078f, -6.0f, -6.5f)
                close()
                moveTo(16.848f, 18.987f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.03f, -8.309f)
                lineToRelative(-0.807f, -0.503f)
                lineToRelative(-0.12f, -0.942f)
                arcToRelative(6.001f, 6.001f, 0.0f, false, false, -11.903f, 0.0f)
                lineToRelative(-0.12f, 0.942f)
                lineToRelative(-0.805f, 0.503f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 2.029f, 8.309f)
                lineToRelative(0.173f, 0.013f)
                horizontalLineToRelative(9.35f)
                lineToRelative(0.173f, -0.013f)
                close()
                moveTo(13.0f, 12.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(-4.0f, 5.0f)
                lineToRelative(-4.0f, -5.0f)
                horizontalLineToRelative(3.0f)
                lineTo(11.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                close()
            }
        }
        .build()
        return _downloadCloudLine!!
    }

private var _downloadCloudLine: ImageVector? = null
