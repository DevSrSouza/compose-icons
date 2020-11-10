package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.ApplePay: VectorAsset
    get() {
        if (_applePay != null) {
            return _applePay!!
        }
        _applePay = VectorAssetBuilder(name = "ApplePay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.388f, 8.284f)
                curveToRelative(-0.282f, 0.337f, -0.732f, 0.602f, -1.182f, 0.564f)
                curveToRelative(-0.056f, -0.455f, 0.164f, -0.938f, 0.422f, -1.237f)
                curveTo(3.91f, 7.265f, 4.402f, 7.02f, 4.8f, 7.0f)
                curveToRelative(0.047f, 0.474f, -0.136f, 0.938f, -0.412f, 1.284f)
                close()
                moveTo(4.795f, 8.938f)
                curveToRelative(-0.651f, -0.038f, -1.21f, 0.375f, -1.518f, 0.375f)
                curveToRelative(-0.315f, 0.0f, -0.788f, -0.356f, -1.304f, -0.346f)
                curveToRelative(-0.67f, 0.01f, -1.293f, 0.393f, -1.635f, 1.005f)
                curveTo(-0.366f, 11.194f, 0.155f, 13.005f, 0.834f, 14.0f)
                curveToRelative(0.333f, 0.493f, 0.732f, 1.033f, 1.257f, 1.014f)
                curveToRelative(0.496f, -0.019f, 0.693f, -0.327f, 1.293f, -0.327f)
                curveToRelative(0.605f, 0.0f, 0.778f, 0.327f, 1.304f, 0.318f)
                curveToRelative(0.543f, -0.01f, 0.885f, -0.493f, 1.218f, -0.986f)
                curveToRelative(0.38f, -0.56f, 0.535f, -1.104f, 0.544f, -1.133f)
                curveToRelative(-0.01f, -0.01f, -1.05f, -0.412f, -1.06f, -1.625f)
                curveToRelative(-0.009f, -1.015f, 0.82f, -1.498f, 0.858f, -1.526f)
                curveToRelative(-0.468f, -0.702f, -1.2f, -0.778f, -1.453f, -0.797f)
                close()
                moveTo(8.56f, 7.564f)
                verticalLineToRelative(7.389f)
                horizontalLineToRelative(1.135f)
                verticalLineToRelative(-2.526f)
                horizontalLineToRelative(1.57f)
                curveToRelative(1.434f, 0.0f, 2.442f, -0.996f, 2.442f, -2.436f)
                curveToRelative(0.0f, -1.441f, -0.989f, -2.427f, -2.404f, -2.427f)
                lineTo(8.559f, 7.564f)
                close()
                moveTo(9.695f, 8.531f)
                horizontalLineToRelative(1.308f)
                curveToRelative(0.984f, 0.0f, 1.546f, 0.53f, 1.546f, 1.464f)
                curveToRelative(0.0f, 0.934f, -0.562f, 1.47f, -1.551f, 1.47f)
                lineTo(9.694f, 11.465f)
                lineTo(9.694f, 8.53f)
                close()
                moveTo(15.779f, 15.009f)
                curveToRelative(0.713f, 0.0f, 1.374f, -0.364f, 1.674f, -0.943f)
                horizontalLineToRelative(0.023f)
                verticalLineToRelative(0.887f)
                horizontalLineToRelative(1.05f)
                verticalLineToRelative(-3.678f)
                curveToRelative(0.0f, -1.066f, -0.844f, -1.754f, -2.142f, -1.754f)
                curveToRelative(-1.205f, 0.0f, -2.095f, 0.697f, -2.128f, 1.654f)
                horizontalLineToRelative(1.022f)
                curveToRelative(0.084f, -0.455f, 0.501f, -0.753f, 1.073f, -0.753f)
                curveToRelative(0.694f, 0.0f, 1.083f, 0.327f, 1.083f, 0.929f)
                verticalLineToRelative(0.407f)
                lineToRelative(-1.416f, 0.086f)
                curveToRelative(-1.317f, 0.08f, -2.03f, 0.625f, -2.03f, 1.573f)
                curveToRelative(0.0f, 0.957f, 0.736f, 1.592f, 1.791f, 1.592f)
                close()
                moveTo(16.084f, 14.133f)
                curveToRelative(-0.605f, 0.0f, -0.99f, -0.294f, -0.99f, -0.744f)
                curveToRelative(0.0f, -0.465f, 0.371f, -0.735f, 1.079f, -0.778f)
                lineToRelative(1.26f, -0.08f)
                verticalLineToRelative(0.417f)
                curveToRelative(0.0f, 0.692f, -0.58f, 1.185f, -1.35f, 1.185f)
                close()
                moveTo(19.928f, 16.963f)
                curveToRelative(1.106f, 0.0f, 1.626f, -0.427f, 2.08f, -1.721f)
                lineTo(24.0f, 9.592f)
                horizontalLineToRelative(-1.153f)
                lineToRelative(-1.336f, 4.365f)
                horizontalLineToRelative(-0.023f)
                lineToRelative(-1.336f, -4.365f)
                horizontalLineToRelative(-1.186f)
                lineToRelative(1.921f, 5.38f)
                lineToRelative(-0.103f, 0.327f)
                curveToRelative(-0.173f, 0.554f, -0.454f, 0.767f, -0.956f, 0.767f)
                curveToRelative(-0.089f, 0.0f, -0.262f, -0.01f, -0.333f, -0.019f)
                verticalLineToRelative(0.887f)
                curveToRelative(0.066f, 0.019f, 0.347f, 0.028f, 0.432f, 0.028f)
                close()
            }
        }
        .build()
        return _applePay!!
    }

private var _applePay: VectorAsset? = null
