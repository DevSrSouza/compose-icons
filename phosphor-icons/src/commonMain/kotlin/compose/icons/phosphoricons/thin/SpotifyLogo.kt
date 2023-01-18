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

public val ThinGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 100.0f, 100.0f)
                arcTo(100.1f, 100.1f, 0.0f, false, false, 128.1f, 28.0f)
                close()
                moveTo(128.1f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.1f, 220.0f)
                close()
                moveTo(182.7f, 110.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.3f, 1.7f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, false, -98.7f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -1.9f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, -7.6f)
                arcToRelative(116.1f, 116.1f, 0.0f, false, true, 106.0f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 182.7f, 110.2f)
                close()
                moveTo(167.9f, 138.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.4f, 1.8f)
                arcToRelative(74.6f, 74.6f, 0.0f, false, false, -34.4f, -8.3f)
                arcToRelative(75.4f, 75.4f, 0.0f, false, false, -34.6f, 8.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -1.8f, 0.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.6f, -2.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.7f, -5.4f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, 76.4f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 167.9f, 138.5f)
                close()
                moveTo(153.1f, 166.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.4f, 1.7f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, -39.4f, 0.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.8f, 0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.8f, -7.6f)
                arcToRelative(52.6f, 52.6f, 0.0f, false, true, 23.4f, -5.5f)
                arcToRelative(50.8f, 50.8f, 0.0f, false, true, 23.2f, 5.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 153.1f, 166.9f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
