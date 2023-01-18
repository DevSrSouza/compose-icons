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

public val RegularGroup.YoutubeLogo: ImageVector
    get() {
        if (_youtubeLogo != null) {
            return _youtubeLogo!!
        }
        _youtubeLogo = Builder(name = "YoutubeLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.4f, 121.3f)
                lineToRelative(-48.0f, -32.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -8.2f, -0.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 7.1f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, false, 3.8f, 0.9f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, 4.4f, -1.3f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -13.4f)
                close()
                moveTo(120.0f, 145.1f)
                verticalLineTo(110.9f)
                lineTo(145.6f, 128.0f)
                close()
                moveTo(234.3f, 69.8f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, -14.5f, -16.3f)
                curveTo(185.6f, 40.3f, 131.0f, 40.4f, 128.0f, 40.4f)
                reflectiveCurveToRelative(-57.6f, -0.1f, -91.8f, 13.1f)
                arcTo(23.5f, 23.5f, 0.0f, false, false, 21.7f, 69.8f)
                curveTo(19.1f, 79.7f, 16.0f, 97.9f, 16.0f, 128.0f)
                reflectiveCurveToRelative(3.1f, 48.3f, 5.7f, 58.2f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, 14.5f, 16.3f)
                curveToRelative(32.8f, 12.7f, 84.2f, 13.1f, 91.1f, 13.1f)
                horizontalLineToRelative(1.4f)
                curveToRelative(6.9f, 0.0f, 58.3f, -0.4f, 91.1f, -13.1f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, 14.5f, -16.3f)
                curveToRelative(2.6f, -9.9f, 5.7f, -28.1f, 5.7f, -58.2f)
                reflectiveCurveTo(236.9f, 79.7f, 234.3f, 69.8f)
                close()
                moveTo(218.8f, 182.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -4.7f, 5.4f)
                curveToRelative(-31.7f, 12.2f, -85.5f, 12.0f, -86.1f, 12.0f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-0.5f, 0.0f, -54.3f, 0.2f, -86.0f, -12.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -4.7f, -5.4f)
                curveTo(34.8f, 173.1f, 32.0f, 156.4f, 32.0f, 128.0f)
                reflectiveCurveToRelative(2.8f, -45.1f, 5.2f, -54.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 4.7f, -5.4f)
                curveToRelative(30.5f, -11.7f, 81.7f, -12.0f, 85.9f, -12.0f)
                horizontalLineToRelative(0.2f)
                curveToRelative(0.6f, 0.0f, 54.4f, -0.2f, 86.1f, 12.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 4.7f, 5.4f)
                curveToRelative(2.4f, 9.1f, 5.2f, 25.8f, 5.2f, 54.2f)
                reflectiveCurveTo(221.2f, 173.1f, 218.8f, 182.2f)
                close()
            }
        }
        .build()
        return _youtubeLogo!!
    }

private var _youtubeLogo: ImageVector? = null
