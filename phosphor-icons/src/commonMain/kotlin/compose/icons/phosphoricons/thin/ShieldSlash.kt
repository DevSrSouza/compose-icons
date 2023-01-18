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

public val ThinGroup.ShieldSlash: ImageVector
    get() {
        if (_shieldSlash != null) {
            return _shieldSlash!!
        }
        _shieldSlash = Builder(name = "ShieldSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.5f, 229.3f)
                lineToRelative(-189.0f, -208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.0f, 5.4f)
                lineTo(46.4f, 44.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 86.7f, 73.5f, 115.4f, 88.3f, 120.3f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 7.4f, 0.0f)
                curveToRelative(7.8f, -2.6f, 34.1f, -12.5f, 55.8f, -35.5f)
                lineToRelative(32.0f, 35.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 5.7f, 0.3f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 225.5f, 229.3f)
                close()
                moveTo(129.2f, 227.4f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, -2.4f, 0.0f)
                curveTo(113.0f, 222.9f, 44.0f, 195.9f, 44.0f, 114.7f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(5.5f)
                lineTo(182.1f, 193.5f)
                curveTo(161.6f, 215.5f, 136.6f, 225.0f, 129.2f, 227.4f)
                close()
                moveTo(94.5f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 19.1f, -3.6f, 36.8f, -10.8f, 52.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.7f, 2.3f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, -1.6f, -0.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.3f)
                curveToRelative(6.7f, -14.8f, 10.1f, -31.4f, 10.1f, -49.4f)
                lineTo(212.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(98.5f, 52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 94.5f, 48.0f)
                close()
            }
        }
        .build()
        return _shieldSlash!!
    }

private var _shieldSlash: ImageVector? = null
