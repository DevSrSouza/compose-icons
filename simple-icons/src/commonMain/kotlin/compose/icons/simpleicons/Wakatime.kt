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

public val SimpleIcons.Wakatime: ImageVector
    get() {
        if (_wakatime != null) {
            return _wakatime!!
        }
        _wakatime = Builder(name = "Wakatime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.824f)
                arcToRelative(9.176f, 9.176f, 0.0f, true, true, 0.0f, 18.352f)
                arcToRelative(9.176f, 9.176f, 0.0f, false, true, 0.0f, -18.352f)
                close()
                moveTo(17.097f, 7.882f)
                curveToRelative(-0.327f, 0.0f, -0.61f, 0.19f, -0.764f, 0.45f)
                curveToRelative(-1.025f, 1.463f, -2.21f, 3.162f, -3.288f, 4.706f)
                lineToRelative(-0.387f, -0.636f)
                arcToRelative(0.897f, 0.897f, 0.0f, false, false, -0.759f, -0.439f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, false, -0.788f, 0.492f)
                lineToRelative(-0.357f, 0.581f)
                lineToRelative(-1.992f, -2.943f)
                arcToRelative(0.897f, 0.897f, 0.0f, false, false, -0.761f, -0.446f)
                curveToRelative(-0.514f, 0.0f, -0.903f, 0.452f, -0.903f, 0.96f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.207f, 0.61f)
                lineToRelative(2.719f, 3.96f)
                curveToRelative(0.152f, 0.272f, 0.44f, 0.47f, 0.776f, 0.47f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, 0.787f, -0.483f)
                curveToRelative(0.046f, -0.071f, 0.23f, -0.368f, 0.314f, -0.504f)
                lineToRelative(0.324f, 0.52f)
                curveToRelative(-0.035f, -0.047f, 0.076f, 0.113f, 0.087f, 0.13f)
                curveToRelative(0.024f, 0.031f, 0.054f, 0.059f, 0.078f, 0.085f)
                curveToRelative(0.019f, 0.019f, 0.04f, 0.036f, 0.058f, 0.052f)
                curveToRelative(0.036f, 0.033f, 0.08f, 0.056f, 0.115f, 0.08f)
                curveToRelative(0.025f, 0.016f, 0.052f, 0.028f, 0.076f, 0.04f)
                curveToRelative(0.029f, 0.015f, 0.06f, 0.024f, 0.088f, 0.035f)
                curveToRelative(0.058f, 0.025f, 0.122f, 0.027f, 0.18f, 0.04f)
                curveToRelative(0.031f, 0.004f, 0.064f, 0.003f, 0.092f, 0.005f)
                curveToRelative(0.29f, 0.0f, 0.546f, -0.149f, 0.707f, -0.36f)
                curveToRelative(1.4f, -2.0f, 2.842f, -4.055f, 4.099f, -5.849f)
                arcTo(0.995f, 0.995f, 0.0f, false, false, 18.0f, 8.842f)
                curveToRelative(0.0f, -0.508f, -0.389f, -0.96f, -0.903f, -0.96f)
            }
        }
        .build()
        return _wakatime!!
    }

private var _wakatime: ImageVector? = null
