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

public val SimpleIcons.Junit5: ImageVector
    get() {
        if (_junit5 != null) {
            return _junit5!!
        }
        _junit5 = Builder(name = "Junit5", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.886f, 9.769f)
                curveToRelative(1.647f, 0.0f, 2.95f, 0.436f, 3.912f, 1.307f)
                curveToRelative(0.961f, 0.872f, 1.442f, 2.06f, 1.442f, 3.566f)
                curveToRelative(0.0f, 1.744f, -0.548f, 3.107f, -1.643f, 4.09f)
                curveToRelative(-1.088f, 0.977f, -2.638f, 1.465f, -4.65f, 1.465f)
                curveToRelative(-1.826f, 0.0f, -3.26f, -0.294f, -4.303f, -0.883f)
                verticalLineToRelative(-2.38f)
                arcToRelative(7.89f, 7.89f, 0.0f, false, false, 2.079f, 0.793f)
                curveToRelative(0.782f, 0.186f, 1.509f, 0.28f, 2.18f, 0.28f)
                curveToRelative(1.184f, 0.0f, 2.086f, -0.265f, 2.704f, -0.794f)
                curveToRelative(0.619f, -0.53f, 0.928f, -1.304f, 0.928f, -2.325f)
                curveToRelative(0.0f, -1.952f, -1.245f, -2.929f, -3.733f, -2.929f)
                curveToRelative(-0.35f, 0.0f, -0.783f, 0.038f, -1.297f, 0.112f)
                curveToRelative(-0.514f, 0.067f, -0.965f, 0.145f, -1.352f, 0.235f)
                lineToRelative(-1.174f, -0.693f)
                lineToRelative(0.626f, -7.98f)
                lineTo(16.1f, 3.633f)
                verticalLineToRelative(2.335f)
                lineTo(9.919f, 5.968f)
                lineToRelative(-0.37f, 4.046f)
                curveToRelative(0.262f, -0.044f, 0.578f, -0.096f, 0.95f, -0.156f)
                curveToRelative(0.38f, -0.06f, 0.843f, -0.09f, 1.387f, -0.09f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                arcToRelative(11.998f, 11.998f, 0.0f, false, false, 6.65f, 10.738f)
                verticalLineToRelative(-3.675f)
                horizontalLineToRelative(0.138f)
                curveToRelative(0.01f, 0.004f, 4.86f, 2.466f, 8.021f, 0.0f)
                curveToRelative(3.163f, -2.468f, 1.62f, -5.785f, 1.08f, -6.557f)
                curveToRelative(-0.54f, -0.771f, -3.317f, -2.083f, -5.708f, -1.851f)
                curveToRelative(-2.391f, 0.231f, -2.391f, 0.308f, -2.391f, 0.308f)
                lineToRelative(0.617f, -7.096f)
                lineToRelative(7.687f, -0.074f)
                lineTo(16.094f, 0.744f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 11.999f, 0.0f)
                close()
                moveTo(16.095f, 0.744f)
                lineTo(16.095f, 3.793f)
                lineToRelative(-7.688f, 0.074f)
                lineToRelative(-0.617f, 7.096f)
                reflectiveCurveToRelative(0.0f, -0.077f, 2.391f, -0.308f)
                curveToRelative(2.392f, -0.232f, 5.169f, 1.08f, 5.708f, 1.851f)
                curveToRelative(0.54f, 0.772f, 2.083f, 4.089f, -1.08f, 6.557f)
                curveToRelative(-3.16f, 2.467f, -8.013f, 0.004f, -8.02f, 0.0f)
                horizontalLineToRelative(-0.14f)
                verticalLineToRelative(3.675f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                arcTo(12.007f, 12.007f, 0.0f, false, false, 16.35f, 0.83f)
                curveToRelative(-0.085f, -0.03f, -0.17f, -0.059f, -0.255f, -0.086f)
                close()
                moveTo(6.299f, 22.556f)
                close()
            }
        }
        .build()
        return _junit5!!
    }

private var _junit5: ImageVector? = null
