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

public val SimpleIcons.Juce: ImageVector
    get() {
        if (_juce != null) {
            return _juce!!
        }
        _juce = Builder(name = "Juce", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.383f, 0.0f, 0.0f, 5.383f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.383f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.383f, 12.0f, -12.0f)
                reflectiveCurveTo(18.617f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 22.402f)
                curveToRelative(-5.744f, 0.0f, -10.417f, -4.667f, -10.417f, -10.404f)
                reflectiveCurveTo(6.256f, 1.595f, 12.0f, 1.595f)
                reflectiveCurveToRelative(10.417f, 4.666f, 10.417f, 10.403f)
                reflectiveCurveTo(17.744f, 22.402f, 12.0f, 22.402f)
                close()
                moveTo(20.097f, 17.362f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, true, -2.5f, 2.572f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, -1.787f, -0.42f)
                curveToRelative(-0.97f, -1.794f, -1.75f, -3.59f, -2.468f, -5.391f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, 0.669f, -0.648f)
                curveToRelative(1.729f, 0.749f, 3.503f, 1.46f, 5.414f, 2.04f)
                arcToRelative(1.227f, 1.227f, 0.0f, false, true, 0.672f, 1.847f)
                close()
                moveTo(21.712f, 12.002f)
                curveToRelative(0.0f, 0.596f, -0.053f, 1.179f, -0.156f, 1.746f)
                arcToRelative(1.235f, 1.235f, 0.0f, false, true, -1.559f, 0.97f)
                curveToRelative(-2.01f, -0.583f, -3.87f, -1.324f, -5.687f, -2.111f)
                lineToRelative(0.002f, 0.001f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.013f, -0.93f)
                curveToRelative(1.802f, -0.713f, 3.606f, -1.48f, 5.416f, -2.437f)
                curveToRelative(0.727f, -0.385f, 1.62f, 0.04f, 1.782f, 0.846f)
                curveToRelative(0.124f, 0.619f, 0.19f, 1.26f, 0.19f, 1.915f)
                close()
                moveTo(14.865f, 19.715f)
                curveToRelative(0.383f, 0.726f, -0.04f, 1.61f, -0.842f, 1.78f)
                arcToRelative(9.67f, 9.67f, 0.0f, false, true, -2.021f, 0.212f)
                arcToRelative(9.702f, 9.702f, 0.0f, false, true, -1.607f, -0.132f)
                arcToRelative(1.233f, 1.233f, 0.0f, false, true, -0.98f, -1.56f)
                curveToRelative(0.583f, -2.003f, 1.322f, -3.854f, 2.107f, -5.666f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, 0.93f, 0.014f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.704f, 1.78f, 1.468f, 3.565f, 2.411f, 5.352f)
                close()
                moveTo(9.181f, 4.276f)
                arcToRelative(1.232f, 1.232f, 0.0f, false, true, 0.844f, -1.782f)
                arcToRelative(9.745f, 9.745f, 0.0f, false, true, 3.692f, -0.05f)
                curveToRelative(0.722f, 0.129f, 1.176f, 0.852f, 0.973f, 1.557f)
                curveToRelative(-0.585f, 2.028f, -1.33f, 3.9f, -2.125f, 5.73f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, -0.93f, -0.013f)
                horizontalLineToRelative(-0.001f)
                curveToRelative(-0.715f, -1.81f, -1.49f, -3.623f, -2.453f, -5.442f)
                close()
                moveTo(3.807f, 6.786f)
                arcToRelative(9.759f, 9.759f, 0.0f, false, true, 2.635f, -2.747f)
                arcToRelative(1.233f, 1.233f, 0.0f, false, true, 1.787f, 0.42f)
                curveToRelative(1.021f, 1.88f, 1.83f, 3.763f, 2.578f, 5.65f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, -0.668f, 0.648f)
                curveToRelative(-1.802f, -0.783f, -3.644f, -1.53f, -5.64f, -2.13f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, true, -0.692f, -1.842f)
                close()
                moveTo(10.671f, 14.009f)
                curveToRelative(-0.763f, 1.753f, -1.486f, 3.55f, -2.072f, 5.488f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, -1.838f, 0.679f)
                arcToRelative(9.77f, 9.77f, 0.0f, false, true, -2.662f, -2.53f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, 0.414f, -1.794f)
                curveToRelative(1.834f, -0.99f, 3.67f, -1.783f, 5.51f, -2.513f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, 0.648f, 0.668f)
                verticalLineToRelative(0.002f)
                close()
                moveTo(13.391f, 10.137f)
                curveToRelative(0.775f, -1.777f, 1.51f, -3.6f, 2.103f, -5.57f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, 1.85f, -0.672f)
                arcTo(9.791f, 9.791f, 0.0f, false, true, 20.0f, 6.497f)
                arcToRelative(1.23f, 1.23f, 0.0f, false, true, -0.425f, 1.779f)
                curveToRelative(-1.842f, 0.998f, -3.688f, 1.796f, -5.538f, 2.53f)
                arcToRelative(0.504f, 0.504f, 0.0f, false, true, -0.648f, -0.67f)
                close()
                moveTo(4.293f, 14.917f)
                arcToRelative(1.229f, 1.229f, 0.0f, false, true, -1.773f, -0.81f)
                arcToRelative(9.735f, 9.735f, 0.0f, false, true, -0.103f, -3.683f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, true, 1.56f, -0.981f)
                curveToRelative(2.02f, 0.584f, 3.888f, 1.328f, 5.713f, 2.119f)
                arcToRelative(0.503f, 0.503f, 0.0f, false, true, -0.014f, 0.93f)
                curveToRelative(-1.79f, 0.71f, -3.585f, 1.474f, -5.383f, 2.425f)
                close()
            }
        }
        .build()
        return _juce!!
    }

private var _juce: ImageVector? = null
