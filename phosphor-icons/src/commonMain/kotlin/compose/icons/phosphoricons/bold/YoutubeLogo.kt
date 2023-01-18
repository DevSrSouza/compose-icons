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

public val BoldGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(170.5f, 117.9f)
                lineToRelative(-56.0f, -36.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 96.0f, 92.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.3f, 10.5f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 108.0f, 176.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.5f, -1.9f)
                lineToRelative(56.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -20.2f)
                close()
                moveTo(120.0f, 142.0f)
                verticalLineTo(114.0f)
                lineToRelative(21.8f, 14.0f)
                close()
                moveTo(238.2f, 68.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -16.9f, -19.1f)
                curveToRelative(-34.9f, -13.4f, -90.0f, -13.3f, -93.3f, -13.3f)
                reflectiveCurveToRelative(-58.4f, -0.1f, -93.3f, 13.3f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 17.8f, 68.8f)
                curveTo(15.2f, 78.9f, 12.0f, 97.5f, 12.0f, 128.0f)
                reflectiveCurveToRelative(3.2f, 49.1f, 5.8f, 59.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 16.9f, 19.1f)
                curveToRelative(33.5f, 12.8f, 85.7f, 13.3f, 92.7f, 13.3f)
                horizontalLineToRelative(1.2f)
                curveToRelative(7.0f, 0.0f, 59.2f, -0.5f, 92.7f, -13.3f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 16.9f, -19.1f)
                curveToRelative(2.6f, -10.1f, 5.8f, -28.7f, 5.8f, -59.2f)
                reflectiveCurveTo(240.8f, 78.9f, 238.2f, 68.8f)
                close()
                moveTo(215.0f, 181.2f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.3f, 2.7f)
                curveToRelative(-29.9f, 11.5f, -80.4f, 11.7f, -84.4f, 11.7f)
                horizontalLineToRelative(-0.4f)
                curveToRelative(-0.5f, 0.0f, -53.6f, 0.2f, -84.6f, -11.7f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -2.3f, -2.7f)
                curveToRelative(-1.9f, -7.2f, -5.0f, -23.7f, -5.0f, -53.2f)
                reflectiveCurveToRelative(3.1f, -46.0f, 5.0f, -53.2f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.3f, -2.7f)
                curveToRelative(31.0f, -11.9f, 84.1f, -11.7f, 84.6f, -11.7f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.5f, 0.0f, 53.6f, -0.2f, 84.6f, 11.7f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 2.3f, 2.7f)
                curveToRelative(1.9f, 7.2f, 5.0f, 23.7f, 5.0f, 53.2f)
                reflectiveCurveTo(216.9f, 174.0f, 215.0f, 181.2f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
