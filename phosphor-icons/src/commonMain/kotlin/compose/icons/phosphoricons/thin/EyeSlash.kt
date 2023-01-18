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

public val ThinGroup.EyeSlash: ImageVector
    get() {
        if (_eyeSlash != null) {
            return _eyeSlash!!
        }
        _eyeSlash = Builder(name = "EyeSlash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(67.6f, 67.5f)
                curveTo(29.3f, 88.9f, 13.0f, 124.8f, 12.3f, 126.4f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 0.0f, 3.2f)
                curveToRelative(0.4f, 0.8f, 8.6f, 18.9f, 26.9f, 37.2f)
                reflectiveCurveTo(85.3f, 204.0f, 128.0f, 204.0f)
                arcToRelative(122.4f, 122.4f, 0.0f, false, false, 53.1f, -11.7f)
                lineTo(205.0f, 218.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.3f, -5.7f)
                close()
                moveTo(149.1f, 157.2f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -48.1f, -53.0f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-32.0f, 0.0f, -59.9f, -11.7f, -83.0f, -34.6f)
                arcTo(138.7f, 138.7f, 0.0f, false, true, 20.4f, 128.0f)
                curveToRelative(3.7f, -7.2f, 20.1f, -36.8f, 52.7f, -54.4f)
                lineTo(95.6f, 98.3f)
                arcTo(43.9f, 43.9f, 0.0f, false, false, 128.0f, 172.0f)
                arcToRelative(43.6f, 43.6f, 0.0f, false, false, 26.5f, -8.9f)
                lineToRelative(20.9f, 23.0f)
                arcTo(114.4f, 114.4f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(243.7f, 129.6f)
                arcToRelative(141.3f, 141.3f, 0.0f, false, true, -32.4f, 42.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.7f, 1.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -3.0f, -1.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 0.3f, -5.7f)
                arcTo(136.4f, 136.4f, 0.0f, false, false, 235.6f, 128.0f)
                arcTo(136.8f, 136.8f, 0.0f, false, false, 211.0f, 94.6f)
                curveTo(187.9f, 71.6f, 160.0f, 60.0f, 128.0f, 60.0f)
                arcToRelative(119.1f, 119.1f, 0.0f, false, false, -20.0f, 1.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -4.6f, -3.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.3f, -4.6f)
                arcTo(135.1f, 135.1f, 0.0f, false, true, 128.0f, 52.0f)
                curveToRelative(42.7f, 0.0f, 71.9f, 20.2f, 88.8f, 37.2f)
                reflectiveCurveToRelative(26.5f, 36.4f, 26.9f, 37.2f)
                arcTo(4.4f, 4.4f, 0.0f, false, true, 243.7f, 129.6f)
                close()
                moveTo(134.8f, 92.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.2f, -4.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.7f, -3.2f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, 35.5f, 39.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.6f, 4.3f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.6f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 134.8f, 92.6f)
                close()
            }
        }
        .build()
        return _eyeSlash!!
    }

private var _eyeSlash: ImageVector? = null
