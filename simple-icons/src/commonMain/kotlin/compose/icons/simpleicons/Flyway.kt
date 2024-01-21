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

public val SimpleIcons.Flyway: ImageVector
    get() {
        if (_flyway != null) {
            return _flyway!!
        }
        _flyway = Builder(name = "Flyway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.02f, 21.055f)
                lineToRelative(1.12f, -0.23f)
                curveToRelative(1.054f, -0.219f, 2.114f, -0.415f, 3.161f, -0.66f)
                arcToRelative(4.955f, 4.952f, 0.0f, false, false, 3.696f, -3.915f)
                arcToRelative(6.06f, 6.057f, 0.0f, false, false, 0.085f, -1.153f)
                lineToRelative(0.366f, -0.09f)
                arcToRelative(4.936f, 4.933f, 0.0f, false, false, 3.75f, -3.717f)
                arcToRelative(3.8f, 3.798f, 0.0f, false, false, 0.128f, -1.06f)
                curveToRelative(-0.002f, -0.096f, 0.0f, -0.193f, 0.0f, -0.305f)
                curveToRelative(0.094f, -0.023f, 0.18f, -0.047f, 0.267f, -0.067f)
                arcToRelative(4.552f, 4.549f, 0.0f, false, false, 2.68f, -1.755f)
                arcToRelative(5.772f, 5.769f, 0.0f, false, false, 1.005f, -4.854f)
                curveToRelative(-0.021f, -0.088f, -0.035f, -0.179f, -0.061f, -0.264f)
                arcToRelative(0.63f, 0.629f, 0.0f, false, false, -0.728f, -0.432f)
                lineToRelative(-3.184f, 0.652f)
                lineToRelative(-3.485f, 0.716f)
                lineToRelative(-4.002f, 0.822f)
                quadToRelative(-2.186f, 0.449f, -4.373f, 0.893f)
                arcToRelative(1.125f, 1.125f, 0.0f, false, true, -0.422f, 0.06f)
                curveToRelative(-0.007f, -0.074f, -0.017f, -0.14f, -0.017f, -0.204f)
                curveToRelative(-0.001f, -1.12f, 0.002f, -2.243f, -0.005f, -3.364f)
                arcToRelative(0.324f, 0.324f, 0.0f, false, true, 0.174f, -0.307f)
                arcToRelative(8.493f, 8.488f, 0.0f, false, true, 1.9f, -0.86f)
                arcTo(17.205f, 17.194f, 0.0f, false, true, 7.827f, 0.315f)
                curveTo(8.373f, 0.23f, 8.922f, 0.181f, 9.47f, 0.12f)
                arcToRelative(26.795f, 26.777f, 0.0f, false, true, 3.526f, -0.102f)
                curveToRelative(0.496f, 0.01f, 0.992f, 0.051f, 1.487f, 0.097f)
                curveToRelative(0.542f, 0.051f, 1.085f, 0.11f, 1.623f, 0.192f)
                arcToRelative(14.482f, 14.472f, 0.0f, false, true, 4.007f, 1.124f)
                curveToRelative(0.262f, 0.123f, 0.509f, 0.28f, 0.764f, 0.422f)
                arcToRelative(0.215f, 0.215f, 0.0f, false, true, 0.122f, 0.223f)
                curveToRelative(-0.004f, 0.054f, 0.0f, 0.11f, 0.0f, 0.163f)
                verticalLineToRelative(19.519f)
                curveToRelative(0.0f, 0.347f, 0.045f, 0.28f, -0.262f, 0.472f)
                arcToRelative(8.437f, 8.432f, 0.0f, false, true, -1.961f, 0.857f)
                arcToRelative(16.78f, 16.769f, 0.0f, false, true, -2.851f, 0.63f)
                curveToRelative(-0.6f, 0.08f, -1.2f, 0.146f, -1.804f, 0.207f)
                curveToRelative(-0.277f, 0.03f, -0.556f, 0.035f, -0.835f, 0.043f)
                curveToRelative(-0.564f, 0.015f, -1.128f, 0.041f, -1.691f, 0.03f)
                curveToRelative(-0.636f, -0.014f, -1.272f, -0.059f, -1.907f, -0.099f)
                arcToRelative(20.054f, 20.041f, 0.0f, false, true, -2.519f, -0.332f)
                arcToRelative(13.423f, 13.415f, 0.0f, false, true, -3.224f, -0.976f)
                curveToRelative(-0.273f, -0.13f, -0.53f, -0.29f, -0.797f, -0.435f)
                arcToRelative(0.246f, 0.246f, 0.0f, false, true, -0.144f, -0.248f)
                curveToRelative(0.008f, -0.23f, 0.0f, -0.46f, 0.003f, -0.69f)
                curveToRelative(0.0f, -0.049f, 0.01f, -0.096f, 0.016f, -0.163f)
                close()
                moveTo(13.005f, 10.403f)
                arcToRelative(1.248f, 1.248f, 0.0f, false, true, -0.09f, 0.55f)
                arcToRelative(2.624f, 2.622f, 0.0f, false, true, -2.045f, 1.84f)
                curveToRelative(-1.3f, 0.28f, -2.607f, 0.537f, -3.912f, 0.805f)
                lineToRelative(-0.57f, 0.114f)
                arcToRelative(1.147f, 1.146f, 0.0f, true, false, 0.403f, 2.256f)
                curveToRelative(0.595f, -0.11f, 1.186f, -0.242f, 1.779f, -0.363f)
                curveToRelative(0.064f, -0.014f, 0.128f, -0.022f, 0.209f, -0.035f)
                arcToRelative(2.584f, 2.582f, 0.0f, false, true, -0.55f, 1.41f)
                arcTo(2.801f, 2.8f, 0.0f, false, true, 6.516f, 18.0f)
                curveToRelative(-1.103f, 0.223f, -2.206f, 0.45f, -3.308f, 0.676f)
                curveToRelative(-0.052f, 0.01f, -0.106f, 0.013f, -0.156f, 0.02f)
                curveToRelative(-0.048f, -0.146f, -0.061f, -10.38f, -0.014f, -10.63f)
                lineToRelative(14.048f, -2.883f)
                arcToRelative(1.523f, 1.522f, 0.0f, false, true, -0.016f, 0.18f)
                arcToRelative(3.438f, 3.436f, 0.0f, false, true, -0.738f, 1.502f)
                arcToRelative(2.399f, 2.397f, 0.0f, false, true, -1.426f, 0.804f)
                curveToRelative(-1.11f, 0.216f, -2.218f, 0.45f, -3.326f, 0.677f)
                lineToRelative(-0.96f, 0.196f)
                arcToRelative(1.168f, 1.168f, 0.0f, false, false, -0.953f, 1.057f)
                arcToRelative(1.147f, 1.147f, 0.0f, false, false, 0.875f, 1.186f)
                arcToRelative(1.747f, 1.746f, 0.0f, false, false, 0.807f, -0.054f)
                curveToRelative(0.492f, -0.1f, 0.983f, -0.203f, 1.475f, -0.304f)
                curveToRelative(0.053f, -0.01f, 0.108f, -0.014f, 0.18f, -0.023f)
                close()
            }
        }
        .build()
        return _flyway!!
    }

private var _flyway: ImageVector? = null
