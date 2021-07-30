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

public val SimpleIcons.Obsstudio: ImageVector
    get() {
        if (_obsstudio != null) {
            return _obsstudio!!
        }
        _obsstudio = Builder(name = "Obsstudio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 24.0f)
                curveTo(5.383f, 24.0f, 0.0f, 18.617f, 0.0f, 12.0f)
                reflectiveCurveTo(5.383f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.383f, 12.0f, 12.0f)
                reflectiveCurveTo(18.617f, 24.0f, 12.0f, 24.0f)
                close()
                moveTo(12.0f, 1.109f)
                curveTo(5.995f, 1.109f, 1.11f, 5.995f, 1.11f, 12.0f)
                curveTo(1.11f, 18.005f, 5.995f, 22.89f, 12.0f, 22.89f)
                reflectiveCurveTo(22.89f, 18.005f, 22.89f, 12.0f)
                curveTo(22.89f, 5.995f, 18.005f, 1.109f, 12.0f, 1.109f)
                close()
                moveTo(6.182f, 5.99f)
                curveToRelative(0.352f, -1.698f, 1.503f, -3.229f, 3.05f, -3.996f)
                curveToRelative(-0.269f, 0.273f, -0.595f, 0.483f, -0.844f, 0.78f)
                curveToRelative(-1.02f, 1.1f, -1.48f, 2.692f, -1.199f, 4.156f)
                curveToRelative(0.355f, 2.235f, 2.455f, 4.06f, 4.732f, 4.028f)
                curveToRelative(1.765f, 0.079f, 3.485f, -0.937f, 4.348f, -2.468f)
                curveToRelative(1.848f, 0.063f, 3.645f, 1.017f, 4.7f, 2.548f)
                curveToRelative(0.54f, 0.799f, 0.962f, 1.736f, 0.991f, 2.711f)
                curveToRelative(-0.342f, -1.295f, -1.202f, -2.446f, -2.375f, -3.095f)
                curveToRelative(-1.135f, -0.639f, -2.529f, -0.802f, -3.772f, -0.425f)
                curveToRelative(-1.56f, 0.448f, -2.849f, 1.723f, -3.293f, 3.293f)
                curveToRelative(-0.377f, 1.25f, -0.216f, 2.628f, 0.377f, 3.772f)
                curveToRelative(-0.825f, 1.429f, -2.315f, 2.449f, -3.932f, 2.756f)
                curveToRelative(-1.244f, 0.261f, -2.551f, 0.059f, -3.709f, -0.464f)
                curveToRelative(1.036f, 0.302f, 2.161f, 0.355f, 3.191f, -0.011f)
                curveToRelative(1.381f, -0.457f, 2.522f, -1.567f, 3.024f, -2.935f)
                curveToRelative(0.556f, -1.49f, 0.345f, -3.261f, -0.591f, -4.54f)
                curveToRelative(-0.7f, -1.007f, -1.803f, -1.717f, -3.002f, -1.969f)
                curveToRelative(-0.38f, -0.068f, -0.764f, -0.098f, -1.148f, -0.134f)
                curveToRelative(-0.611f, -1.231f, -0.834f, -2.66f, -0.528f, -3.996f)
                lineTo(6.182f, 5.99f)
                close()
            }
        }
        .build()
        return _obsstudio!!
    }

private var _obsstudio: ImageVector? = null
