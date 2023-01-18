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

public val BoldGroup.GitlabLogo: ImageVector
    get() {
        if (_gitlabLogo != null) {
            return _gitlabLogo!!
        }
        _gitlabLogo = Builder(name = "GitlabLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(242.1f, 151.5f)
                lineTo(214.8f, 49.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -30.4f, -1.5f)
                lineTo(164.7f, 100.0f)
                lineTo(91.3f, 100.0f)
                lineTo(71.6f, 47.5f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 41.2f, 49.0f)
                lineTo(13.9f, 151.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 7.9f, 21.6f)
                lineToRelative(94.8f, 65.6f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, false, 8.7f, 3.4f)
                horizontalLineToRelative(5.4f)
                arcToRelative(21.1f, 21.1f, 0.0f, false, false, 8.7f, -3.4f)
                lineToRelative(94.8f, -65.6f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 242.1f, 151.5f)
                close()
                moveTo(155.7f, 124.0f)
                lineTo(128.0f, 197.8f)
                lineTo(100.3f, 124.0f)
                close()
                moveTo(57.9f, 79.3f)
                lineToRelative(13.9f, 36.9f)
                horizontalLineToRelative(0.0f)
                lineToRelative(31.5f, 84.1f)
                lineTo(37.8f, 154.9f)
                close()
                moveTo(152.7f, 200.3f)
                lineTo(184.2f, 116.2f)
                horizontalLineToRelative(0.0f)
                lineToRelative(13.9f, -36.9f)
                lineToRelative(20.1f, 75.6f)
                close()
            }
        }
        .build()
        return _gitlabLogo!!
    }

private var _gitlabLogo: ImageVector? = null
