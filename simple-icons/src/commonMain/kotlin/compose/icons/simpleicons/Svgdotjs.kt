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

public val SimpleIcons.Svgdotjs: ImageVector
    get() {
        if (_svgdotjs != null) {
            return _svgdotjs!!
        }
        _svgdotjs = Builder(name = "Svgdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                lineTo(12.0f, 0.0f)
                lineTo(0.0f, 12.0f)
                lineToRelative(12.0f, 12.0f)
                lineToRelative(12.0f, -12.0f)
                close()
                moveTo(5.431f, 11.446f)
                lineTo(10.096f, 6.781f)
                curveToRelative(0.335f, -0.601f, 0.841f, -1.258f, 1.565f, -1.982f)
                arcToRelative(0.4798f, 0.4798f, 0.0f, false, true, 0.678f, 0.0f)
                curveToRelative(0.187f, 0.187f, 0.187f, 0.491f, 0.0f, 0.678f)
                curveToRelative(-1.254f, 1.254f, -1.786f, 2.24f, -1.836f, 3.093f)
                curveToRelative(-0.035f, 0.59f, 0.174f, 1.1f, 0.49f, 1.573f)
                curveToRelative(0.36f, 0.536f, 0.854f, 1.026f, 1.346f, 1.518f)
                curveToRelative(1.13f, 1.13f, 2.206f, 2.289f, 2.116f, 3.826f)
                curveToRelative(-0.015f, 0.256f, -0.063f, 0.525f, -0.149f, 0.808f)
                lineToRelative(4.002f, -4.002f)
                arcToRelative(0.6147f, 0.6147f, 0.0f, false, true, -0.073f, -0.293f)
                curveToRelative(0.0f, -0.346f, 0.281f, -0.627f, 0.627f, -0.627f)
                reflectiveCurveToRelative(0.627f, 0.281f, 0.627f, 0.627f)
                reflectiveCurveToRelative(-0.281f, 0.627f, -0.627f, 0.627f)
                arcToRelative(0.6147f, 0.6147f, 0.0f, false, true, -0.293f, -0.073f)
                lineToRelative(-4.665f, 4.665f)
                curveToRelative(-0.335f, 0.601f, -0.841f, 1.258f, -1.565f, 1.982f)
                arcToRelative(0.4798f, 0.4798f, 0.0f, false, true, -0.678f, 0.0f)
                arcToRelative(0.4798f, 0.4798f, 0.0f, false, true, 0.0f, -0.678f)
                curveToRelative(1.254f, -1.254f, 1.786f, -2.24f, 1.836f, -3.093f)
                curveToRelative(0.035f, -0.59f, -0.174f, -1.1f, -0.49f, -1.573f)
                curveToRelative(-0.36f, -0.536f, -0.854f, -1.026f, -1.346f, -1.518f)
                curveToRelative(-1.13f, -1.13f, -2.206f, -2.289f, -2.116f, -3.826f)
                curveToRelative(0.015f, -0.256f, 0.063f, -0.525f, 0.149f, -0.808f)
                lineToRelative(-4.002f, 4.002f)
                curveToRelative(0.047f, 0.087f, 0.073f, 0.187f, 0.073f, 0.293f)
                curveToRelative(0.0f, 0.346f, -0.281f, 0.627f, -0.627f, 0.627f)
                arcTo(0.6274f, 0.6274f, 0.0f, false, true, 4.511f, 12.0f)
                curveToRelative(0.0f, -0.346f, 0.281f, -0.627f, 0.627f, -0.627f)
                curveToRelative(0.106f, 0.0f, 0.206f, 0.026f, 0.293f, 0.073f)
                close()
                moveTo(5.138f, 11.742f)
                curveToRelative(0.143f, 0.0f, 0.258f, 0.115f, 0.258f, 0.258f)
                curveToRelative(0.0f, 0.143f, -0.115f, 0.258f, -0.258f, 0.258f)
                arcTo(0.2573f, 0.2573f, 0.0f, false, true, 4.88f, 12.0f)
                curveToRelative(0.0f, -0.143f, 0.115f, -0.258f, 0.258f, -0.258f)
                close()
                moveTo(18.862f, 11.742f)
                curveToRelative(0.143f, 0.0f, 0.258f, 0.115f, 0.258f, 0.258f)
                curveToRelative(0.0f, 0.143f, -0.115f, 0.258f, -0.258f, 0.258f)
                arcToRelative(0.2573f, 0.2573f, 0.0f, false, true, -0.258f, -0.258f)
                curveToRelative(0.0f, -0.143f, 0.115f, -0.258f, 0.258f, -0.258f)
                close()
            }
        }
        .build()
        return _svgdotjs!!
    }

private var _svgdotjs: ImageVector? = null
