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

public val SimpleIcons.Weblate: ImageVector
    get() {
        if (_weblate != null) {
            return _weblate!!
        }
        _weblate = Builder(name = "Weblate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.662f, 3.809f)
                curveToRelative(-1.875f, 1.19f, -2.81f, 3.515f, -2.83f, 5.795f)
                curveToRelative(-0.014f, 2.628f, 0.666f, 5.258f, 1.988f, 7.305f)
                curveToRelative(0.936f, 1.46f, 2.238f, 2.715f, 3.836f, 3.412f)
                arcToRelative(6.942f, 6.942f, 0.0f, false, false, 5.647f, -0.07f)
                curveToRelative(1.997f, -0.927f, 3.523f, -2.73f, 4.463f, -4.785f)
                curveToRelative(1.606f, -3.518f, 1.643f, -7.724f, 0.12f, -11.295f)
                curveToRelative(-1.146f, 0.458f, -2.166f, -0.271f, -2.166f, -0.271f)
                reflectiveCurveToRelative(0.003f, 1.122f, -1.083f, 1.685f)
                curveToRelative(1.115f, 2.612f, 1.088f, 5.717f, -0.03f, 8.263f)
                curveToRelative(-0.538f, 1.225f, -1.358f, 2.365f, -2.498f, 3.01f)
                curveToRelative(-0.917f, 0.52f, -2.04f, 0.625f, -3.052f, 0.184f)
                curveToRelative(-1.342f, -0.585f, -2.293f, -1.864f, -2.89f, -3.254f)
                curveToRelative(-0.466f, -1.067f, -0.782f, -2.447f, -0.802f, -3.878f)
                curveToRelative(-0.037f, -1.724f, 0.728f, -3.193f, 1.635f, -3.218f)
                curveToRelative(0.622f, -0.024f, 1.427f, 0.918f, 1.598f, 2.435f)
                curveToRelative(0.158f, 1.543f, -0.177f, 3.72f, -1.174f, 5.49f)
                curveToRelative(0.677f, 1.085f, 1.77f, 1.98f, 2.951f, 1.974f)
                curveToRelative(1.386f, -2.338f, 1.827f, -4.911f, 1.793f, -6.987f)
                curveToRelative(-0.02f, -2.28f, -0.955f, -4.603f, -2.83f, -5.795f)
                curveToRelative(-1.437f, -0.907f, -3.173f, -0.948f, -4.676f, 0.0f)
                close()
                moveTo(3.278f, 3.9f)
                reflectiveCurveToRelative(-1.018f, 0.73f, -2.163f, 0.27f)
                curveToRelative(-1.524f, 3.573f, -1.488f, 7.778f, 0.12f, 11.296f)
                curveToRelative(0.94f, 2.056f, 2.465f, 3.858f, 4.462f, 4.785f)
                arcToRelative(6.95f, 6.95f, 0.0f, false, false, 5.523f, 0.124f)
                arcToRelative(9.12f, 9.12f, 0.0f, false, true, -1.75f, -1.455f)
                arcToRelative(11.18f, 11.18f, 0.0f, false, true, -1.267f, -1.628f)
                curveToRelative(-0.768f, -0.08f, -1.498f, -0.482f, -2.003f, -0.913f)
                curveToRelative(-1.447f, -1.213f, -2.453f, -3.478f, -2.632f, -5.9f)
                curveToRelative(-0.12f, -1.635f, 0.14f, -3.354f, 0.795f, -4.894f)
                curveTo(3.276f, 5.022f, 3.278f, 3.9f, 3.278f, 3.9f)
                close()
            }
        }
        .build()
        return _weblate!!
    }

private var _weblate: ImageVector? = null
