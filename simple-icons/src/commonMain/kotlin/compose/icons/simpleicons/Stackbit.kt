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

public val SimpleIcons.Stackbit: ImageVector
    get() {
        if (_stackbit != null) {
            return _stackbit!!
        }
        _stackbit = Builder(name = "Stackbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9488f, 2.306f)
                lineTo(1.1706f, 7.9673f)
                curveToRelative(-0.784f, 0.4493f, -1.2385f, 1.3261f, -1.1623f, 2.242f)
                verticalLineToRelative(3.7743f)
                curveToRelative(-0.0664f, 0.9275f, 0.406f, 1.8084f, 1.2066f, 2.2495f)
                lineToRelative(9.7782f, 5.4725f)
                arcToRelative(2.2606f, 2.2606f, 0.0f, false, false, 2.2305f, 0.0f)
                lineToRelative(9.5937f, -5.4725f)
                curveToRelative(0.7883f, -0.45f, 1.2477f, -1.329f, 1.1752f, -2.2495f)
                verticalLineToRelative(-3.7744f)
                curveToRelative(0.0683f, -0.9116f, -0.3846f, -1.7816f, -1.1623f, -2.2325f)
                lineToRelative(-9.5937f, -5.6615f)
                arcTo(2.2646f, 2.2646f, 0.0f, false, false, 12.0845f, 2.0f)
                curveToRelative(-0.3917f, 0.0f, -0.7833f, 0.102f, -1.1357f, 0.306f)
                close()
                moveTo(11.7237f, 16.3426f)
                lineToRelative(-9.7782f, -5.6615f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, true, -0.2884f, -0.2951f)
                curveToRelative(-0.1974f, -0.3648f, -0.0683f, -0.824f, 0.2884f, -1.0259f)
                lineToRelative(9.7782f, -5.6615f)
                arcToRelative(0.7242f, 0.7242f, 0.0f, false, true, 0.738f, 0.0f)
                lineToRelative(9.5936f, 5.6747f)
                curveToRelative(0.353f, 0.2086f, 0.474f, 0.6702f, 0.2703f, 1.0314f)
                curveToRelative(-0.2037f, 0.3612f, -0.6551f, 0.485f, -1.0082f, 0.2764f)
                lineToRelative(-9.2284f, -5.452f)
                lineToRelative(-8.2765f, 4.7915f)
                lineToRelative(8.638f, 5.001f)
                curveToRelative(0.3567f, 0.2053f, 0.483f, 0.6675f, 0.2823f, 1.032f)
                curveToRelative(-0.1361f, 0.2477f, -0.3874f, 0.3868f, -0.6462f, 0.3868f)
                arcToRelative(0.7266f, 0.7266f, 0.0f, false, true, -0.363f, -0.0978f)
                close()
                moveTo(11.7384f, 20.3056f)
                lineTo(1.9602f, 14.833f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, -0.0815f, -0.0457f)
                curveToRelative(-0.3443f, -0.2232f, -0.4465f, -0.6897f, -0.2282f, -1.0419f)
                curveToRelative(0.2178f, -0.352f, 0.6741f, -0.4567f, 1.0182f, -0.2334f)
                lineToRelative(9.4203f, 5.2708f)
                lineToRelative(9.2376f, -5.2708f)
                curveToRelative(0.3566f, -0.2033f, 0.8068f, -0.0723f, 1.0055f, 0.2925f)
                curveToRelative(0.1987f, 0.365f, 0.0706f, 0.8252f, -0.286f, 1.0285f)
                lineToRelative(-9.5937f, 5.4728f)
                arcToRelative(0.7239f, 0.7239f, 0.0f, false, true, -0.714f, 0.0f)
                close()
            }
        }
        .build()
        return _stackbit!!
    }

private var _stackbit: ImageVector? = null
