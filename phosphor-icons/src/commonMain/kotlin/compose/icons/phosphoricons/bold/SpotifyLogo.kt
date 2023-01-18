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

public val BoldGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 108.0f, 108.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.1f, 20.0f)
                close()
                moveTo(128.1f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.1f, 212.0f)
                close()
                moveTo(189.9f, 121.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -16.2f, 5.2f)
                arcToRelative(100.4f, 100.4f, 0.0f, false, false, -91.4f, 0.0f)
                arcToRelative(10.7f, 10.7f, 0.0f, false, true, -5.5f, 1.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.5f, -22.7f)
                arcToRelative(124.2f, 124.2f, 0.0f, false, true, 113.4f, 0.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 189.9f, 121.8f)
                close()
                moveTo(169.5f, 160.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -16.1f, 5.2f)
                arcToRelative(55.7f, 55.7f, 0.0f, false, false, -25.3f, -6.0f)
                arcToRelative(54.4f, 54.4f, 0.0f, false, false, -25.4f, 6.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.5f, 1.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.7f, -6.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 5.3f, -16.1f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, 72.4f, -0.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 169.5f, 160.8f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
