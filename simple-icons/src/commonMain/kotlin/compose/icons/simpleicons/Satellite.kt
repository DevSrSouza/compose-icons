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

public val SimpleIcons.Satellite: ImageVector
    get() {
        if (_satellite != null) {
            return _satellite!!
        }
        _satellite = Builder(name = "Satellite", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.413f, 7.62f)
                curveToRelative(0.042f, 0.0f, 0.063f, 0.02f, 0.105f, 0.02f)
                curveToRelative(0.062f, 0.0f, 0.148f, -0.02f, 0.21f, -0.061f)
                lineToRelative(0.736f, -0.415f)
                curveToRelative(0.21f, -0.124f, 0.273f, -0.372f, 0.148f, -0.559f)
                lineToRelative(-0.946f, -1.635f)
                arcToRelative(0.374f, 0.374f, 0.0f, false, false, -0.253f, -0.187f)
                curveToRelative(-0.105f, -0.02f, -0.23f, -0.02f, -0.315f, 0.042f)
                lineToRelative(-0.735f, 0.414f)
                curveToRelative(-0.211f, 0.125f, -0.274f, 0.373f, -0.148f, 0.56f)
                lineToRelative(0.946f, 1.635f)
                curveToRelative(0.042f, 0.082f, 0.147f, 0.145f, 0.252f, 0.186f)
                close()
                moveTo(14.112f, 11.68f)
                lineTo(13.377f, 12.093f)
                curveToRelative(-0.21f, 0.125f, -0.274f, 0.374f, -0.148f, 0.56f)
                lineToRelative(0.946f, 1.635f)
                arcToRelative(0.373f, 0.373f, 0.0f, false, false, 0.253f, 0.187f)
                curveToRelative(0.041f, 0.0f, 0.062f, 0.02f, 0.104f, 0.02f)
                arcToRelative(0.409f, 0.409f, 0.0f, false, false, 0.211f, -0.062f)
                lineToRelative(0.735f, -0.414f)
                curveToRelative(0.21f, -0.125f, 0.274f, -0.373f, 0.148f, -0.56f)
                lineToRelative(-0.946f, -1.635f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.252f, -0.187f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, false, -0.316f, 0.042f)
                close()
                moveTo(11.989f, 0.0f)
                curveTo(6.105f, 0.0f, 1.333f, 4.7f, 1.333f, 10.499f)
                curveToRelative(0.0f, 0.953f, 0.127f, 1.884f, 0.379f, 2.795f)
                curveToRelative(0.147f, 0.56f, 0.735f, 0.87f, 1.282f, 0.725f)
                curveToRelative(0.567f, -0.145f, 0.882f, -0.725f, 0.736f, -1.263f)
                arcToRelative(8.098f, 8.098f, 0.0f, false, true, -0.316f, -2.237f)
                curveTo(3.436f, 5.86f, 7.28f, 2.071f, 11.99f, 2.071f)
                reflectiveCurveToRelative(8.555f, 3.79f, 8.555f, 8.428f)
                curveToRelative(0.0f, 3.189f, -1.787f, 6.067f, -4.667f, 7.517f)
                arcToRelative(6.35f, 6.35f, 0.0f, false, true, -0.861f, 0.372f)
                curveToRelative(-0.126f, 0.041f, -0.252f, 0.104f, -0.4f, 0.145f)
                arcToRelative(1.046f, 1.046f, 0.0f, false, false, -0.735f, 0.994f)
                curveToRelative(0.0f, 0.498f, 0.084f, 1.056f, 0.274f, 1.657f)
                lineToRelative(-2.46f, -1.305f)
                curveToRelative(-0.987f, -0.517f, -1.955f, -1.056f, -2.753f, -1.822f)
                curveToRelative(-0.904f, -0.87f, -1.198f, -1.429f, -1.282f, -2.444f)
                curveToRelative(-0.084f, -0.931f, 0.147f, -1.594f, 0.904f, -2.505f)
                curveToRelative(0.4f, -0.497f, 0.924f, -0.85f, 1.344f, -1.097f)
                curveToRelative(0.4f, -0.25f, 0.82f, -0.477f, 1.262f, -0.685f)
                arcToRelative(2.097f, 2.097f, 0.0f, false, false, 2.27f, 0.146f)
                arcToRelative(2.053f, 2.053f, 0.0f, false, false, 0.798f, -2.816f)
                curveToRelative(-0.567f, -0.995f, -1.849f, -1.347f, -2.858f, -0.788f)
                arcToRelative(2.021f, 2.021f, 0.0f, false, false, -1.051f, 1.575f)
                curveToRelative(-0.525f, 0.249f, -1.05f, 0.538f, -1.534f, 0.849f)
                curveToRelative(-0.547f, 0.331f, -1.262f, 0.828f, -1.87f, 1.573f)
                curveToRelative(-0.758f, 0.932f, -1.514f, 2.133f, -1.367f, 3.976f)
                curveToRelative(0.126f, 1.532f, 0.631f, 2.527f, 1.892f, 3.748f)
                curveToRelative(1.009f, 0.974f, 2.101f, 1.595f, 3.258f, 2.196f)
                lineToRelative(3.95f, 2.05f)
                curveToRelative(0.211f, 0.103f, 0.463f, 0.165f, 0.694f, 0.165f)
                curveToRelative(0.379f, 0.0f, 0.736f, -0.145f, 1.009f, -0.394f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, 0.315f, -1.656f)
                arcToRelative(7.646f, 7.646f, 0.0f, false, true, -0.588f, -1.677f)
                curveToRelative(0.252f, -0.104f, 0.505f, -0.229f, 0.756f, -0.332f)
                curveToRelative(3.595f, -1.801f, 5.823f, -5.384f, 5.823f, -9.36f)
                curveTo(22.645f, 4.701f, 17.875f, 0.0f, 11.989f, 0.0f)
                close()
            }
        }
        .build()
        return _satellite!!
    }

private var _satellite: ImageVector? = null
