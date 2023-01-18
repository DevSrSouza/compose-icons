package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.VimeoFill: ImageVector
    get() {
        if (_vimeoFill != null) {
            return _vimeoFill!!
        }
        _vimeoFill = Builder(name = "VimeoFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.173f, 8.301f)
                curveToRelative(-0.281f, -0.413f, -0.252f, -0.413f, 0.328f, -0.922f)
                curveToRelative(1.232f, -1.082f, 2.394f, -2.266f, 3.736f, -3.212f)
                curveToRelative(1.215f, -0.852f, 2.826f, -1.402f, 3.927f, -0.047f)
                curveToRelative(1.014f, 1.249f, 1.038f, 3.142f, 1.295f, 4.65f)
                curveToRelative(0.257f, 1.564f, 0.503f, 3.164f, 1.051f, 4.66f)
                curveToRelative(0.152f, 0.421f, 0.443f, 1.217f, 0.968f, 1.284f)
                curveToRelative(0.678f, 0.093f, 1.368f, -1.096f, 1.683f, -1.54f)
                curveToRelative(0.817f, -1.18f, 1.925f, -2.769f, 1.785f, -4.286f)
                curveToRelative(-0.138f, -1.612f, -1.878f, -1.309f, -2.966f, -0.924f)
                curveToRelative(0.175f, -1.809f, 1.858f, -3.843f, 3.48f, -4.53f)
                curveToRelative(1.72f, -0.714f, 4.276f, -0.702f, 5.14f, 1.237f)
                curveToRelative(0.923f, 2.102f, 0.093f, 4.543f, -0.912f, 6.448f)
                curveToRelative(-1.097f, 2.068f, -2.509f, 3.982f, -4.018f, 5.77f)
                curveToRelative(-1.331f, 1.588f, -2.906f, 3.33f, -4.89f, 4.089f)
                curveToRelative(-2.267f, 0.864f, -3.61f, -0.82f, -4.382f, -2.77f)
                curveToRelative(-0.843f, -2.123f, -1.262f, -4.506f, -1.87f, -6.717f)
                curveToRelative(-0.256f, -0.934f, -0.56f, -1.997f, -1.167f, -2.768f)
                curveToRelative(-0.792f, -0.995f, -1.692f, -0.06f, -2.474f, 0.477f)
                curveToRelative(-0.269f, -0.267f, -0.491f, -0.607f, -0.714f, -0.899f)
                close()
            }
        }
        .build()
        return _vimeoFill!!
    }

private var _vimeoFill: ImageVector? = null
