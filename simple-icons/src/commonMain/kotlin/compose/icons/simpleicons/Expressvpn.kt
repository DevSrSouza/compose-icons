package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Expressvpn: ImageVector
    get() {
        if (_expressvpn != null) {
            return _expressvpn!!
        }
        _expressvpn = Builder(name = "Expressvpn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.705f, 2.349f)
                arcToRelative(4.874f, 4.874f, 0.0f, false, false, -4.39f, 2.797f)
                lineTo(6.033f, 7.893f)
                horizontalLineToRelative(14.606f)
                curveToRelative(0.41f, 0.0f, 0.692f, 0.308f, 0.692f, 0.668f)
                curveToRelative(0.0f, 0.359f, -0.282f, 0.666f, -0.692f, 0.666f)
                horizontalLineTo(2.592f)
                lineTo(0.0f, 14.772f)
                horizontalLineToRelative(2.824f)
                curveToRelative(-0.796f, 1.72f, -1.002f, 2.567f, -1.002f, 3.26f)
                curveToRelative(0.0f, 2.105f, 1.72f, 3.62f, 4.416f, 3.62f)
                horizontalLineToRelative(8.239f)
                curveToRelative(1.771f, 0.0f, 3.337f, -1.412f, 3.337f, -3.03f)
                curveToRelative(0.0f, -1.411f, -1.206f, -2.515f, -2.772f, -2.515f)
                horizontalLineTo(5.596f)
                curveToRelative(-0.873f, 0.0f, -1.284f, -0.59f, -0.924f, -1.335f)
                horizontalLineToRelative(11.859f)
                curveToRelative(4.004f, 0.0f, 7.469f, -3.029f, 7.469f, -6.802f)
                curveToRelative(0.0f, -3.183f, -2.618f, -5.621f, -6.16f, -5.621f)
                close()
            }
        }
        .build()
        return _expressvpn!!
    }

private var _expressvpn: ImageVector? = null
