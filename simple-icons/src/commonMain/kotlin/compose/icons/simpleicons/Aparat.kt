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

public val SimpleIcons.Aparat: ImageVector
    get() {
        if (_aparat != null) {
            return _aparat!!
        }
        _aparat = Builder(name = "Aparat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.001f, 1.594f)
                curveTo(2.732f, 1.591f, -1.912f, 12.797f, 4.641f, 19.351f)
                curveToRelative(2.975f, 2.976f, 7.45f, 3.867f, 11.337f, 2.257f)
                curveToRelative(3.888f, -1.61f, 6.423f, -5.404f, 6.423f, -9.612f)
                curveToRelative(0.0f, -5.744f, -4.655f, -10.401f, -10.4f, -10.403f)
                close()
                moveTo(6.11f, 6.783f)
                curveToRelative(0.501f, -2.598f, 3.893f, -3.294f, 5.376f, -1.103f)
                curveToRelative(1.483f, 2.191f, -0.422f, 5.082f, -3.02f, 4.582f)
                curveToRelative(-1.612f, -0.31f, -2.667f, -1.868f, -2.356f, -3.479f)
                close()
                moveTo(10.432f, 15.771f)
                curveToRelative(-0.504f, 2.597f, -3.897f, 3.288f, -5.377f, 1.096f)
                curveToRelative(-1.481f, -2.192f, 0.427f, -5.081f, 3.025f, -4.579f)
                curveToRelative(1.612f, 0.311f, 2.665f, 1.871f, 2.352f, 3.483f)
                close()
                moveTo(11.693f, 13.366f)
                curveToRelative(-1.153f, -0.223f, -1.462f, -1.727f, -0.492f, -2.388f)
                curveToRelative(0.971f, -0.66f, 2.256f, 0.18f, 2.04f, 1.334f)
                curveToRelative(-0.135f, 0.72f, -0.829f, 1.192f, -1.548f, 1.053f)
                close()
                moveTo(17.889f, 17.204f)
                curveToRelative(-0.501f, 2.598f, -3.893f, 3.293f, -5.376f, 1.103f)
                curveToRelative(-1.483f, -2.191f, 0.422f, -5.082f, 3.02f, -4.582f)
                curveToRelative(1.612f, 0.31f, 2.667f, 1.868f, 2.356f, 3.479f)
                close()
                moveTo(15.923f, 11.702f)
                curveToRelative(-2.598f, -0.501f, -3.293f, -3.896f, -1.103f, -5.379f)
                curveToRelative(2.191f, -1.483f, 5.082f, 0.422f, 4.582f, 3.02f)
                curveToRelative(-0.308f, 1.613f, -1.867f, 2.67f, -3.48f, 2.359f)
                close()
                moveTo(13.589f, 23.264f)
                lineToRelative(2.265f, 0.611f)
                curveToRelative(1.983f, 0.526f, 4.017f, -0.654f, 4.543f, -2.637f)
                lineToRelative(0.639f, -2.402f)
                arcToRelative(11.383f, 11.383f, 0.0f, false, true, -7.447f, 4.427f)
                close()
                moveTo(21.232f, 3.599f)
                lineToRelative(-2.363f, -0.628f)
                arcToRelative(11.376f, 11.376f, 0.0f, false, true, 4.354f, 7.619f)
                lineToRelative(0.65f, -2.458f)
                curveToRelative(0.519f, -1.98f, -0.661f, -4.008f, -2.64f, -4.533f)
                close()
                moveTo(0.671f, 13.809f)
                lineToRelative(-0.541f, 2.04f)
                curveToRelative(-0.526f, 1.983f, 0.654f, 4.017f, 2.637f, 4.543f)
                lineToRelative(2.107f, 0.562f)
                arcToRelative(11.379f, 11.379f, 0.0f, false, true, -4.203f, -7.145f)
                close()
                moveTo(10.358f, 0.702f)
                lineTo(8.15f, 0.126f)
                curveTo(6.166f, -0.402f, 4.13f, 0.779f, 3.603f, 2.763f)
                lineToRelative(-0.551f, 2.082f)
                arcTo(11.376f, 11.376f, 0.0f, false, true, 10.358f, 0.702f)
                close()
            }
        }
        .build()
        return _aparat!!
    }

private var _aparat: ImageVector? = null
