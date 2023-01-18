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

public val BoldGroup.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) {
            return _twitterLogo!!
        }
        _twitterLogo = Builder(name = "TwitterLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.1f, 67.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 60.0f)
                horizontalLineTo(211.8f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 116.0f, 88.0f)
                verticalLineToRelative(0.8f)
                curveToRelative(-37.3f, -11.5f, -67.2f, -41.0f, -67.5f, -41.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.3f, 6.4f)
                curveToRelative(-9.0f, 49.6f, 6.0f, 83.0f, 20.1f, 102.2f)
                arcToRelative(112.3f, 112.3f, 0.0f, false, false, 22.0f, 22.5f)
                curveTo(55.9f, 193.0f, 36.0f, 200.7f, 35.8f, 200.8f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -7.2f, 7.5f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 30.0f, 218.7f)
                curveToRelative(1.9f, 2.9f, 13.4f, 17.3f, 50.0f, 17.3f)
                curveToRelative(72.1f, 0.0f, 132.5f, -55.1f, 139.3f, -126.4f)
                lineToRelative(29.2f, -29.1f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 251.1f, 67.4f)
                close()
                moveTo(199.3f, 95.8f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -3.5f, 7.7f)
                curveTo(191.9f, 164.3f, 141.0f, 212.0f, 80.0f, 212.0f)
                arcToRelative(89.4f, 89.4f, 0.0f, false, true, -12.5f, -0.8f)
                curveToRelative(10.4f, -6.7f, 22.2f, -16.1f, 30.5f, -28.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 1.6f, -9.8f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -6.2f, -7.6f)
                curveToRelative(-2.0f, -1.1f, -45.6f, -24.2f, -43.9f, -85.4f)
                curveToRelative(17.2f, 13.1f, 45.0f, 30.7f, 76.5f, 35.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 140.0f, 104.0f)
                verticalLineTo(88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(28.3f, 28.3f, 0.0f, false, true, 28.4f, -28.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 25.3f, 16.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.0f, 7.2f)
                horizontalLineTo(211.0f)
                close()
            }
        }
        .build()
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
