package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dribbble: ImageVector
    get() {
        if (_dribbble != null) {
            return _dribbble!!
        }
        _dribbble = Builder(name = "Dribbble", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.252f, 8.0f, 8.0f, 119.252f, 8.0f, 256.0f)
                reflectiveCurveToRelative(111.252f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.252f, 248.0f, -248.0f)
                reflectiveCurveTo(392.748f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(419.97f, 122.366f)
                curveToRelative(29.503f, 36.046f, 47.369f, 81.957f, 47.835f, 131.955f)
                curveToRelative(-6.984f, -1.477f, -77.018f, -15.682f, -147.502f, -6.818f)
                curveToRelative(-5.752f, -14.041f, -11.181f, -26.393f, -18.617f, -41.614f)
                curveToRelative(78.321f, -31.977f, 113.818f, -77.482f, 118.284f, -83.523f)
                close()
                moveTo(396.421f, 97.87f)
                curveToRelative(-3.81f, 5.427f, -35.697f, 48.286f, -111.021f, 76.519f)
                curveToRelative(-34.712f, -63.776f, -73.185f, -116.168f, -79.04f, -124.008f)
                curveToRelative(67.176f, -16.193f, 137.966f, 1.27f, 190.061f, 47.489f)
                close()
                moveTo(165.941f, 64.62f)
                curveToRelative(5.585f, 7.659f, 43.438f, 60.116f, 78.537f, 122.509f)
                curveToRelative(-99.087f, 26.313f, -186.36f, 25.934f, -195.834f, 25.809f)
                curveTo(62.38f, 147.205f, 106.678f, 92.573f, 165.941f, 64.62f)
                close()
                moveTo(44.17f, 256.323f)
                curveToRelative(0.0f, -2.166f, 0.043f, -4.322f, 0.108f, -6.473f)
                curveToRelative(9.268f, 0.19f, 111.92f, 1.513f, 217.706f, -30.146f)
                curveToRelative(6.064f, 11.868f, 11.857f, 23.915f, 17.174f, 35.949f)
                curveToRelative(-76.599f, 21.575f, -146.194f, 83.527f, -180.531f, 142.306f)
                curveTo(64.794f, 360.405f, 44.17f, 310.73f, 44.17f, 256.323f)
                close()
                moveTo(125.977f, 423.436f)
                curveToRelative(22.127f, -45.233f, 82.178f, -103.622f, 167.579f, -132.756f)
                curveToRelative(29.74f, 77.283f, 42.039f, 142.053f, 45.189f, 160.638f)
                curveToRelative(-68.112f, 29.013f, -150.015f, 21.053f, -212.768f, -27.882f)
                close()
                moveTo(374.357f, 431.925f)
                curveToRelative(-2.171f, -12.886f, -13.446f, -74.897f, -41.152f, -151.033f)
                curveToRelative(66.38f, -10.626f, 124.7f, 6.768f, 131.947f, 9.055f)
                curveToRelative(-9.442f, 58.941f, -43.273f, 109.844f, -90.795f, 141.978f)
                close()
            }
        }
        .build()
        return _dribbble!!
    }

private var _dribbble: ImageVector? = null
