package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.UnrealEngine: ImageVector
    get() {
        if (_unrealEngine != null) {
            return _unrealEngine!!
        }
        _unrealEngine = Builder(name = "UnrealEngine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.999f, 0.0f)
                curveTo(5.427f, 0.0f, 0.1f, 5.373f, 0.1f, 12.0f)
                curveToRelative(0.0f, 6.628f, 5.327f, 12.0f, 11.899f, 12.0f)
                curveToRelative(6.571f, 0.0f, 11.899f, -5.372f, 11.899f, -12.0f)
                curveToRelative(0.0f, -6.627f, -5.328f, -12.0f, -11.9f, -12.0f)
                close()
                moveTo(11.999f, 0.528f)
                curveToRelative(3.038f, 0.0f, 5.895f, 1.194f, 8.043f, 3.36f)
                arcTo(11.446f, 11.446f, 0.0f, false, true, 23.374f, 12.0f)
                curveToRelative(0.0f, 3.064f, -1.183f, 5.945f, -3.332f, 8.112f)
                arcTo(11.254f, 11.254f, 0.0f, false, true, 12.0f, 23.472f)
                arcToRelative(11.253f, 11.253f, 0.0f, false, true, -8.044f, -3.36f)
                arcTo(11.447f, 11.447f, 0.0f, false, true, 0.623f, 12.0f)
                curveToRelative(0.0f, -3.064f, 1.184f, -5.945f, 3.332f, -8.112f)
                arcTo(11.252f, 11.252f, 0.0f, false, true, 12.0f, 0.528f)
                close()
                moveTo(11.404f, 4.751f)
                curveToRelative(-1.938f, 0.52f, -3.732f, 1.516f, -6.123f, 4.258f)
                curveToRelative(-2.392f, 2.742f, -1.938f, 5.006f, -1.938f, 5.006f)
                reflectiveCurveToRelative(0.66f, -1.558f, 2.247f, -3.199f)
                curveToRelative(0.752f, -0.777f, 1.314f, -1.037f, 1.698f, -1.038f)
                arcToRelative(0.598f, 0.598f, 0.0f, false, true, 0.632f, 0.602f)
                verticalLineToRelative(5.567f)
                curveToRelative(0.0f, 0.55f, -0.354f, 0.669f, -0.68f, 0.663f)
                curveToRelative(-0.279f, -0.005f, -0.537f, -0.102f, -0.537f, -0.102f)
                curveToRelative(1.63f, 2.368f, 5.526f, 2.7f, 5.526f, 2.7f)
                lineToRelative(1.711f, -1.828f)
                lineToRelative(0.04f, 0.035f)
                lineToRelative(1.568f, 1.336f)
                curveToRelative(2.866f, -1.703f, 4.248f, -4.86f, 4.248f, -4.86f)
                curveToRelative(-1.279f, 1.353f, -2.094f, 1.669f, -2.578f, 1.667f)
                curveToRelative(-0.429f, -0.003f, -0.597f, -0.255f, -0.597f, -0.255f)
                curveToRelative(-0.023f, -0.117f, -0.063f, -1.81f, -0.078f, -3.505f)
                curveToRelative(-0.014f, -1.756f, -0.001f, -3.513f, 0.087f, -3.518f)
                curveToRelative(0.494f, -0.929f, 2.073f, -2.802f, 2.073f, -2.802f)
                curveToRelative(-2.948f, 0.581f, -4.556f, 2.513f, -4.556f, 2.513f)
                curveToRelative(-0.475f, -0.374f, -1.444f, -0.311f, -1.444f, -0.311f)
                curveToRelative(0.454f, 0.25f, 0.907f, 0.976f, 0.907f, 1.578f)
                verticalLineToRelative(5.92f)
                reflectiveCurveToRelative(-0.99f, 0.873f, -1.752f, 0.873f)
                curveToRelative(-0.451f, 0.0f, -0.729f, -0.247f, -0.881f, -0.449f)
                arcToRelative(1.182f, 1.182f, 0.0f, false, true, -0.15f, -0.258f)
                lineTo(10.827f, 8.033f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, true, -0.363f, 0.123f)
                curveToRelative(-0.162f, 0.0f, -0.33f, -0.082f, -0.444f, -0.32f)
                curveToRelative(-0.086f, -0.18f, -0.141f, -0.45f, -0.141f, -0.842f)
                curveToRelative(0.0f, -1.35f, 1.525f, -2.243f, 1.525f, -2.243f)
                close()
            }
        }
        .build()
        return _unrealEngine!!
    }

private var _unrealEngine: ImageVector? = null
