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

public val SimpleIcons.Tiddlywiki: ImageVector
    get() {
        if (_tiddlywiki != null) {
            return _tiddlywiki!!
        }
        _tiddlywiki = Builder(name = "Tiddlywiki", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                lineToRelative(10.23f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.77f, 18.0f)
                lineTo(1.77f, 6.0f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(15.961f, 17.889f)
                lineTo(16.115f, 17.869f)
                curveToRelative(0.113f, -0.043f, 0.22f, -0.081f, 0.288f, -0.19f)
                curveToRelative(0.227f, -0.329f, -0.357f, -0.462f, -0.566f, -0.827f)
                curveToRelative(-0.209f, -0.364f, -1.071f, -2.364f, -0.418f, -2.924f)
                reflectiveCurveToRelative(1.359f, -0.79f, 1.629f, -1.315f)
                curveToRelative(0.117f, -0.236f, 0.238f, -0.475f, 0.269f, -0.742f)
                curveToRelative(0.159f, 0.132f, 0.283f, 0.255f, 0.497f, 0.262f)
                curveToRelative(0.567f, 0.036f, 1.054f, -0.658f, 1.307f, -1.315f)
                curveToRelative(0.135f, -0.404f, 0.244f, -0.832f, 0.218f, -1.226f)
                curveToRelative(-0.069f, -0.76f, 0.013f, -1.582f, 0.62f, -2.087f)
                curveToRelative(-0.599f, 0.302f, -1.167f, 0.69f, -1.845f, 0.789f)
                curveToRelative(-0.374f, -0.114f, -0.75f, -0.216f, -1.147f, -0.2f)
                curveToRelative(-0.194f, -0.253f, -0.456f, -0.727f, -0.797f, -0.782f)
                curveToRelative(-0.58f, 0.208f, -0.597f, 1.105f, -0.842f, 2.321f)
                arcToRelative(5.351f, 5.351f, 0.0f, false, false, -1.154f, -0.193f)
                curveToRelative(-0.54f, -0.035f, -1.42f, 0.134f, -2.038f, 0.116f)
                curveToRelative(-0.619f, -0.018f, -1.836f, -0.562f, -2.849f, -0.445f)
                curveToRelative(-0.407f, 0.05f, -0.817f, 0.12f, -1.195f, 0.291f)
                curveToRelative(-0.231f, 0.105f, -0.565f, 0.421f, -0.733f, 0.468f)
                curveToRelative(-1.69f, 0.473f, -4.442f, 0.453f, -3.879f, -2.102f)
                curveToRelative(0.044f, -0.196f, 0.056f, -0.373f, -0.03f, -0.417f)
                curveToRelative(-0.11f, -0.055f, -0.17f, 0.06f, -0.234f, 0.187f)
                curveToRelative(-0.985f, 2.138f, 0.764f, 3.514f, 2.752f, 3.52f)
                curveToRelative(0.625f, -0.048f, 0.324f, -0.007f, 0.904f, -0.118f)
                lineToRelative(-0.015f, 0.082f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, 0.865f, 1.718f)
                curveToRelative(-0.27f, 0.771f, -0.805f, 1.389f, -1.173f, 2.097f)
                curveToRelative(0.138f, 0.881f, 1.031f, 2.057f, 1.4f, 2.225f)
                curveToRelative(0.326f, 0.147f, 1.036f, 0.149f, 1.2f, -0.089f)
                curveToRelative(0.059f, -0.111f, 0.02f, -0.351f, -0.044f, -0.474f)
                curveToRelative(0.277f, 0.308f, 0.651f, 0.736f, 1.013f, 0.942f)
                curveToRelative(0.217f, 0.104f, 0.434f, 0.17f, 0.677f, 0.18f)
                lineToRelative(0.31f, -0.016f)
                curveToRelative(0.154f, -0.033f, 0.336f, -0.058f, 0.44f, -0.195f)
                curveToRelative(0.116f, -0.2f, 0.007f, -0.756f, -0.476f, -0.796f)
                curveToRelative(-0.483f, -0.04f, -0.795f, -0.222f, -1.24f, -0.882f)
                curveToRelative(-0.365f, -0.638f, 0.077f, -1.517f, 0.226f, -2.145f)
                curveToRelative(0.765f, 0.123f, 1.535f, 0.22f, 2.31f, 0.222f)
                curveToRelative(0.336f, -0.017f, 0.67f, -0.03f, 1.001f, -0.093f)
                curveToRelative(0.106f, 0.27f, 0.402f, 1.025f, 0.404f, 1.239f)
                curveToRelative(0.007f, 0.601f, -0.219f, 1.205f, -0.121f, 1.807f)
                curveToRelative(0.06f, 0.177f, 0.005f, 0.512f, 0.35f, 0.526f)
                lineToRelative(0.388f, 0.018f)
                lineToRelative(0.267f, -0.008f)
                curveToRelative(0.341f, 0.573f, 0.637f, 0.572f, 1.307f, 0.591f)
                close()
                moveTo(8.443f, 16.229f)
                lineTo(8.38f, 16.173f)
                curveToRelative(-0.184f, -0.198f, -0.66f, -0.544f, -0.572f, -0.865f)
                curveToRelative(0.075f, -0.238f, 0.213f, -0.457f, 0.323f, -0.683f)
                lineToRelative(-0.004f, 0.023f)
                curveToRelative(-0.02f, 0.282f, -0.059f, 0.56f, 0.032f, 0.837f)
                curveToRelative(0.278f, 0.228f, 0.663f, 0.59f, 0.918f, 0.837f)
                curveToRelative(-0.138f, -0.038f, -0.4f, -0.117f, -0.53f, -0.066f)
                lineToRelative(-0.104f, -0.026f)
                close()
            }
        }
        .build()
        return _tiddlywiki!!
    }

private var _tiddlywiki: ImageVector? = null
