package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 24.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, false, 104.0f, 104.0f)
                arcTo(104.1f, 104.1f, 0.0f, false, false, 128.1f, 24.0f)
                close()
                moveTo(156.7f, 168.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -10.8f, 3.5f)
                arcToRelative(39.8f, 39.8f, 0.0f, false, false, -35.8f, 0.1f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, true, -3.6f, 0.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.6f, -15.1f)
                arcToRelative(55.0f, 55.0f, 0.0f, false, true, 25.2f, -6.0f)
                arcToRelative(55.7f, 55.7f, 0.0f, false, true, 25.0f, 5.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.7f, 168.7f)
                close()
                moveTo(171.5f, 140.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.8f, 3.5f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -65.4f, 0.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.6f, 0.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 88.0f, 129.6f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 80.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 171.5f, 140.3f)
                close()
                moveTo(186.3f, 112.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -10.8f, 3.4f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, false, -95.0f, 0.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -3.7f, 0.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -3.6f, -15.1f)
                arcToRelative(119.9f, 119.9f, 0.0f, false, true, 109.6f, -0.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 186.3f, 112.0f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
