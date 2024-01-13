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

public val SimpleIcons.Thunderbird: ImageVector
    get() {
        if (_thunderbird != null) {
            return _thunderbird!!
        }
        _thunderbird = Builder(name = "Thunderbird", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.948f, 4.444f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.92f, 0.788f, -2.126f, 2.55f, -1.817f, 3.499f)
                verticalLineToRelative(0.02f)
                curveTo(9.236f, 7.18f, 10.658f, 6.76f, 12.0f, 6.76f)
                curveToRelative(3.26f, 0.0f, 5.902f, 2.156f, 5.902f, 4.815f)
                curveToRelative(0.0f, 2.66f, -2.643f, 4.816f, -5.902f, 4.816f)
                lineToRelative(-0.083f, -0.002f)
                curveToRelative(-0.155f, -0.006f, -0.354f, -0.013f, -0.435f, 0.118f)
                curveToRelative(-0.096f, 0.156f, 0.116f, 0.397f, 0.238f, 0.536f)
                curveToRelative(1.274f, 1.441f, 3.123f, 1.622f, 3.608f, 1.67f)
                lineToRelative(0.076f, 0.008f)
                curveToRelative(-4.281f, 0.414f, -9.304f, -2.32f, -9.306f, -7.076f)
                curveToRelative(0.0f, -1.12f, 0.414f, -2.073f, 1.075f, -2.83f)
                lineToRelative(-0.005f, -0.002f)
                horizontalLineToRelative(-0.003f)
                curveTo(7.31f, 6.38f, 6.376f, 3.47f, 4.629f, 2.898f)
                curveToRelative(-0.124f, -0.04f, -0.246f, 0.054f, -0.262f, 0.183f)
                curveToRelative(-0.23f, 1.924f, -0.727f, 2.59f, -1.264f, 3.31f)
                curveToRelative(-0.805f, 1.08f, -1.39f, 2.328f, -1.365f, 3.698f)
                arcToRelative(10.99f, 10.99f, 0.0f, false, true, -0.705f, -1.91f)
                curveToRelative(-0.024f, -0.09f, -0.17f, -0.365f, -0.333f, -0.272f)
                curveToRelative(-0.13f, 0.072f, -0.227f, 0.274f, -0.296f, 0.485f)
                arcTo(12.137f, 12.137f, 0.0f, false, false, 0.0f, 11.489f)
                curveToRelative(0.0f, 6.536f, 5.475f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.372f, 12.0f, -12.0f)
                curveToRelative(0.0f, -2.526f, -0.781f, -4.87f, -2.115f, -6.805f)
                lineToRelative(0.167f, -0.002f)
                curveToRelative(0.518f, 0.0f, 1.024f, 0.045f, 1.51f, 0.129f)
                curveToRelative(-0.734f, -0.816f, -1.724f, -1.475f, -2.877f, -1.904f)
                arcToRelative(8.54f, 8.54f, 0.0f, false, true, 2.494f, -0.495f)
                curveToRelative(-1.426f, -1.166f, -3.508f, -1.9f, -5.827f, -1.9f)
                curveToRelative(-3.355f, 0.0f, -6.648f, 1.29f, -7.404f, 3.93f)
                close()
                moveTo(10.63f, 13.61f)
                curveToRelative(-0.87f, -0.905f, -3.473f, -3.91f, -3.473f, -3.91f)
                lineToRelative(0.202f, 0.01f)
                lineToRelative(4.075f, 3.042f)
                curveToRelative(0.305f, 0.223f, 0.74f, 0.22f, 1.043f, -0.004f)
                lineToRelative(3.996f, -3.034f)
                lineToRelative(0.212f, -0.018f)
                reflectiveCurveToRelative(-2.518f, 2.935f, -3.483f, 3.9f)
                curveToRelative(-0.964f, 0.968f, -1.703f, 0.919f, -2.572f, 0.014f)
                close()
                moveTo(13.404f, 3.527f)
                reflectiveCurveToRelative(0.055f, 0.625f, -0.576f, 0.824f)
                curveToRelative(-0.722f, 0.227f, -1.042f, -0.38f, -1.042f, -0.38f)
                reflectiveCurveToRelative(0.09f, -0.417f, 0.676f, -0.61f)
                curveToRelative(0.626f, -0.206f, 0.942f, 0.166f, 0.942f, 0.166f)
                close()
            }
        }
        .build()
        return _thunderbird!!
    }

private var _thunderbird: ImageVector? = null
