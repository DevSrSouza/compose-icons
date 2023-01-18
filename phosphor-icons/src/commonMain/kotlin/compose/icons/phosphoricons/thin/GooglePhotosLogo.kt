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

public val ThinGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 128.0f)
                lineTo(178.5f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 132.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(128.0f, 77.5f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 20.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(77.5f, 128.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 124.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(128.0f, 178.5f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 236.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 128.0f)
                close()
                moveTo(136.0f, 28.1f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 166.6f, 128.0f)
                lineTo(136.0f, 128.0f)
                close()
                moveTo(84.0f, 68.0f)
                arcToRelative(55.6f, 55.6f, 0.0f, false, true, 44.0f, 21.4f)
                lineTo(128.0f, 120.0f)
                lineTo(28.1f, 120.0f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 84.0f, 68.0f)
                close()
                moveTo(120.0f, 227.9f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 89.4f, 128.0f)
                lineTo(120.0f, 128.0f)
                close()
                moveTo(172.0f, 188.0f)
                arcToRelative(55.6f, 55.6f, 0.0f, false, true, -44.0f, -21.4f)
                lineTo(128.0f, 136.0f)
                horizontalLineToRelative(99.9f)
                arcTo(56.2f, 56.2f, 0.0f, false, true, 172.0f, 188.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
