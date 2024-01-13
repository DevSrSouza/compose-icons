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

public val SimpleIcons.Meta: ImageVector
    get() {
        if (_meta != null) {
            return _meta!!
        }
        _meta = Builder(name = "Meta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.915f, 4.03f)
                curveToRelative(-1.968f, 0.0f, -3.683f, 1.28f, -4.871f, 3.113f)
                curveTo(0.704f, 9.208f, 0.0f, 11.883f, 0.0f, 14.449f)
                curveToRelative(0.0f, 0.706f, 0.07f, 1.369f, 0.21f, 1.973f)
                arcToRelative(6.624f, 6.624f, 0.0f, false, false, 0.265f, 0.86f)
                arcToRelative(5.297f, 5.297f, 0.0f, false, false, 0.371f, 0.761f)
                curveToRelative(0.696f, 1.159f, 1.818f, 1.927f, 3.593f, 1.927f)
                curveToRelative(1.497f, 0.0f, 2.633f, -0.671f, 3.965f, -2.444f)
                curveToRelative(0.76f, -1.012f, 1.144f, -1.626f, 2.663f, -4.32f)
                lineToRelative(0.756f, -1.339f)
                lineToRelative(0.186f, -0.325f)
                curveToRelative(0.061f, 0.1f, 0.121f, 0.196f, 0.183f, 0.3f)
                lineToRelative(2.152f, 3.595f)
                curveToRelative(0.724f, 1.21f, 1.665f, 2.556f, 2.47f, 3.314f)
                curveToRelative(1.046f, 0.987f, 1.992f, 1.22f, 3.06f, 1.22f)
                curveToRelative(1.075f, 0.0f, 1.876f, -0.355f, 2.455f, -0.843f)
                arcToRelative(3.743f, 3.743f, 0.0f, false, false, 0.81f, -0.973f)
                curveToRelative(0.542f, -0.939f, 0.861f, -2.127f, 0.861f, -3.745f)
                curveToRelative(0.0f, -2.72f, -0.681f, -5.357f, -2.084f, -7.45f)
                curveToRelative(-1.282f, -1.912f, -2.957f, -2.93f, -4.716f, -2.93f)
                curveToRelative(-1.047f, 0.0f, -2.088f, 0.467f, -3.053f, 1.308f)
                curveToRelative(-0.652f, 0.57f, -1.257f, 1.29f, -1.82f, 2.05f)
                curveToRelative(-0.69f, -0.875f, -1.335f, -1.547f, -1.958f, -2.056f)
                curveToRelative(-1.182f, -0.966f, -2.315f, -1.303f, -3.454f, -1.303f)
                close()
                moveTo(17.075f, 6.083f)
                curveToRelative(1.147f, 0.0f, 2.188f, 0.758f, 2.992f, 1.999f)
                curveToRelative(1.132f, 1.748f, 1.647f, 4.195f, 1.647f, 6.4f)
                curveToRelative(0.0f, 1.548f, -0.368f, 2.9f, -1.839f, 2.9f)
                curveToRelative(-0.58f, 0.0f, -1.027f, -0.23f, -1.664f, -1.004f)
                curveToRelative(-0.496f, -0.601f, -1.343f, -1.878f, -2.832f, -4.358f)
                lineToRelative(-0.617f, -1.028f)
                arcToRelative(44.908f, 44.908f, 0.0f, false, false, -1.255f, -1.98f)
                curveToRelative(0.07f, -0.109f, 0.141f, -0.224f, 0.211f, -0.327f)
                curveToRelative(1.12f, -1.667f, 2.118f, -2.602f, 3.358f, -2.602f)
                close()
                moveTo(6.874f, 6.636f)
                curveToRelative(1.265f, 0.0f, 2.058f, 0.791f, 2.675f, 1.446f)
                curveToRelative(0.307f, 0.327f, 0.737f, 0.871f, 1.234f, 1.579f)
                lineToRelative(-1.02f, 1.566f)
                curveToRelative(-0.757f, 1.163f, -1.882f, 3.017f, -2.837f, 4.338f)
                curveToRelative(-1.191f, 1.649f, -1.81f, 1.817f, -2.486f, 1.817f)
                curveToRelative(-0.524f, 0.0f, -1.038f, -0.237f, -1.383f, -0.794f)
                curveToRelative(-0.263f, -0.426f, -0.464f, -1.13f, -0.464f, -2.046f)
                curveToRelative(0.0f, -2.221f, 0.63f, -4.535f, 1.66f, -6.088f)
                curveToRelative(0.454f, -0.687f, 0.964f, -1.226f, 1.533f, -1.533f)
                arcToRelative(2.264f, 2.264f, 0.0f, false, true, 1.088f, -0.285f)
                close()
            }
        }
        .build()
        return _meta!!
    }

private var _meta: ImageVector? = null
