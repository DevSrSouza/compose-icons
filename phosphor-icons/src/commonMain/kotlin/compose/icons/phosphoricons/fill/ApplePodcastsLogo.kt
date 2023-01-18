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

public val FillGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(140.5f, 144.0f)
                horizontalLineToRelative(-25.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -15.4f, 7.3f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -4.2f, 16.6f)
                lineToRelative(9.6f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 125.1f, 232.0f)
                horizontalLineToRelative(5.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 19.6f, -16.1f)
                lineToRelative(9.6f, -48.0f)
                arcToRelative(19.6f, 19.6f, 0.0f, false, false, -4.2f, -16.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 140.5f, 144.0f)
                close()
                moveTo(180.2f, 148.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.9f, 5.8f)
                arcTo(70.7f, 70.7f, 0.0f, false, false, 200.0f, 128.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -144.0f, 0.0f)
                arcToRelative(70.3f, 70.3f, 0.0f, false, false, 4.9f, 26.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.4f, 5.1f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, false, 2.9f, -0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.6f, -10.3f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 104.4f, 0.0f)
                close()
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 72.0f, 215.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.7f, -13.5f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 94.6f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.4f, 14.7f)
                arcToRelative(8.8f, 8.8f, 0.0f, false, false, 4.3f, -1.2f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 128.0f, 24.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
