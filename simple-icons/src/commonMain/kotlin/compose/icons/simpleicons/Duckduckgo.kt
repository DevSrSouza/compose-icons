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

public val SimpleIcons.Duckduckgo: ImageVector
    get() {
        if (_duckduckgo != null) {
            return _duckduckgo!!
        }
        _duckduckgo = Builder(name = "Duckduckgo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 23.0f)
                curveTo(5.925f, 23.0f, 1.0f, 18.074f, 1.0f, 12.0f)
                reflectiveCurveTo(5.926f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveToRelative(11.0f, 4.925f, 11.0f, 11.0f)
                reflectiveCurveToRelative(-4.925f, 11.0f, -11.0f, 11.0f)
                close()
                moveTo(22.219f, 12.0f)
                curveToRelative(0.0f, 4.805f, -3.317f, 8.833f, -7.786f, 9.925f)
                curveToRelative(-0.27f, -0.521f, -0.53f, -1.017f, -0.749f, -1.438f)
                curveToRelative(0.645f, 0.249f, 1.93f, 0.718f, 2.208f, 0.615f)
                curveToRelative(0.376f, -0.144f, 0.282f, -3.149f, -0.14f, -3.245f)
                curveToRelative(-0.338f, -0.075f, -1.632f, 0.837f, -2.141f, 1.209f)
                lineToRelative(0.034f, 0.156f)
                curveToRelative(0.078f, 0.397f, 0.144f, 0.993f, 0.03f, 1.247f)
                curveToRelative(-0.001f, 0.004f, -0.002f, 0.01f, -0.004f, 0.013f)
                arcToRelative(0.218f, 0.218f, 0.0f, false, true, -0.068f, 0.088f)
                curveToRelative(-0.284f, 0.188f, -1.081f, 0.284f, -1.503f, 0.188f)
                arcToRelative(0.516f, 0.516f, 0.0f, false, true, -0.064f, -0.02f)
                curveToRelative(-0.694f, 0.396f, -2.01f, 1.109f, -2.25f, 0.971f)
                curveToRelative(-0.329f, -0.188f, -0.377f, -2.676f, -0.329f, -3.288f)
                curveToRelative(0.035f, -0.46f, 1.653f, 0.286f, 2.442f, 0.679f)
                curveToRelative(0.174f, -0.163f, 0.602f, -0.272f, 0.98f, -0.31f)
                curveToRelative(-0.57f, -1.389f, -0.99f, -2.977f, -0.733f, -4.105f)
                curveToRelative(0.0f, 0.002f, 0.002f, 0.002f, 0.002f, 0.002f)
                curveToRelative(0.356f, 0.248f, 2.73f, 1.05f, 3.91f, 1.027f)
                curveToRelative(1.18f, -0.024f, 3.114f, -0.743f, 2.903f, -1.323f)
                curveToRelative(-0.212f, -0.58f, -2.135f, 0.51f, -4.142f, 0.324f)
                curveToRelative(-1.486f, -0.138f, -1.748f, -0.804f, -1.42f, -1.29f)
                curveToRelative(0.414f, -0.611f, 1.168f, 0.116f, 2.411f, -0.256f)
                curveToRelative(1.245f, -0.371f, 2.987f, -1.035f, 3.632f, -1.397f)
                curveToRelative(1.494f, -0.833f, -0.625f, -1.177f, -1.125f, -0.947f)
                curveToRelative(-0.474f, 0.22f, -2.123f, 0.637f, -2.889f, 0.82f)
                curveToRelative(0.428f, -1.516f, -0.603f, -4.149f, -1.757f, -5.3f)
                curveToRelative(-0.376f, -0.376f, -0.951f, -0.612f, -1.603f, -0.736f)
                curveToRelative(-0.25f, -0.344f, -0.654f, -0.671f, -1.225f, -0.977f)
                arcToRelative(5.772f, 5.772f, 0.0f, false, false, -3.595f, -0.584f)
                lineToRelative(-0.024f, 0.004f)
                lineToRelative(-0.034f, 0.004f)
                lineToRelative(0.004f, 0.002f)
                curveToRelative(-0.148f, 0.028f, -0.237f, 0.08f, -0.357f, 0.098f)
                curveToRelative(0.148f, 0.016f, 0.705f, 0.276f, 1.057f, 0.418f)
                curveToRelative(-0.174f, 0.068f, -0.412f, 0.108f, -0.596f, 0.184f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, false, -0.204f, 0.056f)
                curveToRelative(-0.173f, 0.08f, -0.303f, 0.375f, -0.3f, 0.515f)
                curveToRelative(0.84f, -0.086f, 2.082f, -0.026f, 2.991f, 0.246f)
                curveToRelative(-0.644f, 0.09f, -1.235f, 0.258f, -1.661f, 0.482f)
                curveToRelative(-0.016f, 0.008f, -0.03f, 0.018f, -0.048f, 0.028f)
                curveToRelative(-0.054f, 0.02f, -0.106f, 0.042f, -0.152f, 0.066f)
                curveToRelative(-1.367f, 0.72f, -1.971f, 2.405f, -1.611f, 4.424f)
                curveToRelative(0.323f, 1.824f, 1.665f, 8.088f, 2.29f, 11.064f)
                curveToRelative(-3.973f, -1.4f, -6.822f, -5.186f, -6.822f, -9.639f)
                curveTo(1.781f, 6.356f, 6.356f, 1.781f, 12.0f, 1.781f)
                reflectiveCurveTo(22.219f, 6.356f, 22.219f, 12.0f)
                close()
                moveTo(9.095f, 9.581f)
                arcToRelative(0.758f, 0.758f, 0.0f, true, false, 0.0f, 1.516f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, false, 0.0f, -1.516f)
                close()
                moveTo(9.433f, 10.283f)
                arcToRelative(0.196f, 0.196f, 0.0f, true, true, 0.0f, -0.392f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, true, 0.0f, 0.392f)
                close()
                moveTo(14.157f, 9.24f)
                arcToRelative(0.65f, 0.65f, 0.0f, true, false, 0.0f, 1.299f)
                arcToRelative(0.65f, 0.65f, 0.0f, false, false, 0.0f, -1.3f)
                close()
                moveTo(14.447f, 9.841f)
                arcToRelative(0.168f, 0.168f, 0.0f, true, true, 0.0f, -0.336f)
                arcToRelative(0.168f, 0.168f, 0.0f, false, true, 0.0f, 0.336f)
                close()
                moveTo(9.313f, 8.146f)
                reflectiveCurveToRelative(-0.571f, -0.26f, -1.125f, 0.09f)
                curveToRelative(-0.554f, 0.348f, -0.534f, 0.704f, -0.534f, 0.704f)
                reflectiveCurveToRelative(-0.294f, -0.656f, 0.49f, -0.978f)
                curveToRelative(0.786f, -0.32f, 1.17f, 0.184f, 1.17f, 0.184f)
                close()
                moveTo(14.549f, 8.094f)
                reflectiveCurveToRelative(-0.41f, -0.234f, -0.73f, -0.23f)
                curveToRelative(-0.654f, 0.008f, -0.831f, 0.296f, -0.831f, 0.296f)
                reflectiveCurveToRelative(0.11f, -0.688f, 0.945f, -0.55f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, true, 0.616f, 0.484f)
                close()
            }
        }
        .build()
        return _duckduckgo!!
    }

private var _duckduckgo: ImageVector? = null
