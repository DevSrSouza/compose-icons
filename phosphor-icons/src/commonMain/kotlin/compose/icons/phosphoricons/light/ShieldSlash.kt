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

public val LightGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.9f, 228.0f)
                lineTo(192.0f, 189.5f)
                horizontalLineToRelative(-0.1f)
                lineTo(37.9f, 20.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, -8.8f, 8.0f)
                lineTo(42.7f, 43.0f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 88.0f, 74.7f, 117.3f, 89.7f, 122.2f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, 8.6f, 0.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, false, 55.2f, -34.5f)
                lineTo(218.1f, 236.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.4f, 2.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 4.0f, -1.6f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 226.9f, 228.0f)
                close()
                moveTo(128.6f, 225.5f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -1.2f, 0.0f)
                curveTo(113.8f, 221.0f, 46.0f, 194.5f, 46.0f, 114.7f)
                lineTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(4.7f)
                lineTo(179.4f, 193.5f)
                arcTo(130.8f, 130.8f, 0.0f, false, true, 128.6f, 225.5f)
                close()
                moveTo(92.5f, 48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(208.0f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 19.4f, -3.7f, 37.4f, -11.0f, 53.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.5f, 3.5f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -2.4f, -0.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.0f, -7.9f)
                curveToRelative(6.6f, -14.6f, 9.9f, -30.9f, 9.9f, -48.6f)
                lineTo(210.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(98.5f, 54.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 92.5f, 48.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
