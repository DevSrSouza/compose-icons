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

public val SimpleIcons.Temporal: ImageVector
    get() {
        if (_temporal != null) {
            return _temporal!!
        }
        _temporal = Builder(name = "Temporal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.206f, 7.794f)
                curveTo(15.64f, 3.546f, 14.204f, 0.0f, 12.0f, 0.0f)
                curveTo(9.796f, 0.0f, 8.361f, 3.546f, 7.794f, 7.794f)
                curveTo(3.546f, 8.36f, 0.0f, 9.796f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.204f, 3.546f, 3.639f, 7.794f, 4.206f)
                curveTo(8.36f, 20.453f, 9.796f, 24.0f, 12.0f, 24.0f)
                curveToRelative(2.204f, 0.0f, 3.639f, -3.546f, 4.206f, -7.794f)
                curveTo(20.454f, 15.64f, 24.0f, 14.204f, 24.0f, 12.0f)
                curveToRelative(0.0f, -2.204f, -3.547f, -3.64f, -7.794f, -4.206f)
                close()
                moveTo(7.656f, 14.968f)
                curveToRelative(-4.069f, -0.587f, -6.44f, -1.932f, -6.44f, -2.969f)
                curveToRelative(0.0f, -1.036f, 2.372f, -2.381f, 6.44f, -2.969f)
                curveToRelative(-0.09f, 0.98f, -0.137f, 1.98f, -0.137f, 2.97f)
                curveToRelative(0.0f, 0.99f, 0.047f, 1.99f, 0.137f, 2.968f)
                close()
                moveTo(12.0f, 1.215f)
                curveToRelative(1.036f, 0.0f, 2.381f, 2.372f, 2.969f, 6.44f)
                arcToRelative(32.718f, 32.718f, 0.0f, false, false, -5.938f, 0.0f)
                curveToRelative(0.587f, -4.068f, 1.932f, -6.44f, 2.969f, -6.44f)
                close()
                moveTo(16.344f, 14.968f)
                curveToRelative(-0.2f, 0.03f, -1.022f, 0.126f, -1.23f, 0.146f)
                curveToRelative(-0.02f, 0.209f, -0.117f, 1.03f, -0.145f, 1.23f)
                curveToRelative(-0.588f, 4.068f, -1.933f, 6.44f, -2.97f, 6.44f)
                curveToRelative(-1.036f, 0.0f, -2.38f, -2.372f, -2.968f, -6.44f)
                curveToRelative(-0.03f, -0.2f, -0.126f, -1.022f, -0.147f, -1.23f)
                arcToRelative(31.833f, 31.833f, 0.0f, false, true, 0.0f, -6.23f)
                arcToRelative(31.813f, 31.813f, 0.0f, false, true, 7.46f, 0.146f)
                curveToRelative(4.068f, 0.587f, 6.442f, 1.933f, 6.442f, 2.969f)
                curveToRelative(-0.001f, 1.036f, -2.374f, 2.382f, -6.442f, 2.97f)
                close()
            }
        }
        .build()
        return _temporal!!
    }

private var _temporal: ImageVector? = null
