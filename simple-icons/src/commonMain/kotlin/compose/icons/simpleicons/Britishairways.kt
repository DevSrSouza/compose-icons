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

public val SimpleIcons.Britishairways: ImageVector
    get() {
        if (_britishairways != null) {
            return _britishairways!!
        }
        _britishairways = Builder(name = "Britishairways", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.489f, 13.252f)
                curveToRelative(-0.25f, 0.212f, -0.605f, 0.444f, -1.241f, 0.767f)
                curveToRelative(-1.347f, 0.72f, -2.198f, 0.983f, -2.198f, 0.983f)
                reflectiveCurveToRelative(-1.617f, -0.234f, -4.207f, -1.007f)
                curveToRelative(0.0f, 0.0f, 1.306f, -0.378f, 1.93f, -0.581f)
                arcToRelative(40.11f, 40.11f, 0.0f, false, false, 1.958f, -0.681f)
                curveToRelative(1.055f, -0.396f, 1.73f, -0.761f, 2.18f, -1.088f)
                curveToRelative(0.03f, -0.022f, 0.058f, -0.046f, 0.085f, -0.068f)
                curveToRelative(0.0f, 0.0f, 0.32f, 0.036f, 0.593f, 0.113f)
                curveToRelative(0.294f, 0.083f, 0.604f, 0.245f, 0.786f, 0.386f)
                curveToRelative(0.191f, 0.147f, 0.28f, 0.308f, 0.308f, 0.358f)
                arcToRelative(0.681f, 0.681f, 0.0f, false, true, 0.071f, 0.226f)
                reflectiveCurveToRelative(0.014f, 0.085f, -0.003f, 0.177f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, true, -0.147f, 0.313f)
                close()
                moveTo(24.0f, 12.196f)
                arcToRelative(0.662f, 0.662f, 0.0f, false, false, -0.08f, -0.157f)
                arcToRelative(1.348f, 1.348f, 0.0f, false, false, -0.197f, -0.23f)
                arcToRelative(1.685f, 1.685f, 0.0f, false, false, -0.227f, -0.178f)
                curveToRelative(-0.354f, -0.232f, -0.81f, -0.362f, -1.215f, -0.416f)
                curveToRelative(-0.627f, -0.083f, -1.342f, -0.07f, -1.411f, -0.07f)
                curveToRelative(-0.23f, -0.005f, -1.722f, 0.007f, -2.105f, 0.015f)
                curveToRelative(-1.702f, 0.034f, -3.787f, 0.039f, -4.333f, 0.038f)
                curveToRelative(-5.636f, 0.027f, -8.089f, -0.094f, -10.82f, -0.642f)
                curveTo(1.289f, 10.094f, 0.0f, 9.658f, 0.0f, 9.658f)
                curveToRelative(2.05f, -0.073f, 14.004f, -0.568f, 16.186f, -0.627f)
                curveToRelative(1.427f, -0.04f, 2.44f, -0.048f, 3.253f, 0.0f)
                curveToRelative(0.413f, 0.023f, 0.802f, 0.058f, 1.287f, 0.14f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 1.064f, 0.286f)
                curveToRelative(0.486f, 0.18f, 0.893f, 0.442f, 1.096f, 0.707f)
                curveToRelative(0.0f, 0.0f, 0.06f, 0.06f, 0.14f, 0.17f)
                curveToRelative(0.093f, 0.126f, 0.197f, 0.282f, 0.234f, 0.34f)
                curveToRelative(0.294f, 0.447f, 0.434f, 0.73f, 0.484f, 0.828f)
                curveToRelative(0.052f, 0.102f, 0.1f, 0.209f, 0.145f, 0.315f)
                curveToRelative(0.044f, 0.104f, 0.063f, 0.166f, 0.076f, 0.21f)
                curveToRelative(0.02f, 0.064f, 0.03f, 0.125f, 0.035f, 0.17f)
                close()
            }
        }
        .build()
        return _britishairways!!
    }

private var _britishairways: ImageVector? = null
