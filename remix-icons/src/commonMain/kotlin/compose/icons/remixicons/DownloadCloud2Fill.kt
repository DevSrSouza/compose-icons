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

public val RemixIcons.DownloadCloud2Fill: ImageVector
    get() {
        if (_downloadCloud2Fill != null) {
            return _downloadCloud2Fill!!
        }
        _downloadCloud2Fill = Builder(name = "DownloadCloud2Fill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 13.0f)
                verticalLineToRelative(5.585f)
                lineToRelative(1.828f, -1.828f)
                lineToRelative(1.415f, 1.415f)
                lineTo(12.0f, 22.414f)
                lineToRelative(-4.243f, -4.242f)
                lineToRelative(1.415f, -1.415f)
                lineTo(11.0f, 18.585f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(12.0f, 2.0f)
                arcToRelative(7.001f, 7.001f, 0.0f, false, true, 6.954f, 6.194f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.953f, 10.784f)
                lineTo(18.0f, 17.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.996f, -0.225f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(1.978f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -0.954f, -10.784f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _downloadCloud2Fill!!
    }

private var _downloadCloud2Fill: ImageVector? = null
