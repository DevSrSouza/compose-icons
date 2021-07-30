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

public val SimpleIcons.Shopify: ImageVector
    get() {
        if (_shopify != null) {
            return _shopify!!
        }
        _shopify = Builder(name = "Shopify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.337f, 23.979f)
                lineToRelative(7.216f, -1.561f)
                reflectiveCurveToRelative(-2.604f, -17.613f, -2.625f, -17.73f)
                curveToRelative(-0.018f, -0.116f, -0.114f, -0.192f, -0.211f, -0.192f)
                reflectiveCurveToRelative(-1.929f, -0.136f, -1.929f, -0.136f)
                reflectiveCurveToRelative(-1.275f, -1.274f, -1.439f, -1.411f)
                curveToRelative(-0.045f, -0.037f, -0.075f, -0.057f, -0.121f, -0.074f)
                lineToRelative(-0.914f, 21.104f)
                horizontalLineToRelative(0.023f)
                close()
                moveTo(11.71f, 11.305f)
                reflectiveCurveToRelative(-0.81f, -0.424f, -1.774f, -0.424f)
                curveToRelative(-1.447f, 0.0f, -1.504f, 0.906f, -1.504f, 1.141f)
                curveToRelative(0.0f, 1.232f, 3.24f, 1.715f, 3.24f, 4.629f)
                curveToRelative(0.0f, 2.295f, -1.44f, 3.76f, -3.406f, 3.76f)
                curveToRelative(-2.354f, 0.0f, -3.54f, -1.465f, -3.54f, -1.465f)
                lineToRelative(0.646f, -2.086f)
                reflectiveCurveToRelative(1.245f, 1.066f, 2.28f, 1.066f)
                curveToRelative(0.675f, 0.0f, 0.975f, -0.545f, 0.975f, -0.932f)
                curveToRelative(0.0f, -1.619f, -2.654f, -1.694f, -2.654f, -4.359f)
                curveToRelative(-0.034f, -2.237f, 1.571f, -4.416f, 4.827f, -4.416f)
                curveToRelative(1.257f, 0.0f, 1.875f, 0.361f, 1.875f, 0.361f)
                lineToRelative(-0.945f, 2.715f)
                lineToRelative(-0.02f, 0.01f)
                close()
                moveTo(11.17f, 0.83f)
                curveToRelative(0.136f, 0.0f, 0.271f, 0.038f, 0.405f, 0.135f)
                curveToRelative(-0.984f, 0.465f, -2.064f, 1.639f, -2.508f, 3.992f)
                curveToRelative(-0.656f, 0.213f, -1.293f, 0.405f, -1.889f, 0.578f)
                curveTo(7.697f, 3.75f, 8.951f, 0.84f, 11.17f, 0.84f)
                lineTo(11.17f, 0.83f)
                close()
                moveTo(12.405f, 3.779f)
                verticalLineToRelative(0.135f)
                curveToRelative(-0.754f, 0.232f, -1.583f, 0.484f, -2.394f, 0.736f)
                curveToRelative(0.466f, -1.777f, 1.333f, -2.645f, 2.085f, -2.971f)
                curveToRelative(0.193f, 0.501f, 0.309f, 1.176f, 0.309f, 2.1f)
                close()
                moveTo(12.944f, 1.545f)
                curveToRelative(0.694f, 0.074f, 1.141f, 0.867f, 1.429f, 1.755f)
                curveToRelative(-0.349f, 0.114f, -0.735f, 0.231f, -1.158f, 0.366f)
                verticalLineToRelative(-0.252f)
                curveToRelative(0.0f, -0.752f, -0.096f, -1.371f, -0.271f, -1.871f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(15.936f, 2.834f)
                curveToRelative(-0.02f, 0.0f, -0.06f, 0.021f, -0.078f, 0.021f)
                reflectiveCurveToRelative(-0.289f, 0.075f, -0.714f, 0.21f)
                curveToRelative(-0.423f, -1.233f, -1.176f, -2.37f, -2.508f, -2.37f)
                horizontalLineToRelative(-0.115f)
                curveTo(12.135f, 0.209f, 11.669f, 0.0f, 11.265f, 0.0f)
                curveTo(8.159f, 0.0f, 6.675f, 3.877f, 6.21f, 5.846f)
                curveToRelative(-1.194f, 0.365f, -2.063f, 0.636f, -2.16f, 0.674f)
                curveToRelative(-0.675f, 0.213f, -0.694f, 0.232f, -0.772f, 0.87f)
                curveToRelative(-0.075f, 0.462f, -1.83f, 14.063f, -1.83f, 14.063f)
                lineTo(15.009f, 24.0f)
                lineToRelative(0.927f, -21.166f)
                close()
            }
        }
        .build()
        return _shopify!!
    }

private var _shopify: ImageVector? = null
