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

public val LightGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.4f, 36.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.8f, 8.0f)
                lineTo(64.4f, 67.0f)
                curveToRelative(-37.2f, 21.9f, -53.2f, 57.0f, -53.9f, 58.6f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 0.0f, 4.8f)
                curveToRelative(0.4f, 0.8f, 8.7f, 19.3f, 27.3f, 37.8f)
                reflectiveCurveTo(84.6f, 206.0f, 128.0f, 206.0f)
                arcToRelative(124.6f, 124.6f, 0.0f, false, false, 52.6f, -11.3f)
                lineToRelative(23.0f, 25.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -8.4f)
                close()
                moveTo(101.1f, 107.3f)
                lineTo(146.1f, 156.8f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, -45.0f, -49.5f)
                close()
                moveTo(128.0f, 194.0f)
                curveToRelative(-31.4f, 0.0f, -58.8f, -11.4f, -81.4f, -33.9f)
                arcTo(133.9f, 133.9f, 0.0f, false, true, 22.7f, 128.0f)
                curveToRelative(4.3f, -8.2f, 20.1f, -35.2f, 50.0f, -51.9f)
                lineTo(92.9f, 98.3f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 61.3f, 67.5f)
                lineTo(172.0f, 185.4f)
                arcTo(113.2f, 113.2f, 0.0f, false, true, 128.0f, 194.0f)
                close()
                moveTo(245.5f, 130.4f)
                curveToRelative(-0.4f, 1.0f, -10.4f, 23.0f, -32.9f, 43.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.0f, 1.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -4.5f, -2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.5f, -8.5f)
                arcTo(134.2f, 134.2f, 0.0f, false, false, 233.3f, 128.0f)
                arcToRelative(133.9f, 133.9f, 0.0f, false, false, -23.9f, -32.1f)
                curveTo(186.8f, 73.4f, 159.4f, 62.0f, 128.0f, 62.0f)
                arcToRelative(116.4f, 116.4f, 0.0f, false, false, -19.7f, 1.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.0f, -11.8f)
                arcTo(128.8f, 128.8f, 0.0f, false, true, 128.0f, 50.0f)
                curveToRelative(43.4f, 0.0f, 73.0f, 20.5f, 90.2f, 37.8f)
                reflectiveCurveToRelative(26.9f, 37.0f, 27.3f, 37.8f)
                arcTo(5.7f, 5.7f, 0.0f, false, true, 245.5f, 130.4f)
                close()
                moveTo(134.4f, 94.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.2f, -11.8f)
                arcToRelative(46.2f, 46.2f, 0.0f, false, true, 37.2f, 40.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.4f, 6.5f)
                horizontalLineToRelative(-0.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.9f, -5.4f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 134.4f, 94.6f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
