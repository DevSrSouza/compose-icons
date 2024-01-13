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

public val SimpleIcons.Monzo: ImageVector
    get() {
        if (_monzo != null) {
            return _monzo!!
        }
        _monzo = Builder(name = "Monzo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.244f, 1.174f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, false, -0.271f, 0.13f)
                lineToRelative(-3.97f, 3.97f)
                lineToRelative(-0.001f, 0.001f)
                curveToRelative(3.884f, 3.882f, 8.093f, 8.092f, 11.748f, 11.748f)
                verticalLineToRelative(-8.57f)
                lineTo(4.602f, 1.305f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, false, -0.358f, -0.131f)
                close()
                moveTo(19.727f, 1.174f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, false, -0.329f, 0.13f)
                lineTo(12.25f, 8.456f)
                verticalLineToRelative(8.568f)
                lineTo(24.0f, 5.275f)
                curveToRelative(-1.316f, -1.322f, -2.647f, -2.648f, -3.97f, -3.97f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, false, -0.301f, -0.131f)
                close()
                moveTo(0.0f, 5.979f)
                lineToRelative(0.002f, 10.955f)
                curveToRelative(0.0f, 0.294f, 0.118f, 0.577f, 0.326f, 0.785f)
                lineToRelative(4.973f, 4.976f)
                curveToRelative(0.28f, 0.282f, 0.76f, 0.083f, 0.758f, -0.314f)
                lineTo(6.059f, 12.037f)
                close()
                moveTo(23.998f, 5.982f)
                lineToRelative(-6.06f, 6.061f)
                verticalLineToRelative(10.338f)
                curveToRelative(-0.004f, 0.399f, 0.48f, 0.6f, 0.76f, 0.314f)
                lineToRelative(4.974f, -4.976f)
                curveToRelative(0.208f, -0.208f, 0.326f, -0.49f, 0.326f, -0.785f)
                close()
            }
        }
        .build()
        return _monzo!!
    }

private var _monzo: ImageVector? = null
