package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Themeco: ImageVector
    get() {
        if (_themeco != null) {
            return _themeco!!
        }
        _themeco = Builder(name = "Themeco", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.84f, 2.998f)
                curveTo(15.354f, 3.001f, 14.87f, 3.114f, 14.475f, 3.336f)
                lineTo(5.391f, 8.441f)
                curveTo(4.585f, 8.893f, 4.0f, 9.883f, 4.0f, 10.795f)
                lineTo(4.0f, 21.145f)
                curveTo(4.0f, 22.051f, 4.582f, 23.04f, 5.383f, 23.496f)
                lineTo(14.473f, 28.66f)
                curveTo(14.874f, 28.888f, 15.364f, 29.002f, 15.857f, 29.002f)
                curveTo(16.337f, 29.002f, 16.818f, 28.894f, 17.211f, 28.678f)
                lineTo(26.604f, 23.494f)
                curveTo(27.413f, 23.041f, 28.0f, 22.054f, 28.0f, 21.145f)
                lineTo(28.0f, 10.795f)
                curveTo(28.0f, 9.877f, 27.409f, 8.888f, 26.596f, 8.445f)
                lineTo(17.207f, 3.318f)
                curveTo(16.81f, 3.102f, 16.325f, 2.995f, 15.84f, 2.998f)
                close()
                moveTo(15.859f, 5.0f)
                curveTo(16.009f, 5.0f, 16.158f, 5.023f, 16.25f, 5.074f)
                lineTo(25.639f, 10.203f)
                curveTo(25.804f, 10.293f, 26.0f, 10.614f, 26.0f, 10.795f)
                lineTo(26.0f, 21.145f)
                curveTo(26.0f, 21.311f, 25.813f, 21.644f, 25.633f, 21.744f)
                lineTo(16.242f, 26.926f)
                curveTo(16.059f, 27.027f, 15.643f, 27.026f, 15.461f, 26.922f)
                lineTo(6.371f, 21.758f)
                curveTo(6.186f, 21.654f, 6.0f, 21.313f, 6.0f, 21.145f)
                lineTo(6.0f, 10.795f)
                curveTo(6.0f, 10.611f, 6.199f, 10.281f, 6.369f, 10.186f)
                lineTo(15.453f, 5.08f)
                curveTo(15.547f, 5.026f, 15.704f, 5.0f, 15.859f, 5.0f)
                close()
                moveTo(21.18f, 13.137f)
                curveTo(17.474f, 13.137f, 17.336f, 18.863f, 21.18f, 18.863f)
                curveTo(24.942f, 18.862f, 24.938f, 13.137f, 21.18f, 13.137f)
                close()
                moveTo(10.59f, 13.238f)
                curveTo(9.727f, 13.238f, 8.863f, 13.246f, 8.0f, 13.246f)
                lineTo(8.0f, 18.738f)
                lineTo(9.035f, 18.738f)
                lineTo(9.035f, 17.121f)
                lineTo(10.59f, 17.121f)
                curveTo(13.28f, 17.121f, 13.273f, 13.238f, 10.59f, 13.238f)
                close()
                moveTo(13.311f, 13.238f)
                lineTo(13.311f, 18.738f)
                lineTo(14.348f, 18.738f)
                lineTo(14.348f, 16.902f)
                lineTo(15.344f, 16.902f)
                lineTo(16.943f, 18.738f)
                lineTo(18.176f, 18.738f)
                lineTo(18.176f, 18.668f)
                lineTo(16.512f, 16.793f)
                curveTo(18.515f, 16.386f, 18.396f, 13.261f, 15.924f, 13.246f)
                curveTo(15.053f, 13.246f, 14.182f, 13.238f, 13.311f, 13.238f)
                close()
                moveTo(21.18f, 14.078f)
                curveTo(23.568f, 14.078f, 23.605f, 17.914f, 21.18f, 17.914f)
                curveTo(18.755f, 17.914f, 18.775f, 14.078f, 21.18f, 14.078f)
                close()
                moveTo(9.002f, 14.123f)
                lineTo(10.752f, 14.123f)
                curveTo(11.899f, 14.123f, 11.895f, 16.227f, 10.752f, 16.227f)
                lineTo(9.002f, 16.227f)
                lineTo(9.002f, 14.123f)
                close()
                moveTo(14.348f, 14.211f)
                lineTo(15.924f, 14.211f)
                curveTo(17.188f, 14.211f, 17.183f, 15.969f, 15.924f, 15.969f)
                lineTo(14.348f, 15.969f)
                lineTo(14.348f, 14.211f)
                close()
            }
        }
        .build()
        return _themeco!!
    }

private var _themeco: ImageVector? = null
