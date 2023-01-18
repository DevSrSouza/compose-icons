package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) {
            return _twitterLogo!!
        }
        _twitterLogo = Builder(name = "TwitterLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.4f, 68.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 240.0f, 64.0f)
                horizontalLineTo(209.6f)
                arcToRelative(47.8f, 47.8f, 0.0f, false, false, -75.2f, -10.1f)
                arcTo(47.7f, 47.7f, 0.0f, false, false, 120.0f, 88.0f)
                verticalLineToRelative(6.1f)
                curveTo(79.3f, 83.5f, 46.0f, 50.7f, 45.7f, 50.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.1f, -1.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -5.5f, 6.2f)
                curveToRelative(-8.7f, 48.2f, 5.8f, 80.5f, 19.5f, 99.1f)
                arcToRelative(108.6f, 108.6f, 0.0f, false, false, 24.7f, 24.4f)
                curveTo(61.0f, 195.4f, 37.4f, 204.4f, 37.2f, 204.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.9f, 11.9f)
                curveToRelative(0.8f, 1.2f, 3.8f, 5.1f, 11.1f, 8.8f)
                curveToRelative(9.1f, 4.5f, 21.1f, 6.8f, 35.6f, 6.8f)
                curveToRelative(70.5f, 0.0f, 129.5f, -54.3f, 135.5f, -124.2f)
                lineToRelative(30.2f, -30.1f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 247.4f, 68.9f)
                close()
                moveTo(202.1f, 98.6f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.3f, 5.2f)
                curveTo(195.7f, 166.7f, 143.1f, 216.0f, 80.0f, 216.0f)
                curveToRelative(-10.6f, 0.0f, -18.0f, -1.4f, -23.2f, -3.1f)
                curveToRelative(11.5f, -6.2f, 27.5f, -17.0f, 37.9f, -32.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, -6.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -4.1f, -5.1f)
                curveToRelative(-0.1f, -0.1f, -14.9f, -7.8f, -27.6f, -25.3f)
                curveTo(49.6f, 123.8f, 43.5f, 99.7f, 45.9f, 71.9f)
                curveToRelative(15.8f, 13.0f, 46.0f, 34.2f, 80.8f, 40.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 6.5f, -1.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 136.0f, 104.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 61.3f, -12.8f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.4f, 4.8f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
