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

public val ThinGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.2f, 124.7f)
                lineToRelative(-48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, -0.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 108.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 3.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.9f, 0.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, -0.7f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -6.6f)
                close()
                moveTo(116.0f, 152.5f)
                verticalLineToRelative(-49.0f)
                lineTo(152.8f, 128.0f)
                close()
                moveTo(230.5f, 70.8f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -12.1f, -13.6f)
                curveToRelative(-33.8f, -13.0f, -88.1f, -12.8f, -90.4f, -12.8f)
                reflectiveCurveToRelative(-56.6f, -0.2f, -90.4f, 12.8f)
                arcTo(20.4f, 20.4f, 0.0f, false, false, 25.5f, 70.8f)
                curveTo(23.0f, 80.5f, 20.0f, 98.3f, 20.0f, 128.0f)
                reflectiveCurveToRelative(3.0f, 47.5f, 5.5f, 57.2f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 12.1f, 13.6f)
                curveToRelative(33.8f, 13.0f, 88.1f, 12.8f, 90.4f, 12.8f)
                horizontalLineToRelative(0.7f)
                curveToRelative(6.9f, 0.0f, 57.6f, -0.4f, 89.7f, -12.8f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 12.1f, -13.6f)
                curveToRelative(2.5f, -9.7f, 5.5f, -27.5f, 5.5f, -57.2f)
                reflectiveCurveTo(233.0f, 80.5f, 230.5f, 70.8f)
                close()
                moveTo(222.7f, 183.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, 8.1f)
                curveToRelative(-32.4f, 12.5f, -86.9f, 12.3f, -87.5f, 12.3f)
                reflectiveCurveToRelative(-55.1f, 0.2f, -87.5f, -12.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.2f, -8.1f)
                curveTo(30.9f, 173.9f, 28.0f, 156.8f, 28.0f, 128.0f)
                reflectiveCurveToRelative(2.9f, -45.9f, 5.3f, -55.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.2f, -8.1f)
                curveTo(72.9f, 52.2f, 127.4f, 52.4f, 128.0f, 52.4f)
                reflectiveCurveToRelative(55.1f, -0.2f, 87.5f, 12.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.2f, 8.1f)
                curveToRelative(2.4f, 9.3f, 5.3f, 26.4f, 5.3f, 55.2f)
                reflectiveCurveTo(225.1f, 173.9f, 222.7f, 183.2f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
