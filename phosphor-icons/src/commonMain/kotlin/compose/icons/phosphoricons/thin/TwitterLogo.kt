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

public val ThinGroup.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) {
            return _twitterLogo!!
        }
        _twitterLogo = Builder(name = "TwitterLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.7f, 70.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 68.0f)
                lineTo(207.2f, 68.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -38.6f, -24.0f)
                arcTo(44.4f, 44.4f, 0.0f, false, false, 124.0f, 88.0f)
                lineTo(124.0f, 99.2f)
                curveToRelative(-44.1f, -9.4f, -80.8f, -45.7f, -81.2f, -46.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -6.7f, 2.1f)
                curveToRelative(-8.6f, 46.8f, 5.4f, 78.1f, 18.7f, 96.1f)
                arcToRelative(101.8f, 101.8f, 0.0f, false, false, 27.4f, 25.8f)
                curveToRelative(-15.7f, 20.4f, -43.3f, 30.9f, -43.6f, 31.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.4f, 2.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.5f, 3.4f)
                curveToRelative(0.2f, 0.4f, 2.8f, 4.0f, 9.5f, 7.4f)
                curveToRelative(8.5f, 4.2f, 19.9f, 6.4f, 33.8f, 6.4f)
                curveToRelative(68.9f, 0.0f, 126.5f, -53.5f, 131.6f, -122.0f)
                lineToRelative(31.2f, -31.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 243.7f, 70.5f)
                close()
                moveTo(204.9f, 101.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.2f, 2.6f)
                curveTo(199.6f, 169.1f, 145.2f, 220.0f, 80.0f, 220.0f)
                curveToRelative(-17.8f, 0.0f, -27.6f, -3.9f, -32.5f, -6.9f)
                curveToRelative(10.4f, -4.8f, 31.5f, -16.3f, 43.8f, -34.9f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.6f, -3.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.1f, -2.6f)
                curveToRelative(-0.2f, -0.1f, -15.3f, -7.8f, -28.6f, -25.8f)
                curveTo(44.6f, 124.0f, 38.4f, 96.3f, 42.8f, 64.0f)
                curveToRelative(12.8f, 11.3f, 45.8f, 37.5f, 84.5f, 43.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.3f, -0.8f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 132.0f, 104.0f)
                lineTo(132.0f, 88.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(36.4f, 36.4f, 0.0f, false, true, 36.5f, -36.0f)
                arcTo(36.1f, 36.1f, 0.0f, false, true, 201.0f, 73.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.7f, 2.4f)
                horizontalLineToRelative(25.6f)
                close()
            }
        }
        .build()
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
