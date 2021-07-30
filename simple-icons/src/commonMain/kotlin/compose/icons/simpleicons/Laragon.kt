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

public val SimpleIcons.Laragon: ImageVector
    get() {
        if (_laragon != null) {
            return _laragon!!
        }
        _laragon = Builder(name = "Laragon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.843f, 0.979f)
                curveToRelative(-2.12f, -0.096f, -3.477f, 1.439f, -3.477f, 1.439f)
                curveTo(2.52f, 2.5f, 0.791f, 8.429f, 0.75f, 8.552f)
                lineToRelative(-0.248f, 0.74f)
                curveToRelative(-2.268f, 8.78f, 3.889f, 12.22f, 3.889f, 12.22f)
                curveToRelative(0.188f, 0.091f, 0.375f, -0.066f, 0.375f, -0.066f)
                curveToRelative(0.5f, -0.31f, 0.252f, -0.53f, 0.252f, -0.53f)
                curveToRelative(-1.43f, -1.742f, -1.595f, -5.864f, -1.596f, -5.899f)
                curveToRelative(-0.64f, -0.532f, -1.248f, -1.318f, -1.111f, -2.342f)
                curveToRelative(0.0f, 0.0f, 0.084f, -0.51f, 0.584f, -0.197f)
                curveToRelative(0.0f, 0.0f, 1.186f, 0.644f, 2.123f, 0.83f)
                curveToRelative(-0.001f, 0.0f, 0.476f, 0.043f, 0.5f, 0.177f)
                curveToRelative(0.0f, 0.0f, 0.374f, 1.752f, -0.78f, 2.32f)
                curveToRelative(0.745f, 0.437f, 1.465f, 0.85f, 1.465f, 0.85f)
                curveToRelative(0.124f, 1.263f, 0.81f, 5.32f, 0.81f, 5.32f)
                curveToRelative(0.064f, 0.797f, 0.906f, 0.954f, 0.906f, 0.954f)
                curveToRelative(0.483f, 0.172f, 4.12f, 0.062f, 4.12f, 0.062f)
                curveToRelative(1.014f, -0.044f, 1.062f, -0.953f, 1.062f, -0.953f)
                curveToRelative(0.015f, -0.545f, 0.03f, -3.62f, 0.03f, -3.62f)
                curveToRelative(0.096f, -0.575f, 0.766f, -0.5f, 0.766f, -0.5f)
                curveToRelative(0.703f, -0.03f, 0.688f, 0.454f, 0.688f, 0.454f)
                curveToRelative(-0.017f, 0.515f, 0.045f, 3.496f, 0.045f, 3.496f)
                curveToRelative(0.03f, 0.858f, 0.781f, 1.125f, 0.781f, 1.125f)
                curveToRelative(0.488f, 0.0f, 0.828f, -0.004f, 1.365f, 0.0f)
                curveToRelative(0.252f, 0.002f, 1.473f, 0.0f, 1.473f, 0.0f)
                curveToRelative(0.55f, -0.307f, 1.377f, -0.969f, 1.377f, -0.969f)
                curveToRelative(5.868f, -4.91f, 4.135f, -11.9f, 4.135f, -11.9f)
                curveTo(22.93f, 5.88f, 17.792f, 5.1f, 17.792f, 5.1f)
                curveToRelative(-0.582f, -1.811f, -1.643f, -2.682f, -1.643f, -2.682f)
                curveToRelative(-1.222f, -1.015f, -2.343f, -1.396f, -3.306f, -1.44f)
                close()
                moveTo(17.849f, 5.252f)
                reflectiveCurveToRelative(1.845f, 3.08f, -1.727f, 7.86f)
                curveToRelative(0.001f, 0.001f, -2.94f, 4.116f, -8.232f, 1.223f)
                curveToRelative(1.084f, 0.523f, 5.536f, 2.312f, 8.375f, -1.98f)
                curveToRelative(0.0f, 0.0f, 2.632f, -3.437f, 1.584f, -7.103f)
                close()
                moveTo(6.703f, 8.868f)
                reflectiveCurveToRelative(1.296f, 0.036f, 1.341f, 1.82f)
                curveToRelative(0.0f, 0.0f, -1.02f, -2.668f, -3.271f, -0.2f)
                curveToRelative(0.0f, 0.0f, 0.404f, -1.729f, 1.93f, -1.62f)
                close()
            }
        }
        .build()
        return _laragon!!
    }

private var _laragon: ImageVector? = null
