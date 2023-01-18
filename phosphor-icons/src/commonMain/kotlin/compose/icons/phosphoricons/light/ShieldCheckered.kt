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

public val LightGroup.ShieldCheckered: ImageVector
    get() {
        if (_shieldCheckered != null) {
            return _shieldCheckered!!
        }
        _shieldCheckered = Builder(name = "ShieldCheckered", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 114.7f)
                lineTo(222.0f, 56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(48.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 56.0f)
                verticalLineToRelative(58.7f)
                quadToRelative(0.0f, 7.0f, 0.6f, 13.8f)
                verticalLineToRelative(0.2f)
                curveToRelative(7.4f, 77.2f, 74.8f, 103.5f, 88.9f, 108.2f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 4.4f, 0.7f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, 4.3f, -0.7f)
                curveToRelative(14.2f, -4.7f, 81.6f, -31.0f, 89.0f, -108.2f)
                verticalLineToRelative(-0.3f)
                arcTo(121.9f, 121.9f, 0.0f, false, false, 222.0f, 114.7f)
                close()
                moveTo(210.0f, 56.0f)
                verticalLineToRelative(58.7f)
                curveToRelative(0.0f, 2.5f, -0.1f, 4.9f, -0.2f, 7.3f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 54.0f)
                horizontalLineToRelative(74.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 56.0f)
                close()
                moveTo(46.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(74.0f)
                verticalLineToRelative(68.0f)
                lineTo(46.2f, 122.0f)
                curveToRelative(-0.1f, -2.4f, -0.2f, -4.8f, -0.2f, -7.3f)
                close()
                moveTo(47.4f, 134.0f)
                lineTo(122.0f, 134.0f)
                verticalLineToRelative(89.6f)
                curveTo(103.2f, 216.1f, 56.2f, 191.9f, 47.4f, 134.0f)
                close()
                moveTo(134.0f, 223.5f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(74.6f)
                curveTo(199.8f, 191.9f, 152.8f, 216.1f, 134.0f, 223.5f)
                close()
            }
        }
        .build()
        return _shieldCheckered!!
    }

private var _shieldCheckered: ImageVector? = null
