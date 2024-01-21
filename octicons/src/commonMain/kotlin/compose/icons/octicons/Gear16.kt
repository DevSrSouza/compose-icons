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

public val Octicons.Gear16: ImageVector
    get() {
        if (_gear16 != null) {
            return _gear16!!
        }
        _gear16 = Builder(name = "Gear16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 0.701f, 0.031f)
                curveTo(9.444f, 0.095f, 9.99f, 0.645f, 10.16f, 1.29f)
                lineToRelative(0.288f, 1.107f)
                curveToRelative(0.018f, 0.066f, 0.079f, 0.158f, 0.212f, 0.224f)
                curveToRelative(0.231f, 0.114f, 0.454f, 0.243f, 0.668f, 0.386f)
                curveToRelative(0.123f, 0.082f, 0.233f, 0.09f, 0.299f, 0.071f)
                lineToRelative(1.103f, -0.303f)
                curveToRelative(0.644f, -0.176f, 1.392f, 0.021f, 1.82f, 0.63f)
                curveToRelative(0.27f, 0.385f, 0.506f, 0.792f, 0.704f, 1.218f)
                curveToRelative(0.315f, 0.675f, 0.111f, 1.422f, -0.364f, 1.891f)
                lineToRelative(-0.814f, 0.806f)
                curveToRelative(-0.049f, 0.048f, -0.098f, 0.147f, -0.088f, 0.294f)
                curveToRelative(0.016f, 0.257f, 0.016f, 0.515f, 0.0f, 0.772f)
                curveToRelative(-0.01f, 0.147f, 0.038f, 0.246f, 0.088f, 0.294f)
                lineToRelative(0.814f, 0.806f)
                curveToRelative(0.475f, 0.469f, 0.679f, 1.216f, 0.364f, 1.891f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, true, -0.704f, 1.217f)
                curveToRelative(-0.428f, 0.61f, -1.176f, 0.807f, -1.82f, 0.63f)
                lineToRelative(-1.102f, -0.302f)
                curveToRelative(-0.067f, -0.019f, -0.177f, -0.011f, -0.3f, 0.071f)
                arcToRelative(5.909f, 5.909f, 0.0f, false, true, -0.668f, 0.386f)
                curveToRelative(-0.133f, 0.066f, -0.194f, 0.158f, -0.211f, 0.224f)
                lineToRelative(-0.29f, 1.106f)
                curveToRelative(-0.168f, 0.646f, -0.715f, 1.196f, -1.458f, 1.26f)
                arcToRelative(8.006f, 8.006f, 0.0f, false, true, -1.402f, 0.0f)
                curveToRelative(-0.743f, -0.064f, -1.289f, -0.614f, -1.458f, -1.26f)
                lineToRelative(-0.289f, -1.106f)
                curveToRelative(-0.018f, -0.066f, -0.079f, -0.158f, -0.212f, -0.224f)
                arcToRelative(5.738f, 5.738f, 0.0f, false, true, -0.668f, -0.386f)
                curveToRelative(-0.123f, -0.082f, -0.233f, -0.09f, -0.299f, -0.071f)
                lineToRelative(-1.103f, 0.303f)
                curveToRelative(-0.644f, 0.176f, -1.392f, -0.021f, -1.82f, -0.63f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, -0.704f, -1.218f)
                curveToRelative(-0.315f, -0.675f, -0.111f, -1.422f, 0.363f, -1.891f)
                lineToRelative(0.815f, -0.806f)
                curveToRelative(0.05f, -0.048f, 0.098f, -0.147f, 0.088f, -0.294f)
                arcToRelative(6.214f, 6.214f, 0.0f, false, true, 0.0f, -0.772f)
                curveToRelative(0.01f, -0.147f, -0.038f, -0.246f, -0.088f, -0.294f)
                lineToRelative(-0.815f, -0.806f)
                curveTo(0.635f, 6.045f, 0.431f, 5.298f, 0.746f, 4.623f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, 0.704f, -1.217f)
                curveToRelative(0.428f, -0.61f, 1.176f, -0.807f, 1.82f, -0.63f)
                lineToRelative(1.102f, 0.302f)
                curveToRelative(0.067f, 0.019f, 0.177f, 0.011f, 0.3f, -0.071f)
                curveToRelative(0.214f, -0.143f, 0.437f, -0.272f, 0.668f, -0.386f)
                curveToRelative(0.133f, -0.066f, 0.194f, -0.158f, 0.211f, -0.224f)
                lineToRelative(0.29f, -1.106f)
                curveTo(6.009f, 0.645f, 6.556f, 0.095f, 7.299f, 0.03f)
                curveTo(7.53f, 0.01f, 7.764f, 0.0f, 8.0f, 0.0f)
                close()
                moveTo(7.429f, 1.525f)
                curveToRelative(-0.036f, 0.003f, -0.108f, 0.036f, -0.137f, 0.146f)
                lineToRelative(-0.289f, 1.105f)
                curveToRelative(-0.147f, 0.561f, -0.549f, 0.967f, -0.998f, 1.189f)
                curveToRelative(-0.173f, 0.086f, -0.34f, 0.183f, -0.5f, 0.29f)
                curveToRelative(-0.417f, 0.278f, -0.97f, 0.423f, -1.529f, 0.27f)
                lineToRelative(-1.103f, -0.303f)
                curveToRelative(-0.109f, -0.03f, -0.175f, 0.016f, -0.195f, 0.045f)
                curveToRelative(-0.22f, 0.312f, -0.412f, 0.644f, -0.573f, 0.99f)
                curveToRelative(-0.014f, 0.031f, -0.021f, 0.11f, 0.059f, 0.19f)
                lineToRelative(0.815f, 0.806f)
                curveToRelative(0.411f, 0.406f, 0.562f, 0.957f, 0.53f, 1.456f)
                arcToRelative(4.709f, 4.709f, 0.0f, false, false, 0.0f, 0.582f)
                curveToRelative(0.032f, 0.499f, -0.119f, 1.05f, -0.53f, 1.456f)
                lineToRelative(-0.815f, 0.806f)
                curveToRelative(-0.081f, 0.08f, -0.073f, 0.159f, -0.059f, 0.19f)
                curveToRelative(0.162f, 0.346f, 0.353f, 0.677f, 0.573f, 0.989f)
                curveToRelative(0.02f, 0.03f, 0.085f, 0.076f, 0.195f, 0.046f)
                lineToRelative(1.102f, -0.303f)
                curveToRelative(0.56f, -0.153f, 1.113f, -0.008f, 1.53f, 0.27f)
                curveToRelative(0.161f, 0.107f, 0.328f, 0.204f, 0.501f, 0.29f)
                curveToRelative(0.447f, 0.222f, 0.85f, 0.629f, 0.997f, 1.189f)
                lineToRelative(0.289f, 1.105f)
                curveToRelative(0.029f, 0.109f, 0.101f, 0.143f, 0.137f, 0.146f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 1.142f, 0.0f)
                curveToRelative(0.036f, -0.003f, 0.108f, -0.036f, 0.137f, -0.146f)
                lineToRelative(0.289f, -1.105f)
                curveToRelative(0.147f, -0.561f, 0.549f, -0.967f, 0.998f, -1.189f)
                curveToRelative(0.173f, -0.086f, 0.34f, -0.183f, 0.5f, -0.29f)
                curveToRelative(0.417f, -0.278f, 0.97f, -0.423f, 1.529f, -0.27f)
                lineToRelative(1.103f, 0.303f)
                curveToRelative(0.109f, 0.029f, 0.175f, -0.016f, 0.195f, -0.045f)
                curveToRelative(0.22f, -0.313f, 0.411f, -0.644f, 0.573f, -0.99f)
                curveToRelative(0.014f, -0.031f, 0.021f, -0.11f, -0.059f, -0.19f)
                lineToRelative(-0.815f, -0.806f)
                curveToRelative(-0.411f, -0.406f, -0.562f, -0.957f, -0.53f, -1.456f)
                arcToRelative(4.709f, 4.709f, 0.0f, false, false, 0.0f, -0.582f)
                curveToRelative(-0.032f, -0.499f, 0.119f, -1.05f, 0.53f, -1.456f)
                lineToRelative(0.815f, -0.806f)
                curveToRelative(0.081f, -0.08f, 0.073f, -0.159f, 0.059f, -0.19f)
                arcToRelative(6.464f, 6.464f, 0.0f, false, false, -0.573f, -0.989f)
                curveToRelative(-0.02f, -0.03f, -0.085f, -0.076f, -0.195f, -0.046f)
                lineToRelative(-1.102f, 0.303f)
                curveToRelative(-0.56f, 0.153f, -1.113f, 0.008f, -1.53f, -0.27f)
                arcToRelative(4.44f, 4.44f, 0.0f, false, false, -0.501f, -0.29f)
                curveToRelative(-0.447f, -0.222f, -0.85f, -0.629f, -0.997f, -1.189f)
                lineToRelative(-0.289f, -1.105f)
                curveToRelative(-0.029f, -0.11f, -0.101f, -0.143f, -0.137f, -0.146f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -1.142f, 0.0f)
                close()
                moveTo(11.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -3.001f, 0.001f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.5f, 8.0f)
                close()
            }
        }
        .build()
        return _gear16!!
    }

private var _gear16: ImageVector? = null
