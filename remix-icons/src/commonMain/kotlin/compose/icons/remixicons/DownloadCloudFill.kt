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

public val RemixIcons.DownloadCloudFill: ImageVector
    get() {
        if (_downloadCloudFill != null) {
            return _downloadCloudFill!!
        }
        _downloadCloudFill = Builder(name = "DownloadCloudFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 20.981f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.936f, -12.0f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, true, 15.872f, 0.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.936f, 12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-0.019f)
                close()
                moveTo(13.0f, 12.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(8.0f)
                lineToRelative(4.0f, 5.0f)
                lineToRelative(4.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _downloadCloudFill!!
    }

private var _downloadCloudFill: ImageVector? = null
