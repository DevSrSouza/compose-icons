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

public val SimpleIcons.Radiopublic: ImageVector
    get() {
        if (_radiopublic != null) {
            return _radiopublic!!
        }
        _radiopublic = Builder(name = "Radiopublic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.793f, 4.0692f)
                curveToRelative(3.0122f, -0.2832f, 6.0245f, -1.9773f, 9.037f, -0.5353f)
                verticalLineToRelative(19.892f)
                curveToRelative(-4.1555f, -1.9892f, -8.3106f, 1.989f, -12.4656f, 0.0f)
                lineToRelative(-2.0E-4f, -3.1517f)
                verticalLineToRelative(-0.3473f)
                curveToRelative(-3.0646f, 0.271f, -6.1294f, 1.988f, -9.1941f, 0.5392f)
                lineTo(1.1701f, 0.5742f)
                curveToRelative(4.2077f, 1.989f, 8.4155f, -1.989f, 12.6229f, 0.0f)
                close()
                moveTo(16.0879f, 14.868f)
                curveToRelative(0.3625f, -0.0852f, 0.725f, -0.1737f, 1.0875f, -0.2584f)
                curveToRelative(1.6054f, -0.3793f, 2.2448f, -1.403f, 2.244f, -3.015f)
                lineTo(19.4194f, 8.9974f)
                curveToRelative(4.0E-4f, -1.5849f, -0.4136f, -2.591f, -2.3648f, -2.1348f)
                curveToRelative(-1.0875f, 0.2563f, -2.1747f, 0.5422f, -3.2626f, 0.6441f)
                verticalLineToRelative(12.9706f)
                curveToRelative(0.7652f, -0.0717f, 1.5303f, -0.2347f, 2.2959f, -0.414f)
                close()
                moveTo(16.0879f, 12.7585f)
                lineTo(16.0879f, 9.0973f)
                curveToRelative(0.1435f, -0.0335f, 0.2875f, -0.068f, 0.431f, -0.1023f)
                curveToRelative(0.5373f, -0.1282f, 0.5864f, 0.1568f, 0.5876f, 0.6274f)
                curveToRelative(-4.0E-4f, 0.7207f, -4.0E-4f, 1.441f, 0.0f, 2.1618f)
                curveToRelative(-4.0E-4f, 0.401f, -0.0507f, 0.7437f, -0.5876f, 0.872f)
                arcToRelative(82.0824f, 82.0824f, 0.0f, false, true, -0.431f, 0.1023f)
                close()
                moveTo(6.9399f, 17.1091f)
                verticalLineToRelative(-5.5437f)
                curveToRelative(0.1609f, -0.0373f, 0.3223f, -0.0754f, 0.4833f, -0.1134f)
                curveToRelative(0.4667f, -0.1102f, 0.6033f, 0.0151f, 0.6041f, 0.6253f)
                verticalLineToRelative(3.7832f)
                curveToRelative(9.0E-4f, 0.5754f, 0.0872f, 0.8338f, 0.2072f, 0.9464f)
                curveToRelative(0.7656f, -0.1732f, 1.5304f, -0.3227f, 2.2955f, -0.3772f)
                verticalLineToRelative(-0.0872f)
                curveToRelative(-0.0855f, -0.1507f, -0.1902f, -0.3854f, -0.1893f, -0.9435f)
                verticalLineToRelative(-4.4106f)
                curveToRelative(8.0E-4f, -0.9632f, -0.622f, -1.3306f, -0.9842f, -1.401f)
                curveToRelative(0.4303f, -0.2724f, 1.019f, -0.8019f, 1.0182f, -1.8793f)
                lineTo(10.3747f, 5.6334f)
                curveToRelative(0.0f, -1.3907f, -0.7072f, -2.1254f, -2.1057f, -1.8048f)
                curveToRelative(-1.208f, 0.2724f, -2.4167f, 0.6057f, -3.625f, 0.7183f)
                verticalLineToRelative(12.9705f)
                curveToRelative(0.7655f, -0.0712f, 1.5307f, -0.2313f, 2.2958f, -0.4083f)
                close()
                moveTo(6.9399f, 9.4211f)
                lineTo(6.9399f, 6.1437f)
                arcToRelative(73.198f, 73.198f, 0.0f, false, false, 0.5177f, -0.1217f)
                curveToRelative(0.466f, -0.1101f, 0.5693f, 0.041f, 0.5697f, 0.5988f)
                verticalLineToRelative(1.761f)
                curveToRelative(0.0f, 0.6101f, -0.1715f, 0.8239f, -0.6386f, 0.934f)
                curveToRelative(-0.1496f, 0.0353f, -0.2993f, 0.071f, -0.4489f, 0.1053f)
                close()
            }
        }
        .build()
        return _radiopublic!!
    }

private var _radiopublic: ImageVector? = null
