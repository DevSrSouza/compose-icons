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

public val SimpleIcons.Misskey: ImageVector
    get() {
        if (_misskey != null) {
            return _misskey!!
        }
        _misskey = Builder(name = "Misskey", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9108f, 16.8915f)
                curveToRelative(-1.0396f, 0.0038f, -1.9321f, -0.6294f, -2.3527f, -1.366f)
                curveToRelative(-0.2252f, -0.3217f, -0.6699f, -0.4364f, -0.6761f, 0.0f)
                verticalLineToRelative(2.0148f)
                curveToRelative(0.0f, 0.8094f, -0.2915f, 1.5097f, -0.8758f, 2.1002f)
                curveToRelative(-0.5676f, 0.573f, -1.2598f, 0.8595f, -2.0779f, 0.8595f)
                curveToRelative(-0.8001f, 0.0f, -1.493f, -0.2865f, -2.0773f, -0.8601f)
                curveTo(0.2841f, 19.05f, 0.0f, 18.3497f, 0.0f, 17.5403f)
                lineTo(0.0f, 6.4597f)
                curveToRelative(0.0f, -0.6238f, 0.1755f, -1.1886f, 0.526f, -1.6946f)
                curveToRelative(0.3666f, -0.5228f, 0.8343f, -0.8858f, 1.4018f, -1.0877f)
                arcToRelative(2.8457f, 2.8457f, 0.0f, false, true, 1.0005f, -0.1774f)
                curveToRelative(0.9013f, 0.0f, 1.6524f, 0.3542f, 2.2528f, 1.0626f)
                lineToRelative(2.9971f, 3.5157f)
                curveToRelative(0.067f, 0.0502f, 0.263f, 0.437f, 0.7319f, 0.437f)
                curveToRelative(0.4702f, 0.0f, 0.6916f, -0.3868f, 0.758f, -0.4376f)
                lineToRelative(2.9717f, -3.5151f)
                curveToRelative(0.6178f, -0.7084f, 1.377f, -1.0626f, 2.2782f, -1.0626f)
                curveToRelative(0.3337f, 0.0f, 0.6675f, 0.0589f, 1.0012f, 0.1774f)
                curveToRelative(0.5669f, 0.2019f, 1.0259f, 0.5642f, 1.377f, 1.0877f)
                curveToRelative(0.3665f, 0.5059f, 0.5501f, 1.0708f, 0.5501f, 1.6946f)
                lineTo(17.8463f, 17.5403f)
                curveToRelative(0.0f, 0.8094f, -0.2915f, 1.5097f, -0.8758f, 2.1002f)
                curveToRelative(-0.5675f, 0.573f, -1.2604f, 0.8595f, -2.0779f, 0.8595f)
                curveToRelative(-0.8008f, 0.0f, -1.493f, -0.2865f, -2.0779f, -0.8601f)
                curveToRelative(-0.5669f, -0.5899f, -0.8504f, -1.2902f, -0.8504f, -2.0996f)
                verticalLineToRelative(-2.0148f)
                curveToRelative(-0.0496f, -0.5499f, -0.5303f, -0.2032f, -0.7009f, 0.0f)
                curveToRelative(-0.4503f, 0.8431f, -1.3137f, 1.3616f, -2.3526f, 1.366f)
                close()
                moveTo(21.447f, 8.61f)
                curveToRelative(-0.7009f, 0.0f, -1.3015f, -0.2445f, -1.8019f, -0.7335f)
                curveToRelative(-0.4838f, -0.5057f, -0.7257f, -1.1128f, -0.7257f, -1.8212f)
                reflectiveCurveToRelative(0.2419f, -1.3071f, 0.7257f, -1.7961f)
                curveToRelative(0.5004f, -0.5057f, 1.101f, -0.7586f, 1.8019f, -0.7586f)
                curveToRelative(0.7009f, 0.0f, 1.3017f, 0.2528f, 1.8025f, 0.7586f)
                curveToRelative(0.5003f, 0.489f, 0.7505f, 1.0877f, 0.7505f, 1.7961f)
                curveToRelative(0.0f, 0.7084f, -0.2502f, 1.3155f, -0.7505f, 1.8212f)
                curveToRelative(-0.5008f, 0.489f, -1.1016f, 0.7335f, -1.8025f, 0.7335f)
                close()
                moveTo(21.4718f, 9.1165f)
                curveToRelative(0.7009f, 0.0f, 1.2935f, 0.2528f, 1.7777f, 0.7586f)
                curveToRelative(0.5003f, 0.5057f, 0.7505f, 1.113f, 0.7505f, 1.8218f)
                verticalLineToRelative(6.2484f)
                curveToRelative(0.0f, 0.7084f, -0.2502f, 1.3155f, -0.7505f, 1.8212f)
                curveToRelative(-0.4838f, 0.489f, -1.0764f, 0.7335f, -1.7777f, 0.7335f)
                curveToRelative(-0.7005f, 0.0f, -1.3011f, -0.2445f, -1.8019f, -0.7335f)
                curveToRelative(-0.5003f, -0.5057f, -0.7505f, -1.1128f, -0.7505f, -1.8212f)
                verticalLineToRelative(-6.2484f)
                curveToRelative(0.0f, -0.7084f, 0.2502f, -1.3157f, 0.7505f, -1.8218f)
                curveToRelative(0.5004f, -0.5057f, 1.101f, -0.7586f, 1.8019f, -0.7586f)
                close()
            }
        }
        .build()
        return _misskey!!
    }

private var _misskey: ImageVector? = null
