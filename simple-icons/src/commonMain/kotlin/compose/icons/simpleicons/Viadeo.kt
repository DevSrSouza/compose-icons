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

public val SimpleIcons.Viadeo: ImageVector
    get() {
        if (_viadeo != null) {
            return _viadeo!!
        }
        _viadeo = Builder(name = "Viadeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.106f, 21.987f)
                horizontalLineToRelative(0.029f)
                curveToRelative(1.158f, 0.0f, 2.221f, -0.281f, 3.188f, -0.841f)
                curveToRelative(0.968f, -0.56f, 1.734f, -1.354f, 2.304f, -2.385f)
                curveToRelative(0.567f, -1.027f, 0.853f, -2.137f, 0.853f, -3.33f)
                curveToRelative(0.0f, -0.964f, -0.166f, -1.855f, -0.51f, -2.67f)
                curveToRelative(0.57f, -0.119f, 1.26f, -0.354f, 1.979f, -0.799f)
                curveToRelative(0.435f, 1.053f, 0.66f, 2.194f, 0.66f, 3.426f)
                curveToRelative(0.0f, 2.295f, -0.78f, 4.305f, -2.37f, 6.03f)
                curveTo(14.647f, 23.13f, 12.622f, 24.0f, 10.147f, 24.0f)
                curveToRelative(-2.49f, 0.0f, -4.522f, -0.859f, -6.1f, -2.581f)
                curveToRelative(-1.576f, -1.72f, -2.355f, -3.731f, -2.355f, -6.029f)
                curveToRelative(0.0f, -2.283f, 0.746f, -4.26f, 2.24f, -5.935f)
                curveToRelative(1.635f, -1.846f, 3.711f, -2.77f, 6.215f, -2.77f)
                curveToRelative(1.057f, 0.0f, 2.034f, 0.165f, 2.936f, 0.492f)
                curveToRelative(-0.292f, 0.572f, -0.558f, 1.274f, -0.629f, 2.029f)
                curveToRelative(-0.717f, -0.3f, -1.486f, -0.45f, -2.311f, -0.45f)
                curveToRelative(-1.737f, 0.0f, -3.229f, 0.652f, -4.475f, 1.955f)
                curveTo(4.424f, 12.016f, 3.8f, 13.592f, 3.8f, 15.437f)
                curveToRelative(0.0f, 1.2f, 0.285f, 2.31f, 0.855f, 3.329f)
                curveToRelative(0.566f, 1.036f, 1.334f, 1.83f, 2.301f, 2.387f)
                curveToRelative(0.645f, 0.375f, 1.327f, 0.63f, 2.051f, 0.75f)
                curveToRelative(6.207f, -2.4f, 5.477f, -14.16f, 5.431f, -14.806f)
                lineToRelative(0.053f, 0.165f)
                curveToRelative(3.646f, 9.734f, -4.301f, 14.744f, -4.301f, 14.744f)
                horizontalLineToRelative(-0.075f)
                lineToRelative(-0.009f, -0.019f)
                close()
                moveTo(21.078f, 0.544f)
                curveToRelative(-1.016f, 2.157f, -2.896f, 2.558f, -2.896f, 2.558f)
                curveToRelative(-1.878f, 0.477f, -2.534f, 1.201f, -2.534f, 1.201f)
                curveToRelative(-1.879f, 1.889f, -0.4f, 4.182f, -0.4f, 4.182f)
                curveToRelative(4.059f, -0.924f, 5.541f, -4.258f, 5.541f, -4.258f)
                curveToRelative(-0.181f, 2.24f, -5.011f, 4.887f, -5.011f, 4.887f)
                curveToRelative(1.599f, 1.563f, 3.124f, 1.375f, 4.132f, 0.774f)
                curveToRelative(1.336f, -0.795f, 1.978f, -2.535f, 1.978f, -2.535f)
                curveToRelative(1.294f, -3.871f, -0.81f, -6.81f, -0.81f, -6.809f)
                close()
                moveTo(11.103f, 0.0f)
                curveToRelative(1.994f, 3.354f, 3.08f, 6.365f, 3.324f, 7.08f)
                verticalLineToRelative(-0.029f)
                curveTo(13.935f, 1.883f, 11.097f, 0.0f, 11.097f, 0.0f)
                horizontalLineToRelative(0.006f)
                close()
            }
        }
        .build()
        return _viadeo!!
    }

private var _viadeo: ImageVector? = null
