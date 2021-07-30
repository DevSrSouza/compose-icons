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

public val SimpleIcons.Freecodecamp: ImageVector
    get() {
        if (_freecodecamp != null) {
            return _freecodecamp!!
        }
        _freecodecamp = Builder(name = "Freecodecamp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.885f, 3.906f)
                arcToRelative(0.621f, 0.621f, 0.0f, false, false, -0.354f, 0.12f)
                curveToRelative(-0.08f, 0.08f, -0.161f, 0.196f, -0.161f, 0.313f)
                curveToRelative(0.0f, 0.2f, 0.236f, 0.474f, 0.673f, 0.923f)
                curveToRelative(1.822f, 1.754f, 2.738f, 3.903f, 2.732f, 6.494f)
                curveToRelative(-0.007f, 2.867f, -0.97f, 5.17f, -2.844f, 6.954f)
                curveToRelative(-0.394f, 0.353f, -0.556f, 0.63f, -0.557f, 0.867f)
                curveToRelative(0.0f, 0.116f, 0.08f, 0.237f, 0.16f, 0.353f)
                curveToRelative(0.076f, 0.08f, 0.237f, 0.162f, 0.353f, 0.162f)
                curveToRelative(0.434f, 0.0f, 1.04f, -0.512f, 1.833f, -1.509f)
                curveToRelative(1.542f, -1.89f, 2.24f, -3.978f, 2.279f, -6.824f)
                curveToRelative(0.036f, -2.847f, -0.857f, -4.777f, -2.603f, -6.77f)
                curveToRelative(-0.63f, -0.712f, -1.153f, -1.082f, -1.511f, -1.083f)
                close()
                moveTo(4.116f, 3.908f)
                curveToRelative(-0.358f, 0.0f, -0.882f, 0.37f, -1.51f, 1.083f)
                curveTo(0.858f, 6.984f, -0.035f, 8.914f, 0.001f, 11.761f)
                curveToRelative(0.04f, 2.846f, 0.737f, 4.933f, 2.28f, 6.824f)
                curveToRelative(0.791f, 0.997f, 1.398f, 1.51f, 1.832f, 1.509f)
                arcToRelative(0.573f, 0.573f, 0.0f, false, false, 0.352f, -0.162f)
                curveToRelative(0.08f, -0.116f, 0.16f, -0.237f, 0.16f, -0.353f)
                curveToRelative(0.0f, -0.237f, -0.162f, -0.514f, -0.556f, -0.866f)
                curveToRelative(-1.873f, -1.785f, -2.837f, -4.087f, -2.844f, -6.955f)
                curveToRelative(-0.006f, -2.591f, 0.91f, -4.74f, 2.732f, -6.494f)
                curveToRelative(0.437f, -0.449f, 0.674f, -0.722f, 0.673f, -0.923f)
                curveToRelative(0.0f, -0.117f, -0.08f, -0.233f, -0.161f, -0.313f)
                arcToRelative(0.621f, 0.621f, 0.0f, false, false, -0.354f, -0.12f)
                close()
                moveTo(11.172f, 4.803f)
                reflectiveCurveToRelative(0.655f, 2.081f, -2.649f, 6.727f)
                curveToRelative(-3.156f, 4.433f, 1.045f, 7.15f, 1.432f, 7.386f)
                curveToRelative(-0.281f, -0.18f, -2.001f, -1.5f, 0.402f, -5.423f)
                curveToRelative(0.466f, -0.77f, 1.076f, -1.47f, 1.834f, -3.041f)
                curveToRelative(0.0f, 0.0f, 0.67f, 0.946f, 0.32f, 2.998f)
                curveToRelative(-0.523f, 3.101f, 2.271f, 2.214f, 2.314f, 2.257f)
                curveToRelative(0.976f, 1.15f, -0.808f, 3.17f, -0.917f, 3.233f)
                curveToRelative(-0.108f, 0.061f, 5.096f, -3.13f, 1.399f, -7.935f)
                curveToRelative(-0.253f, 0.253f, -0.582f, 1.442f, -1.267f, 1.266f)
                curveToRelative(-0.684f, -0.174f, 2.125f, -3.494f, -2.868f, -7.468f)
                close()
                moveTo(9.955f, 18.916f)
                curveToRelative(0.023f, 0.016f, 0.038f, 0.024f, 0.038f, 0.024f)
                lineToRelative(-0.038f, -0.024f)
                close()
            }
        }
        .build()
        return _freecodecamp!!
    }

private var _freecodecamp: ImageVector? = null
