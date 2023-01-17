package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.LightBulb24: ImageVector
    get() {
        if (_lightBulb24 != null) {
            return _lightBulb24!!
        }
        _lightBulb24 = Builder(name = "LightBulb24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.5f)
                curveToRelative(-3.81f, 0.0f, -6.5f, 2.743f, -6.5f, 6.119f)
                curveToRelative(0.0f, 1.536f, 0.632f, 2.572f, 1.425f, 3.56f)
                curveToRelative(0.172f, 0.215f, 0.347f, 0.422f, 0.527f, 0.635f)
                lineToRelative(0.096f, 0.112f)
                curveToRelative(0.21f, 0.25f, 0.427f, 0.508f, 0.63f, 0.774f)
                curveToRelative(0.404f, 0.531f, 0.783f, 1.128f, 0.995f, 1.834f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.436f, 0.432f)
                curveToRelative(-0.138f, -0.46f, -0.397f, -0.89f, -0.753f, -1.357f)
                arcToRelative(18.111f, 18.111f, 0.0f, false, false, -0.582f, -0.714f)
                lineToRelative(-0.092f, -0.11f)
                curveToRelative(-0.18f, -0.212f, -0.37f, -0.436f, -0.555f, -0.667f)
                curveTo(4.87f, 12.016f, 4.0f, 10.651f, 4.0f, 8.618f)
                curveTo(4.0f, 4.363f, 7.415f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(8.0f, 3.362f, 8.0f, 7.619f)
                curveToRelative(0.0f, 2.032f, -0.87f, 3.397f, -1.755f, 4.5f)
                curveToRelative(-0.185f, 0.23f, -0.375f, 0.454f, -0.555f, 0.667f)
                lineToRelative(-0.092f, 0.109f)
                curveToRelative(-0.21f, 0.248f, -0.405f, 0.481f, -0.582f, 0.714f)
                curveToRelative(-0.356f, 0.467f, -0.615f, 0.898f, -0.753f, 1.357f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.437f, -0.432f)
                curveToRelative(0.213f, -0.706f, 0.592f, -1.303f, 0.997f, -1.834f)
                curveToRelative(0.202f, -0.266f, 0.419f, -0.524f, 0.63f, -0.774f)
                lineToRelative(0.095f, -0.112f)
                curveToRelative(0.18f, -0.213f, 0.355f, -0.42f, 0.527f, -0.634f)
                curveToRelative(0.793f, -0.99f, 1.425f, -2.025f, 1.425f, -3.561f)
                curveTo(18.5f, 5.243f, 15.81f, 2.5f, 12.0f, 2.5f)
                close()
                moveTo(8.75f, 18.0f)
                horizontalLineToRelative(6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-6.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(9.5f, 21.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.75f, -0.75f)
                close()
            }
        }
        .build()
        return _lightBulb24!!
    }

private var _lightBulb24: ImageVector? = null
