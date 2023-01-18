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

public val RemixIcons.DownloadLine: ImageVector
    get() {
        if (_downloadLine != null) {
            return _downloadLine!!
        }
        _downloadLine = Builder(name = "DownloadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 19.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(13.0f, 13.172f)
                lineTo(19.071f, 7.1f)
                lineToRelative(1.414f, 1.414f)
                lineTo(12.0f, 17.0f)
                lineTo(3.515f, 8.515f)
                lineTo(4.929f, 7.1f)
                lineTo(11.0f, 13.17f)
                lineTo(11.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(11.172f)
                close()
            }
        }
        .build()
        return _downloadLine!!
    }

private var _downloadLine: ImageVector? = null
