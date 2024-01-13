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

public val SimpleIcons.Dunzo: ImageVector
    get() {
        if (_dunzo != null) {
            return _dunzo!!
        }
        _dunzo = Builder(name = "Dunzo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.75f, 0.0f)
                arcTo(2.744f, 2.744f, 0.0f, false, false, 0.0f, 2.75f)
                verticalLineToRelative(18.5f)
                arcTo(2.744f, 2.744f, 0.0f, false, false, 2.75f, 24.0f)
                horizontalLineToRelative(18.5f)
                arcTo(2.744f, 2.744f, 0.0f, false, false, 24.0f, 21.25f)
                lineTo(24.0f, 2.75f)
                arcTo(2.744f, 2.744f, 0.0f, false, false, 21.25f, 0.0f)
                close()
                moveTo(12.652f, 5.506f)
                curveToRelative(0.91f, 0.006f, 1.781f, 0.197f, 2.594f, 0.605f)
                curveToRelative(-0.891f, 1.87f, -1.888f, 3.8f, -2.832f, 5.682f)
                curveToRelative(-0.017f, 0.029f, -0.086f, 0.13f, -0.225f, 0.031f)
                curveToRelative(-0.8f, -0.638f, -1.581f, -1.304f, -2.369f, -1.959f)
                curveToRelative(-0.223f, -0.195f, -0.442f, -0.105f, -0.55f, 0.133f)
                curveToRelative(-0.515f, 1.027f, -0.952f, 1.883f, -1.465f, 2.91f)
                curveToRelative(-0.7f, 1.398f, -1.398f, 2.673f, -2.098f, 4.07f)
                curveToRelative(-0.064f, 0.142f, -0.143f, 0.043f, -0.143f, 0.043f)
                curveToRelative(0.538f, -3.258f, 1.643f, -10.807f, 1.717f, -11.1f)
                curveToRelative(0.055f, -0.213f, 0.183f, -0.36f, 0.42f, -0.394f)
                curveToRelative(0.09f, -0.012f, 0.18f, -0.023f, 0.27f, -0.023f)
                close()
                moveTo(17.78f, 8.0f)
                curveToRelative(0.01f, -0.003f, 0.016f, 0.022f, 0.045f, 0.082f)
                curveToRelative(0.48f, 0.935f, 0.803f, 2.554f, 0.487f, 4.238f)
                curveToRelative(-0.25f, 1.328f, -0.849f, 2.487f, -1.737f, 3.512f)
                arcToRelative(7.715f, 7.715f, 0.0f, false, true, -3.224f, 2.207f)
                curveToRelative(-0.735f, 0.268f, -1.498f, 0.362f, -2.288f, 0.361f)
                lineTo(6.275f, 18.4f)
                curveToRelative(-0.654f, 0.0f, -0.725f, -0.224f, -0.709f, -0.238f)
                arcToRelative(923.24f, 923.24f, 0.0f, false, true, 4.309f, -5.906f)
                curveToRelative(0.235f, -0.258f, 0.417f, -0.022f, 0.668f, 0.224f)
                curveToRelative(1.105f, 0.957f, 2.139f, 1.826f, 2.28f, 1.94f)
                curveToRelative(0.08f, 0.066f, 0.163f, 0.051f, 0.222f, -0.033f)
                arcTo(971.241f, 971.241f, 0.0f, false, true, 17.779f, 8.0f)
                close()
            }
        }
        .build()
        return _dunzo!!
    }

private var _dunzo: ImageVector? = null
