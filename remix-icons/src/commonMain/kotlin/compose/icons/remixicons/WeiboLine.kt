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

public val RemixIcons.WeiboLine: ImageVector
    get() {
        if (_weiboLine != null) {
            return _weiboLine!!
        }
        _weiboLine = Builder(name = "WeiboLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.194f, 14.197f)
                curveToRelative(0.0f, 3.362f, -4.53f, 6.424f, -9.926f, 6.424f)
                curveTo(5.318f, 20.62f, 1.0f, 18.189f, 1.0f, 14.534f)
                curveToRelative(0.0f, -1.947f, 1.18f, -4.087f, 3.24f, -6.088f)
                curveToRelative(2.832f, -2.746f, 6.229f, -4.033f, 7.858f, -2.448f)
                curveToRelative(0.498f, 0.482f, 0.723f, 1.122f, 0.719f, 1.858f)
                curveToRelative(1.975f, -0.576f, 3.65f, -0.404f, 4.483f, 0.752f)
                curveToRelative(0.449f, 0.623f, 0.532f, 1.38f, 0.326f, 2.207f)
                curveToRelative(1.511f, 0.61f, 2.568f, 1.77f, 2.568f, 3.382f)
                close()
                moveTo(15.754f, 12.127f)
                curveToRelative(-0.386f, -0.41f, -0.4f, -0.92f, -0.198f, -1.41f)
                curveToRelative(0.208f, -0.508f, 0.213f, -0.812f, 0.12f, -0.94f)
                curveToRelative(-0.264f, -0.368f, -1.533f, -0.363f, -3.194f, 0.311f)
                arcToRelative(2.043f, 2.043f, 0.0f, false, true, -0.509f, 0.14f)
                curveToRelative(-0.344f, 0.046f, -0.671f, 0.001f, -0.983f, -0.265f)
                curveToRelative(-0.419f, -0.359f, -0.474f, -0.855f, -0.322f, -1.316f)
                curveToRelative(0.215f, -0.67f, 0.18f, -1.076f, 0.037f, -1.215f)
                curveToRelative(-0.186f, -0.18f, -0.777f, -0.191f, -1.659f, 0.143f)
                curveToRelative(-1.069f, 0.405f, -2.298f, 1.224f, -3.414f, 2.306f)
                curveTo(3.925f, 11.54f, 3.0f, 13.218f, 3.0f, 14.534f)
                curveToRelative(0.0f, 2.242f, 3.276f, 4.087f, 7.268f, 4.087f)
                curveToRelative(4.42f, 0.0f, 7.926f, -2.37f, 7.926f, -4.424f)
                curveToRelative(0.0f, -0.738f, -0.637f, -1.339f, -1.673f, -1.652f)
                curveToRelative(-0.394f, -0.113f, -0.536f, -0.171f, -0.767f, -0.417f)
                close()
                moveTo(22.808f, 10.51f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.936f, -0.502f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.693f, -4.924f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.407f, -1.958f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.036f, 7.384f)
                close()
            }
        }
        .build()
        return _weiboLine!!
    }

private var _weiboLine: ImageVector? = null
