package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 102.0f, 102.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 128.1f, 26.0f)
                close()
                moveTo(128.1f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.1f, 218.0f)
                close()
                moveTo(184.5f, 111.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.1f, 2.6f)
                arcToRelative(106.0f, 106.0f, 0.0f, false, false, -96.8f, 0.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, true, -2.8f, 0.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 74.1f, 103.0f)
                arcToRelative(118.5f, 118.5f, 0.0f, false, true, 54.0f, -13.0f)
                arcToRelative(116.7f, 116.7f, 0.0f, false, true, 53.8f, 13.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 184.5f, 111.1f)
                close()
                moveTo(169.7f, 139.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.1f, 2.7f)
                arcToRelative(73.7f, 73.7f, 0.0f, false, false, -67.2f, 0.0f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, -2.7f, 0.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.8f, -11.4f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, true, 78.2f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 169.7f, 139.4f)
                close()
                moveTo(154.9f, 167.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.1f, 2.6f)
                arcToRelative(41.8f, 41.8f, 0.0f, false, false, -18.7f, -4.4f)
                arcToRelative(41.1f, 41.1f, 0.0f, false, false, -18.9f, 4.5f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, true, -2.7f, 0.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -5.4f, -3.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 2.7f, -8.0f)
                arcToRelative(52.4f, 52.4f, 0.0f, false, true, 24.3f, -5.8f)
                arcToRelative(53.1f, 53.1f, 0.0f, false, true, 24.1f, 5.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 154.9f, 167.8f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
