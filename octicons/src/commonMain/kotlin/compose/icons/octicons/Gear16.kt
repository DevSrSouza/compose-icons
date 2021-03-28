package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(7.429f, 1.525f)
                arcToRelative(6.593f, 6.593f, 0.0f, false, true, 1.142f, 0.0f)
                curveToRelative(0.036f, 0.003f, 0.108f, 0.036f, 0.137f, 0.146f)
                lineToRelative(0.289f, 1.105f)
                curveToRelative(0.147f, 0.56f, 0.55f, 0.967f, 0.997f, 1.189f)
                curveToRelative(0.174f, 0.086f, 0.341f, 0.183f, 0.501f, 0.29f)
                curveToRelative(0.417f, 0.278f, 0.97f, 0.423f, 1.53f, 0.27f)
                lineToRelative(1.102f, -0.303f)
                curveToRelative(0.11f, -0.03f, 0.175f, 0.016f, 0.195f, 0.046f)
                curveToRelative(0.219f, 0.31f, 0.41f, 0.641f, 0.573f, 0.989f)
                curveToRelative(0.014f, 0.031f, 0.022f, 0.11f, -0.059f, 0.19f)
                lineToRelative(-0.815f, 0.806f)
                curveToRelative(-0.411f, 0.406f, -0.562f, 0.957f, -0.53f, 1.456f)
                arcToRelative(4.588f, 4.588f, 0.0f, false, true, 0.0f, 0.582f)
                curveToRelative(-0.032f, 0.499f, 0.119f, 1.05f, 0.53f, 1.456f)
                lineToRelative(0.815f, 0.806f)
                curveToRelative(0.08f, 0.08f, 0.073f, 0.159f, 0.059f, 0.19f)
                arcToRelative(6.494f, 6.494f, 0.0f, false, true, -0.573f, 0.99f)
                curveToRelative(-0.02f, 0.029f, -0.086f, 0.074f, -0.195f, 0.045f)
                lineToRelative(-1.103f, -0.303f)
                curveToRelative(-0.559f, -0.153f, -1.112f, -0.008f, -1.529f, 0.27f)
                curveToRelative(-0.16f, 0.107f, -0.327f, 0.204f, -0.5f, 0.29f)
                curveToRelative(-0.449f, 0.222f, -0.851f, 0.628f, -0.998f, 1.189f)
                lineToRelative(-0.289f, 1.105f)
                curveToRelative(-0.029f, 0.11f, -0.101f, 0.143f, -0.137f, 0.146f)
                arcToRelative(6.613f, 6.613f, 0.0f, false, true, -1.142f, 0.0f)
                curveToRelative(-0.036f, -0.003f, -0.108f, -0.037f, -0.137f, -0.146f)
                lineToRelative(-0.289f, -1.105f)
                curveToRelative(-0.147f, -0.56f, -0.55f, -0.967f, -0.997f, -1.189f)
                arcToRelative(4.502f, 4.502f, 0.0f, false, true, -0.501f, -0.29f)
                curveToRelative(-0.417f, -0.278f, -0.97f, -0.423f, -1.53f, -0.27f)
                lineToRelative(-1.102f, 0.303f)
                curveToRelative(-0.11f, 0.03f, -0.175f, -0.016f, -0.195f, -0.046f)
                arcToRelative(6.492f, 6.492f, 0.0f, false, true, -0.573f, -0.989f)
                curveToRelative(-0.014f, -0.031f, -0.022f, -0.11f, 0.059f, -0.19f)
                lineToRelative(0.815f, -0.806f)
                curveToRelative(0.411f, -0.406f, 0.562f, -0.957f, 0.53f, -1.456f)
                arcToRelative(4.587f, 4.587f, 0.0f, false, true, 0.0f, -0.582f)
                curveToRelative(0.032f, -0.499f, -0.119f, -1.05f, -0.53f, -1.456f)
                lineToRelative(-0.815f, -0.806f)
                curveToRelative(-0.08f, -0.08f, -0.073f, -0.159f, -0.059f, -0.19f)
                arcToRelative(6.44f, 6.44f, 0.0f, false, true, 0.573f, -0.99f)
                curveToRelative(0.02f, -0.029f, 0.086f, -0.075f, 0.195f, -0.045f)
                lineToRelative(1.103f, 0.303f)
                curveToRelative(0.559f, 0.153f, 1.112f, 0.008f, 1.529f, -0.27f)
                curveToRelative(0.16f, -0.107f, 0.327f, -0.204f, 0.5f, -0.29f)
                curveToRelative(0.449f, -0.222f, 0.851f, -0.628f, 0.998f, -1.189f)
                lineToRelative(0.289f, -1.105f)
                curveToRelative(0.029f, -0.11f, 0.101f, -0.143f, 0.137f, -0.146f)
                close()
                moveTo(8.0f, 0.0f)
                curveToRelative(-0.236f, 0.0f, -0.47f, 0.01f, -0.701f, 0.03f)
                curveToRelative(-0.743f, 0.065f, -1.29f, 0.615f, -1.458f, 1.261f)
                lineToRelative(-0.29f, 1.106f)
                curveToRelative(-0.017f, 0.066f, -0.078f, 0.158f, -0.211f, 0.224f)
                arcToRelative(5.994f, 5.994f, 0.0f, false, false, -0.668f, 0.386f)
                curveToRelative(-0.123f, 0.082f, -0.233f, 0.09f, -0.3f, 0.071f)
                lineTo(3.27f, 2.776f)
                curveToRelative(-0.644f, -0.177f, -1.392f, 0.02f, -1.82f, 0.63f)
                arcToRelative(7.977f, 7.977f, 0.0f, false, false, -0.704f, 1.217f)
                curveToRelative(-0.315f, 0.675f, -0.111f, 1.422f, 0.363f, 1.891f)
                lineToRelative(0.815f, 0.806f)
                curveToRelative(0.05f, 0.048f, 0.098f, 0.147f, 0.088f, 0.294f)
                arcToRelative(6.084f, 6.084f, 0.0f, false, false, 0.0f, 0.772f)
                curveToRelative(0.01f, 0.147f, -0.038f, 0.246f, -0.088f, 0.294f)
                lineToRelative(-0.815f, 0.806f)
                curveToRelative(-0.474f, 0.469f, -0.678f, 1.216f, -0.363f, 1.891f)
                curveToRelative(0.2f, 0.428f, 0.436f, 0.835f, 0.704f, 1.218f)
                curveToRelative(0.428f, 0.609f, 1.176f, 0.806f, 1.82f, 0.63f)
                lineToRelative(1.103f, -0.303f)
                curveToRelative(0.066f, -0.019f, 0.176f, -0.011f, 0.299f, 0.071f)
                curveToRelative(0.213f, 0.143f, 0.436f, 0.272f, 0.668f, 0.386f)
                curveToRelative(0.133f, 0.066f, 0.194f, 0.158f, 0.212f, 0.224f)
                lineToRelative(0.289f, 1.106f)
                curveToRelative(0.169f, 0.646f, 0.715f, 1.196f, 1.458f, 1.26f)
                arcToRelative(8.094f, 8.094f, 0.0f, false, false, 1.402f, 0.0f)
                curveToRelative(0.743f, -0.064f, 1.29f, -0.614f, 1.458f, -1.26f)
                lineToRelative(0.29f, -1.106f)
                curveToRelative(0.017f, -0.066f, 0.078f, -0.158f, 0.211f, -0.224f)
                arcToRelative(5.98f, 5.98f, 0.0f, false, false, 0.668f, -0.386f)
                curveToRelative(0.123f, -0.082f, 0.233f, -0.09f, 0.3f, -0.071f)
                lineToRelative(1.102f, 0.302f)
                curveToRelative(0.644f, 0.177f, 1.392f, -0.02f, 1.82f, -0.63f)
                curveToRelative(0.268f, -0.382f, 0.505f, -0.789f, 0.704f, -1.217f)
                curveToRelative(0.315f, -0.675f, 0.111f, -1.422f, -0.364f, -1.891f)
                lineToRelative(-0.814f, -0.806f)
                curveToRelative(-0.05f, -0.048f, -0.098f, -0.147f, -0.088f, -0.294f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -0.772f)
                curveToRelative(-0.01f, -0.147f, 0.039f, -0.246f, 0.088f, -0.294f)
                lineToRelative(0.814f, -0.806f)
                curveToRelative(0.475f, -0.469f, 0.679f, -1.216f, 0.364f, -1.891f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, false, -0.704f, -1.218f)
                curveToRelative(-0.428f, -0.609f, -1.176f, -0.806f, -1.82f, -0.63f)
                lineToRelative(-1.103f, 0.303f)
                curveToRelative(-0.066f, 0.019f, -0.176f, 0.011f, -0.299f, -0.071f)
                arcToRelative(5.991f, 5.991f, 0.0f, false, false, -0.668f, -0.386f)
                curveToRelative(-0.133f, -0.066f, -0.194f, -0.158f, -0.212f, -0.224f)
                lineTo(10.16f, 1.29f)
                curveTo(9.99f, 0.645f, 9.444f, 0.095f, 8.701f, 0.031f)
                arcTo(8.094f, 8.094f, 0.0f, false, false, 8.0f, 0.0f)
                close()
                moveTo(9.5f, 8.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 3.0f, 0.0f)
                close()
                moveTo(11.0f, 8.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                close()
            }
        }
        .build()
        return _gear16!!
    }

private var _gear16: ImageVector? = null
