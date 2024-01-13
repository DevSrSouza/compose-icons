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

public val Octicons.Flame24: ImageVector
    get() {
        if (_flame24 != null) {
            return _flame24!!
        }
        _flame24 = Builder(name = "Flame24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.265f, 1.627f)
                curveToRelative(0.0f, 3.545f, 1.869f, 5.327f, 3.479f, 7.021f)
                curveToRelative(1.54f, 1.62f, 3.006f, 3.163f, 3.006f, 6.102f)
                curveToRelative(0.0f, 4.812f, -3.753f, 8.25f, -8.565f, 8.25f)
                curveToRelative(-4.813f, 0.0f, -8.935f, -3.421f, -8.935f, -8.25f)
                curveToRelative(0.0f, -2.039f, 0.962f, -4.011f, 2.509f, -4.899f)
                curveToRelative(0.305f, -0.175f, 0.672f, 0.007f, 0.803f, 0.334f)
                curveTo(7.563f, 12.684f, 8.797f, 12.64f, 9.437f, 12.0f)
                curveToRelative(0.388f, -0.387f, 0.47f, -1.116f, -0.004f, -2.062f)
                curveToRelative(-2.405f, -4.812f, 1.863f, -8.279f, 4.2f, -8.854f)
                curveToRelative(0.336f, -0.082f, 0.615f, 0.198f, 0.632f, 0.543f)
                close()
                moveTo(12.185f, 21.5f)
                curveToRelative(4.059f, 0.0f, 7.065f, -2.84f, 7.065f, -6.75f)
                curveToRelative(0.0f, -2.337f, -1.093f, -3.489f, -2.678f, -5.158f)
                lineToRelative(-0.021f, -0.023f)
                curveToRelative(-1.44f, -1.517f, -3.139f, -3.351f, -3.649f, -6.557f)
                arcToRelative(6.148f, 6.148f, 0.0f, false, false, -1.911f, 1.76f)
                curveToRelative(-0.787f, 1.144f, -1.147f, 2.633f, -0.216f, 4.495f)
                curveToRelative(0.603f, 1.205f, 0.777f, 2.74f, -0.277f, 3.794f)
                curveToRelative(-0.657f, 0.657f, -1.762f, 1.1f, -2.956f, 0.586f)
                curveToRelative(-0.752f, -0.324f, -1.353f, -0.955f, -1.838f, -1.79f)
                curveToRelative(-0.567f, 0.706f, -0.954f, 1.74f, -0.954f, 2.893f)
                curveToRelative(0.0f, 3.847f, 3.288f, 6.75f, 7.435f, 6.75f)
                close()
            }
        }
        .build()
        return _flame24!!
    }

private var _flame24: ImageVector? = null
