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

public val BoldGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.6f, 129.6f)
                arcTo(38.9f, 38.9f, 0.0f, false, false, 168.0f, 108.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                arcToRelative(38.9f, 38.9f, 0.0f, false, false, 6.4f, 21.6f)
                arcToRelative(28.5f, 28.5f, 0.0f, false, false, -4.7f, 4.5f)
                arcTo(27.6f, 27.6f, 0.0f, false, false, 83.6f, 157.0f)
                lineToRelative(10.2f, 56.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.6f, 23.0f)
                horizontalLineToRelative(13.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.6f, -23.0f)
                lineToRelative(10.2f, -56.0f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, false, -6.1f, -22.9f)
                arcTo(28.5f, 28.5f, 0.0f, false, false, 161.6f, 129.6f)
                close()
                moveTo(128.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 92.0f)
                close()
                moveTo(148.8f, 152.7f)
                lineTo(138.6f, 208.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, 3.3f)
                lineTo(121.4f, 212.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, -3.3f)
                lineToRelative(-10.2f, -56.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.9f, -3.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.1f, -1.4f)
                horizontalLineToRelative(33.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.1f, 1.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 148.8f, 152.7f)
                close()
                moveTo(236.0f, 128.0f)
                arcToRelative(108.3f, 108.3f, 0.0f, false, true, -34.5f, 79.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.3f, -17.5f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, false, -114.4f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -16.3f, 17.5f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 236.0f, 128.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
