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

public val FillGroup.RedditLogo: ImageVector
    get() {
        if (_redditLogo != null) {
            return _redditLogo!!
        }
        _redditLogo = Builder(name = "RedditLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 104.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -52.9f, -24.2f)
                curveToRelative(-16.8f, -8.9f, -36.8f, -14.3f, -57.7f, -15.5f)
                lineToRelative(5.2f, -31.2f)
                lineToRelative(21.8f, 3.4f)
                arcToRelative(24.2f, 24.2f, 0.0f, true, false, 2.5f, -15.8f)
                lineToRelative(-29.7f, -4.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.1f, 6.6f)
                lineToRelative(-6.9f, 41.5f)
                curveToRelative(-21.8f, 0.9f, -42.8f, 6.3f, -60.3f, 15.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -42.6f, 47.7f)
                arcTo(61.4f, 61.4f, 0.0f, false, false, 16.0f, 144.0f)
                curveToRelative(0.0f, 21.9f, 12.0f, 42.4f, 33.9f, 57.5f)
                reflectiveCurveTo(98.6f, 224.0f, 128.0f, 224.0f)
                reflectiveCurveToRelative(57.1f, -8.0f, 78.1f, -22.5f)
                reflectiveCurveTo(240.0f, 165.9f, 240.0f, 144.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, -2.3f, -16.4f)
                arcTo(32.4f, 32.4f, 0.0f, false, false, 248.0f, 104.0f)
                close()
                moveTo(72.0f, 132.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 132.0f)
                close()
                moveTo(164.7f, 183.1f)
                arcToRelative(80.1f, 80.1f, 0.0f, false, true, -73.4f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.3f, -14.2f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, false, 58.8f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.3f, 14.2f)
                close()
                moveTo(168.0f, 148.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 168.0f, 148.0f)
                close()
            }
        }
        .build()
        return _redditLogo!!
    }

private var _redditLogo: ImageVector? = null
