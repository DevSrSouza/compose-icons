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

public val LightGroup.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) {
            return _twitterLogo!!
        }
        _twitterLogo = Builder(name = "TwitterLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.5f, 69.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 240.0f, 66.0f)
                lineTo(208.4f, 66.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -39.8f, -24.0f)
                arcTo(46.4f, 46.4f, 0.0f, false, false, 122.0f, 88.0f)
                verticalLineToRelative(8.7f)
                curveTo(79.6f, 86.6f, 44.6f, 52.1f, 44.2f, 51.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.1f, 3.1f)
                curveToRelative(-8.7f, 47.6f, 5.6f, 79.4f, 19.1f, 97.7f)
                arcToRelative(105.6f, 105.6f, 0.0f, false, false, 26.0f, 25.1f)
                curveToRelative(-15.5f, 18.8f, -41.0f, 28.6f, -41.3f, 28.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.6f, 3.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.7f, 5.1f)
                curveToRelative(1.0f, 1.5f, 10.8f, 14.7f, 45.0f, 14.7f)
                curveToRelative(69.7f, 0.0f, 128.0f, -53.9f, 133.6f, -123.1f)
                lineToRelative(30.6f, -30.7f)
                arcTo(5.7f, 5.7f, 0.0f, false, false, 245.5f, 69.7f)
                close()
                moveTo(203.5f, 100.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -1.7f, 3.9f)
                curveTo(197.7f, 167.9f, 144.2f, 218.0f, 80.0f, 218.0f)
                curveToRelative(-13.9f, 0.0f, -22.8f, -2.4f, -28.1f, -4.8f)
                curveToRelative(11.3f, -5.7f, 29.8f, -16.9f, 41.1f, -33.9f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 0.8f, -4.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.1f, -3.9f)
                curveToRelative(-0.2f, 0.0f, -15.2f, -7.8f, -28.2f, -25.6f)
                curveTo(47.0f, 123.8f, 40.9f, 97.9f, 44.3f, 68.0f)
                curveToRelative(14.6f, 12.4f, 46.1f, 35.8f, 82.7f, 41.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 7.0f, -5.9f)
                lineTo(134.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(34.3f, 34.3f, 0.0f, false, true, 34.4f, -34.0f)
                arcToRelative(34.2f, 34.2f, 0.0f, false, true, 30.8f, 20.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.5f, 3.6f)
                horizontalLineToRelative(20.8f)
                close()
            }
        }
        .build()
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
