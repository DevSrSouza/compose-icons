package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Copilot16: ImageVector
    get() {
        if (_copilot16 != null) {
            return _copilot16!!
        }
        _copilot16 = Builder(name = "Copilot16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 9.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 6.25f, 9.0f)
                close()
                moveTo(10.5f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-1.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.86f, 1.77f)
                curveToRelative(0.05f, 0.053f, 0.097f, 0.107f, 0.14f, 0.164f)
                curveToRelative(0.043f, -0.057f, 0.09f, -0.111f, 0.14f, -0.164f)
                curveToRelative(0.681f, -0.731f, 1.737f, -0.9f, 2.943f, -0.765f)
                curveToRelative(1.23f, 0.136f, 2.145f, 0.527f, 2.724f, 1.26f)
                curveToRelative(0.566f, 0.716f, 0.693f, 1.614f, 0.693f, 2.485f)
                curveToRelative(0.0f, 0.572f, -0.053f, 1.147f, -0.254f, 1.655f)
                lineToRelative(0.168f, 0.838f)
                lineToRelative(0.066f, 0.033f)
                arcTo(2.75f, 2.75f, 0.0f, false, true, 16.0f, 9.736f)
                lineTo(16.0f, 11.0f)
                curveToRelative(0.0f, 0.24f, -0.086f, 0.438f, -0.156f, 0.567f)
                curveToRelative(-0.073f, 0.131f, -0.16f, 0.253f, -0.259f, 0.366f)
                curveToRelative(-0.18f, 0.21f, -0.404f, 0.413f, -0.605f, 0.58f)
                arcToRelative(10.19f, 10.19f, 0.0f, false, true, -0.792f, 0.597f)
                lineToRelative(-0.015f, 0.01f)
                lineToRelative(-0.006f, 0.004f)
                lineToRelative(-0.028f, 0.018f)
                arcToRelative(8.849f, 8.849f, 0.0f, false, true, -0.456f, 0.281f)
                curveToRelative(-0.307f, 0.177f, -0.749f, 0.41f, -1.296f, 0.642f)
                curveTo(11.296f, 14.528f, 9.756f, 15.0f, 8.0f, 15.0f)
                curveToRelative(-1.756f, 0.0f, -3.296f, -0.472f, -4.387f, -0.935f)
                arcToRelative(12.28f, 12.28f, 0.0f, false, true, -1.296f, -0.641f)
                arcToRelative(8.849f, 8.849f, 0.0f, false, true, -0.456f, -0.281f)
                lineToRelative(-0.028f, -0.02f)
                lineToRelative(-0.006f, -0.003f)
                lineToRelative(-0.015f, -0.01f)
                arcToRelative(10.593f, 10.593f, 0.0f, false, true, -0.792f, -0.596f)
                arcToRelative(5.264f, 5.264f, 0.0f, false, true, -0.605f, -0.58f)
                arcToRelative(2.133f, 2.133f, 0.0f, false, true, -0.259f, -0.367f)
                arcTo(1.189f, 1.189f, 0.0f, false, true, 0.0f, 11.0f)
                lineTo(0.0f, 9.736f)
                arcToRelative(2.75f, 2.75f, 0.0f, false, true, 1.52f, -2.46f)
                lineToRelative(0.067f, -0.033f)
                lineToRelative(0.167f, -0.838f)
                curveTo(1.553f, 5.897f, 1.5f, 5.322f, 1.5f, 4.75f)
                curveToRelative(0.0f, -0.87f, 0.127f, -1.77f, 0.693f, -2.485f)
                curveToRelative(0.579f, -0.733f, 1.494f, -1.124f, 2.724f, -1.26f)
                curveToRelative(1.206f, -0.134f, 2.262f, 0.034f, 2.944f, 0.765f)
                close()
                moveTo(3.0f, 7.824f)
                verticalLineToRelative(4.261f)
                curveToRelative(0.02f, 0.013f, 0.043f, 0.025f, 0.065f, 0.038f)
                curveToRelative(0.264f, 0.152f, 0.65f, 0.356f, 1.134f, 0.562f)
                curveToRelative(0.972f, 0.412f, 2.307f, 0.815f, 3.801f, 0.815f)
                curveToRelative(1.494f, 0.0f, 2.83f, -0.403f, 3.8f, -0.815f)
                curveToRelative(0.412f, -0.174f, 0.813f, -0.375f, 1.2f, -0.6f)
                verticalLineToRelative(-4.26f)
                lineToRelative(-0.023f, -0.116f)
                curveToRelative(-0.49f, 0.21f, -1.075f, 0.291f, -1.727f, 0.291f)
                curveToRelative(-1.146f, 0.0f, -2.06f, -0.328f, -2.71f, -0.991f)
                arcTo(3.233f, 3.233f, 0.0f, false, true, 8.0f, 6.266f)
                curveToRelative(-0.144f, 0.269f, -0.321f, 0.52f, -0.54f, 0.743f)
                curveTo(6.81f, 7.672f, 5.896f, 8.0f, 4.75f, 8.0f)
                curveToRelative(-0.652f, 0.0f, -1.236f, -0.082f, -1.726f, -0.291f)
                lineTo(3.0f, 7.824f)
                close()
                moveTo(9.237f, 2.793f)
                curveToRelative(-0.204f, 0.218f, -0.359f, 0.678f, -0.242f, 1.614f)
                curveToRelative(0.091f, 0.726f, 0.303f, 1.23f, 0.618f, 1.553f)
                curveToRelative(0.299f, 0.304f, 0.784f, 0.54f, 1.638f, 0.54f)
                curveToRelative(0.922f, 0.0f, 1.28f, -0.199f, 1.442f, -0.38f)
                curveToRelative(0.179f, -0.2f, 0.308f, -0.578f, 0.308f, -1.37f)
                curveToRelative(0.0f, -0.765f, -0.123f, -1.242f, -0.37f, -1.555f)
                curveToRelative(-0.233f, -0.296f, -0.693f, -0.586f, -1.713f, -0.7f)
                curveToRelative(-1.044f, -0.116f, -1.488f, 0.091f, -1.681f, 0.298f)
                close()
                moveTo(6.765f, 2.793f)
                curveToRelative(-0.193f, -0.207f, -0.637f, -0.414f, -1.681f, -0.298f)
                curveToRelative(-1.02f, 0.114f, -1.48f, 0.404f, -1.713f, 0.7f)
                curveToRelative(-0.247f, 0.313f, -0.37f, 0.79f, -0.37f, 1.555f)
                curveToRelative(0.0f, 0.792f, 0.129f, 1.17f, 0.308f, 1.37f)
                curveToRelative(0.162f, 0.181f, 0.52f, 0.38f, 1.442f, 0.38f)
                curveToRelative(0.854f, 0.0f, 1.339f, -0.236f, 1.638f, -0.54f)
                curveToRelative(0.315f, -0.323f, 0.527f, -0.827f, 0.618f, -1.553f)
                curveToRelative(0.117f, -0.936f, -0.038f, -1.396f, -0.242f, -1.614f)
                close()
            }
        }
        .build()
        return _copilot16!!
    }

private var _copilot16: ImageVector? = null
