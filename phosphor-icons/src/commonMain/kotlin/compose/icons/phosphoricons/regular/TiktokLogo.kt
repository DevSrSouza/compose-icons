package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TiktokLogo: ImageVector
    get() {
        if (_tiktokLogo != null) {
            return _tiktokLogo!!
        }
        _tiktokLogo = Builder(name = "TiktokLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 76.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(128.0f, 20.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(120.0f, 156.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, -28.6f, -18.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.6f, -7.2f)
                lineTo(96.0f, 89.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.9f, -6.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.5f, -1.7f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 176.0f, 156.0f)
                lineTo(176.0f, 120.3f)
                arcTo(103.2f, 103.2f, 0.0f, false, false, 224.0f, 132.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 84.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 224.0f, 76.0f)
                close()
                moveTo(216.0f, 115.6f)
                arcToRelative(87.4f, 87.4f, 0.0f, false, true, -43.3f, -16.1f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 160.0f, 106.0f)
                verticalLineToRelative(50.0f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 80.0f, 99.4f)
                verticalLineToRelative(26.7f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 136.0f, 156.0f)
                lineTo(136.0f, 36.0f)
                horizontalLineToRelative(24.5f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 216.0f, 91.5f)
                close()
            }
        }
        .build()
        return _tiktokLogo!!
    }

private var _tiktokLogo: ImageVector? = null
