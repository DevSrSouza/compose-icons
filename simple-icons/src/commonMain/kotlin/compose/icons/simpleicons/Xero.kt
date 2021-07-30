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

public val SimpleIcons.Xero: ImageVector
    get() {
        if (_xero != null) {
            return _xero!!
        }
        _xero = Builder(name = "Xero", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(18.585f, 14.655f)
                curveToRelative(-1.485f, 0.0f, -2.69f, -1.206f, -2.69f, -2.689f)
                curveToRelative(0.0f, -1.485f, 1.207f, -2.691f, 2.69f, -2.691f)
                curveToRelative(1.485f, 0.0f, 2.69f, 1.207f, 2.69f, 2.691f)
                reflectiveCurveToRelative(-1.207f, 2.689f, -2.69f, 2.689f)
                close()
                moveTo(7.53f, 14.644f)
                curveToRelative(-0.099f, 0.0f, -0.192f, -0.041f, -0.267f, -0.116f)
                lineToRelative(-2.043f, -2.04f)
                lineToRelative(-2.052f, 2.047f)
                curveToRelative(-0.069f, 0.068f, -0.16f, 0.108f, -0.258f, 0.108f)
                curveToRelative(-0.202f, 0.0f, -0.368f, -0.166f, -0.368f, -0.368f)
                curveToRelative(0.0f, -0.099f, 0.04f, -0.191f, 0.111f, -0.263f)
                lineToRelative(2.04f, -2.05f)
                lineToRelative(-2.038f, -2.047f)
                curveToRelative(-0.075f, -0.069f, -0.113f, -0.162f, -0.113f, -0.261f)
                curveToRelative(0.0f, -0.203f, 0.166f, -0.366f, 0.368f, -0.366f)
                curveToRelative(0.098f, 0.0f, 0.188f, 0.037f, 0.258f, 0.105f)
                lineToRelative(2.055f, 2.048f)
                lineToRelative(2.048f, -2.045f)
                curveToRelative(0.069f, -0.071f, 0.162f, -0.108f, 0.26f, -0.108f)
                curveToRelative(0.211f, 0.0f, 0.375f, 0.165f, 0.375f, 0.366f)
                curveToRelative(0.0f, 0.098f, -0.029f, 0.188f, -0.104f, 0.258f)
                lineToRelative(-2.056f, 2.055f)
                lineToRelative(2.055f, 2.051f)
                curveToRelative(0.068f, 0.069f, 0.104f, 0.16f, 0.104f, 0.258f)
                curveToRelative(0.0f, 0.202f, -0.165f, 0.368f, -0.365f, 0.368f)
                horizontalLineToRelative(-0.01f)
                close()
                moveTo(15.547f, 10.053f)
                curveToRelative(-0.796f, 0.101f, -0.882f, 0.476f, -0.882f, 1.404f)
                verticalLineToRelative(2.787f)
                curveToRelative(0.0f, 0.202f, -0.165f, 0.366f, -0.366f, 0.366f)
                curveToRelative(-0.203f, 0.0f, -0.367f, -0.165f, -0.368f, -0.366f)
                verticalLineToRelative(-4.53f)
                curveToRelative(0.0f, -0.204f, 0.16f, -0.366f, 0.362f, -0.366f)
                curveToRelative(0.166f, 0.0f, 0.316f, 0.125f, 0.346f, 0.289f)
                curveToRelative(0.27f, -0.209f, 0.6f, -0.317f, 0.93f, -0.317f)
                horizontalLineToRelative(0.105f)
                curveToRelative(0.195f, 0.0f, 0.359f, 0.165f, 0.359f, 0.368f)
                curveToRelative(0.0f, 0.201f, -0.164f, 0.352f, -0.375f, 0.359f)
                curveToRelative(0.0f, 0.0f, -0.09f, 0.0f, -0.164f, 0.008f)
                lineToRelative(0.053f, -0.002f)
                close()
                moveTo(12.456f, 12.258f)
                lineTo(8.625f, 12.258f)
                curveToRelative(0.0f, 0.019f, 0.003f, 0.037f, 0.006f, 0.057f)
                curveToRelative(0.02f, 0.105f, 0.045f, 0.211f, 0.083f, 0.31f)
                curveToRelative(0.194f, 0.531f, 0.765f, 1.275f, 1.829f, 1.29f)
                curveToRelative(0.33f, -0.003f, 0.631f, -0.086f, 0.9f, -0.229f)
                curveToRelative(0.21f, -0.12f, 0.391f, -0.271f, 0.525f, -0.428f)
                curveToRelative(0.045f, -0.058f, 0.09f, -0.112f, 0.12f, -0.168f)
                curveToRelative(0.18f, -0.229f, 0.405f, -0.186f, 0.54f, -0.083f)
                curveToRelative(0.164f, 0.135f, 0.18f, 0.391f, 0.045f, 0.57f)
                lineToRelative(-0.016f, 0.016f)
                curveToRelative(-0.21f, 0.27f, -0.435f, 0.495f, -0.689f, 0.66f)
                curveToRelative(-0.255f, 0.164f, -0.525f, 0.284f, -0.811f, 0.345f)
                curveToRelative(-0.33f, 0.09f, -0.645f, 0.104f, -0.975f, 0.06f)
                curveToRelative(-1.095f, -0.135f, -2.01f, -0.93f, -2.28f, -2.01f)
                curveToRelative(-0.06f, -0.21f, -0.09f, -0.42f, -0.09f, -0.645f)
                curveToRelative(0.0f, -0.855f, 0.421f, -1.695f, 1.125f, -2.205f)
                curveToRelative(0.885f, -0.615f, 2.085f, -0.66f, 3.0f, -0.075f)
                curveToRelative(0.63f, 0.405f, 1.035f, 1.021f, 1.185f, 1.771f)
                curveToRelative(0.075f, 0.419f, -0.21f, 0.794f, -0.734f, 0.81f)
                lineToRelative(0.068f, -0.046f)
                close()
                moveTo(18.585f, 10.035f)
                curveToRelative(-1.064f, 0.0f, -1.931f, 0.865f, -1.931f, 1.931f)
                curveToRelative(0.0f, 1.064f, 0.866f, 1.931f, 1.931f, 1.931f)
                reflectiveCurveToRelative(1.931f, -0.867f, 1.931f, -1.931f)
                curveToRelative(0.0f, -1.065f, -0.866f, -1.933f, -1.931f, -1.933f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(18.585f, 12.63f)
                curveToRelative(-0.367f, 0.0f, -0.666f, -0.297f, -0.666f, -0.666f)
                curveToRelative(0.0f, -0.367f, 0.3f, -0.665f, 0.666f, -0.665f)
                curveToRelative(0.367f, 0.0f, 0.667f, 0.299f, 0.667f, 0.665f)
                curveToRelative(0.0f, 0.369f, -0.3f, 0.667f, -0.667f, 0.666f)
                close()
                moveTo(10.545f, 10.027f)
                curveToRelative(-0.91f, 0.0f, -1.672f, 0.623f, -1.886f, 1.466f)
                verticalLineToRelative(0.03f)
                horizontalLineToRelative(3.776f)
                curveToRelative(-0.203f, -0.855f, -0.973f, -1.494f, -1.891f, -1.494f)
                verticalLineToRelative(-0.002f)
                close()
            }
        }
        .build()
        return _xero!!
    }

private var _xero: ImageVector? = null
