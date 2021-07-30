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

public val SimpleIcons.Nfc: ImageVector
    get() {
        if (_nfc != null) {
            return _nfc!!
        }
        _nfc = Builder(name = "Nfc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.958f, 1.98f)
                curveTo(23.895f, 1.0f, 23.143f, 0.256f, 22.145f, 0.197f)
                curveToRelative(-1.102f, -0.066f, -4.668f, -0.12f, -5.693f, -0.12f)
                curveToRelative(1.832f, 1.264f, 2.082f, 3.644f, 2.255f, 8.066f)
                curveToRelative(0.101f, 2.62f, 0.01f, 11.799f, 0.002f, 12.188f)
                lineToRelative(-0.049f, 2.504f)
                lineToRelative(-9.628f, -9.63f)
                verticalLineToRelative(-3.014f)
                lineToRelative(7.656f, 7.658f)
                curveToRelative(0.02f, -1.516f, 0.04f, -3.492f, 0.04f, -5.299f)
                curveToRelative(0.0f, -1.76f, -0.026f, -3.354f, -0.076f, -4.193f)
                curveToRelative(-0.288f, -4.819f, -0.737f, -7.077f, -3.253f, -7.962f)
                curveToRelative(-0.77f, -0.27f, -1.487f, -0.335f, -2.683f, -0.351f)
                curveTo(9.728f, 0.032f, 2.848f, 0.037f, 1.854f, 0.091f)
                curveTo(0.8f, 0.147f, 0.09f, 0.914f, 0.042f, 1.9f)
                curveToRelative(-0.048f, 0.977f, -0.064f, 19.174f, 0.0f, 20.165f)
                curveToRelative(0.062f, 0.98f, 0.815f, 1.724f, 1.812f, 1.782f)
                curveToRelative(1.102f, 0.067f, 4.668f, 0.075f, 5.694f, 0.075f)
                curveToRelative(-1.832f, -1.264f, -2.083f, -3.643f, -2.255f, -8.066f)
                curveToRelative(-0.1f, -2.62f, -0.009f, -11.8f, 0.0f, -12.188f)
                lineToRelative(0.047f, -2.504f)
                lineToRelative(9.629f, 9.63f)
                verticalLineToRelative(3.013f)
                lineTo(7.312f, 6.152f)
                curveToRelative(-0.02f, 1.514f, -0.04f, 3.49f, -0.04f, 5.298f)
                curveToRelative(0.0f, 1.76f, 0.026f, 3.354f, 0.077f, 4.192f)
                curveToRelative(0.288f, 4.82f, 0.736f, 7.077f, 3.252f, 7.962f)
                curveToRelative(0.77f, 0.271f, 1.487f, 0.337f, 2.683f, 0.352f)
                curveToRelative(0.987f, 0.012f, 7.868f, 0.006f, 8.861f, -0.047f)
                curveToRelative(1.056f, -0.056f, 1.765f, -0.822f, 1.813f, -1.811f)
                curveToRelative(0.048f, -0.976f, 0.064f, -19.127f, 0.0f, -20.118f)
            }
        }
        .build()
        return _nfc!!
    }

private var _nfc: ImageVector? = null
