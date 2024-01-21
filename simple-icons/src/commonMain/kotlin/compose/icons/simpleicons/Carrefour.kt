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

public val SimpleIcons.Carrefour: ImageVector
    get() {
        if (_carrefour != null) {
            return _carrefour!!
        }
        _carrefour = Builder(name = "Carrefour", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.14f, 4.045f)
                curveToRelative(-2.569f, 0.0f, -3.572f, 3.64f, -3.572f, 7.979f)
                curveToRelative(0.0f, 4.34f, 1.003f, 7.931f, 3.572f, 7.931f)
                curveToRelative(1.541f, 0.0f, 2.855f, -0.903f, 2.86f, -1.645f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.199f, -0.453f)
                curveToRelative(-0.73f, -0.706f, -1.016f, -1.412f, -1.018f, -2.034f)
                curveToRelative(-0.005f, -1.189f, 1.026f, -2.074f, 1.977f, -2.074f)
                curveToRelative(1.306f, 0.0f, 2.077f, 1.027f, 2.077f, 2.357f)
                curveToRelative(0.0f, 1.26f, -0.537f, 2.31f, -1.121f, 3.15f)
                arcToRelative(0.193f, 0.193f, 0.0f, false, false, -0.034f, 0.107f)
                curveToRelative(0.0f, 0.065f, 0.04f, 0.12f, 0.098f, 0.12f)
                curveToRelative(0.035f, 0.0f, 0.076f, -0.02f, 0.122f, -0.065f)
                lineToRelative(6.561f, -6.344f)
                curveToRelative(0.328f, -0.28f, 0.537f, -0.608f, 0.537f, -1.073f)
                curveToRelative(0.0f, -0.468f, -0.21f, -0.794f, -0.537f, -1.073f)
                lineToRelative(-6.561f, -6.346f)
                curveToRelative(-0.045f, -0.045f, -0.087f, -0.064f, -0.122f, -0.064f)
                curveToRelative(-0.059f, 0.0f, -0.097f, 0.055f, -0.098f, 0.12f)
                curveToRelative(0.0f, 0.035f, 0.01f, 0.073f, 0.034f, 0.107f)
                curveToRelative(0.584f, 0.84f, 1.12f, 1.89f, 1.12f, 3.15f)
                curveToRelative(0.0f, 1.329f, -0.77f, 2.356f, -2.076f, 2.356f)
                curveToRelative(-0.95f, 0.0f, -1.982f, -0.884f, -1.977f, -2.073f)
                curveToRelative(0.002f, -0.622f, 0.288f, -1.328f, 1.018f, -2.033f)
                arcTo(0.624f, 0.624f, 0.0f, false, false, 15.0f, 5.69f)
                curveToRelative(-0.004f, -0.743f, -1.319f, -1.646f, -2.86f, -1.646f)
                moveToRelative(-5.043f, 0.537f)
                lineTo(0.537f, 10.93f)
                curveTo(0.209f, 11.207f, 0.0f, 11.534f, 0.0f, 12.0f)
                curveToRelative(0.0f, 0.465f, 0.21f, 0.793f, 0.537f, 1.073f)
                lineToRelative(6.56f, 6.345f)
                curveToRelative(0.042f, 0.043f, 0.083f, 0.06f, 0.117f, 0.06f)
                curveToRelative(0.062f, 0.0f, 0.105f, -0.057f, 0.103f, -0.123f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, -0.057f, -0.123f)
                curveTo(5.72f, 17.32f, 4.6f, 15.126f, 4.6f, 12.024f)
                curveToRelative(0.0f, -3.104f, 1.12f, -5.341f, 2.66f, -7.255f)
                arcToRelative(0.185f, 0.185f, 0.0f, false, false, 0.057f, -0.123f)
                curveToRelative(0.002f, -0.068f, -0.04f, -0.123f, -0.103f, -0.123f)
                curveToRelative(-0.034f, 0.0f, -0.075f, 0.017f, -0.117f, 0.06f)
            }
        }
        .build()
        return _carrefour!!
    }

private var _carrefour: ImageVector? = null
