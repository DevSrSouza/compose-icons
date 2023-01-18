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

public val RemixIcons.VideoDownloadFill: ImageVector
    get() {
        if (_videoDownloadFill != null) {
            return _videoDownloadFill!!
        }
        _videoDownloadFill = Builder(name = "VideoDownloadFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveToRelative(0.552f, 0.0f, 1.0f, 0.448f, 1.0f, 1.0f)
                verticalLineToRelative(4.2f)
                lineToRelative(5.213f, -3.65f)
                curveToRelative(0.226f, -0.158f, 0.538f, -0.103f, 0.697f, 0.124f)
                curveToRelative(0.058f, 0.084f, 0.09f, 0.184f, 0.09f, 0.286f)
                verticalLineToRelative(12.08f)
                curveToRelative(0.0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
                curveToRelative(-0.103f, 0.0f, -0.203f, -0.032f, -0.287f, -0.09f)
                lineTo(17.0f, 14.8f)
                lineTo(17.0f, 19.0f)
                curveToRelative(0.0f, 0.552f, -0.448f, 1.0f, -1.0f, 1.0f)
                lineTo(2.0f, 20.0f)
                curveToRelative(-0.552f, 0.0f, -1.0f, -0.448f, -1.0f, -1.0f)
                lineTo(1.0f, 5.0f)
                curveToRelative(0.0f, -0.552f, 0.448f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(10.0f, 8.0f)
                lineTo(8.0f, 8.0f)
                verticalLineToRelative(4.0f)
                lineTo(5.0f, 12.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(4.0f, -4.0f)
                horizontalLineToRelative(-3.0f)
                lineTo(10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _videoDownloadFill!!
    }

private var _videoDownloadFill: ImageVector? = null
