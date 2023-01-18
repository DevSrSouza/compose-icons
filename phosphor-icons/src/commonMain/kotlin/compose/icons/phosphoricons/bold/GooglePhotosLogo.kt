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

public val BoldGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 120.0f)
                lineTo(194.4f, 120.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 132.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                lineTo(120.0f, 61.6f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 12.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(61.6f, 136.0f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 124.0f, 244.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(136.0f, 194.4f)
                arcTo(72.1f, 72.1f, 0.0f, false, false, 244.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 120.0f)
                close()
                moveTo(180.0f, 84.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, -16.3f, 36.0f)
                lineTo(144.0f, 120.0f)
                lineTo(144.0f, 37.5f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 180.0f, 84.0f)
                close()
                moveTo(84.0f, 76.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, 36.0f, 16.3f)
                lineTo(120.0f, 112.0f)
                lineTo(37.5f, 112.0f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 84.0f, 76.0f)
                close()
                moveTo(76.0f, 172.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, 16.3f, -36.0f)
                lineTo(112.0f, 136.0f)
                verticalLineToRelative(82.5f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 76.0f, 172.0f)
                close()
                moveTo(172.0f, 180.0f)
                arcToRelative(47.4f, 47.4f, 0.0f, false, true, -36.0f, -16.3f)
                lineTo(136.0f, 144.0f)
                horizontalLineToRelative(82.5f)
                arcTo(48.2f, 48.2f, 0.0f, false, true, 172.0f, 180.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
