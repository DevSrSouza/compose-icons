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

public val SimpleIcons.Tampermonkey: ImageVector
    get() {
        if (_tampermonkey != null) {
            return _tampermonkey!!
        }
        _tampermonkey = Builder(name = "Tampermonkey", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.955f, 0.002f)
                curveTo(3.0f, -0.071f, 0.275f, 2.386f, 0.043f, 5.335f)
                curveToRelative(-0.069f, 3.32f, -0.011f, 6.646f, -0.03f, 9.969f)
                curveToRelative(0.06f, 1.87f, -0.276f, 3.873f, 0.715f, 5.573f)
                curveToRelative(1.083f, 2.076f, 3.456f, 3.288f, 5.77f, 3.105f)
                curveToRelative(4.003f, -0.011f, 8.008f, 0.022f, 12.011f, -0.017f)
                curveToRelative(2.953f, -0.156f, 5.478f, -2.815f, 5.482f, -5.772f)
                curveToRelative(-0.007f, -4.235f, 0.023f, -8.473f, -0.015f, -12.708f)
                curveTo(23.82f, 2.533f, 21.16f, 0.007f, 18.205f, 0.003f)
                curveToRelative(-4.083f, -0.005f, -8.167f, 0.0f, -12.25f, -0.002f)
                close()
                moveTo(6.402f, 12.685f)
                curveToRelative(2.333f, -0.046f, 4.506f, 1.805f, 4.83f, 4.116f)
                curveToRelative(0.412f, 2.287f, -1.056f, 4.716f, -3.274f, 5.411f)
                curveToRelative(-2.187f, 0.783f, -4.825f, -0.268f, -5.874f, -2.341f)
                curveToRelative(-1.137f, -2.039f, -0.52f, -4.827f, 1.37f, -6.197f)
                arcToRelative(4.896f, 4.896f, 0.0f, false, true, 2.948f, -0.99f)
                close()
                moveTo(17.647f, 12.685f)
                curveToRelative(2.333f, -0.046f, 4.505f, 1.805f, 4.829f, 4.116f)
                curveToRelative(0.413f, 2.287f, -1.056f, 4.716f, -3.273f, 5.411f)
                curveToRelative(-2.188f, 0.783f, -4.825f, -0.268f, -5.875f, -2.341f)
                curveToRelative(-1.136f, -2.039f, -0.52f, -4.827f, 1.37f, -6.197f)
                arcToRelative(4.896f, 4.896f, 0.0f, false, true, 2.949f, -0.99f)
                close()
            }
        }
        .build()
        return _tampermonkey!!
    }

private var _tampermonkey: ImageVector? = null
