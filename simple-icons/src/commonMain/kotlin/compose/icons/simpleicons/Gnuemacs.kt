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

public val SimpleIcons.Gnuemacs: ImageVector
    get() {
        if (_gnuemacs != null) {
            return _gnuemacs!!
        }
        _gnuemacs = Builder(name = "Gnuemacs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.448f, 24.0f, 0.118f, 18.617f, 0.118f, 12.0f)
                reflectiveCurveTo(5.448f, 0.0f, 12.0f, 0.0f)
                curveToRelative(6.552f, 0.0f, 11.882f, 5.383f, 11.882f, 12.0f)
                reflectiveCurveTo(18.552f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 0.661f)
                curveTo(5.813f, 0.661f, 0.779f, 5.748f, 0.779f, 12.0f)
                reflectiveCurveTo(5.813f, 23.339f, 12.0f, 23.339f)
                curveToRelative(6.187f, 0.0f, 11.221f, -5.086f, 11.221f, -11.339f)
                reflectiveCurveTo(18.187f, 0.661f, 12.0f, 0.661f)
                close()
                moveTo(8.03f, 20.197f)
                curveToRelative(0.0f, 0.0f, 0.978f, 0.069f, 2.236f, -0.042f)
                curveToRelative(0.51f, -0.045f, 2.444f, -0.235f, 3.891f, -0.552f)
                curveToRelative(0.0f, 0.0f, 1.764f, -0.377f, 2.707f, -0.725f)
                curveToRelative(0.987f, -0.364f, 1.524f, -0.673f, 1.766f, -1.11f)
                curveToRelative(-0.011f, -0.09f, 0.074f, -0.408f, -0.381f, -0.599f)
                curveToRelative(-1.164f, -0.488f, -2.514f, -0.4f, -5.185f, -0.457f)
                curveToRelative(-2.962f, -0.102f, -3.948f, -0.598f, -4.472f, -0.997f)
                curveToRelative(-0.503f, -0.405f, -0.25f, -1.526f, 1.907f, -2.513f)
                curveToRelative(1.086f, -0.526f, 5.345f, -1.496f, 5.345f, -1.496f)
                curveToRelative(-1.434f, -0.709f, -4.109f, -1.955f, -4.659f, -2.224f)
                curveToRelative(-0.482f, -0.236f, -1.254f, -0.591f, -1.421f, -1.021f)
                curveToRelative(-0.19f, -0.413f, 0.448f, -0.768f, 0.804f, -0.87f)
                curveToRelative(1.147f, -0.331f, 2.766f, -0.536f, 4.24f, -0.56f)
                curveToRelative(0.741f, -0.012f, 0.861f, -0.059f, 0.861f, -0.059f)
                curveToRelative(1.022f, -0.17f, 1.695f, -0.869f, 1.414f, -1.976f)
                curveToRelative(-0.252f, -1.13f, -1.579f, -1.795f, -2.84f, -1.565f)
                curveToRelative(-1.188f, 0.217f, -4.05f, 1.048f, -4.05f, 1.048f)
                curveToRelative(3.539f, -0.031f, 4.131f, 0.028f, 4.395f, 0.398f)
                curveToRelative(0.156f, 0.218f, -0.071f, 0.518f, -1.015f, 0.672f)
                curveToRelative(-1.027f, 0.168f, -3.163f, 0.37f, -3.163f, 0.37f)
                curveToRelative(-2.049f, 0.122f, -3.492f, 0.13f, -3.925f, 1.046f)
                curveTo(6.202f, 7.564f, 6.787f, 8.094f, 7.043f, 8.425f)
                curveToRelative(1.082f, 1.204f, 2.646f, 1.853f, 3.652f, 2.331f)
                curveToRelative(0.379f, 0.18f, 1.49f, 0.52f, 1.49f, 0.52f)
                curveToRelative(-3.265f, -0.18f, -5.619f, 0.823f, -7.001f, 1.977f)
                curveToRelative(-1.562f, 1.445f, -0.871f, 3.168f, 2.33f, 4.228f)
                curveToRelative(1.891f, 0.626f, 2.828f, 0.921f, 5.648f, 0.667f)
                curveToRelative(1.661f, -0.09f, 1.923f, -0.036f, 1.939f, 0.1f)
                curveToRelative(0.023f, 0.192f, -1.845f, 0.669f, -2.355f, 0.816f)
                curveTo(11.448f, 19.438f, 8.047f, 20.193f, 8.03f, 20.197f)
                close()
            }
        }
        .build()
        return _gnuemacs!!
    }

private var _gnuemacs: ImageVector? = null
