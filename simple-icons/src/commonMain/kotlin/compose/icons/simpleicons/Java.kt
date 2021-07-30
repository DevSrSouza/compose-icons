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

public val SimpleIcons.Java: ImageVector
    get() {
        if (_java != null) {
            return _java!!
        }
        _java = Builder(name = "Java", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.851f, 18.56f)
                reflectiveCurveToRelative(-0.917f, 0.534f, 0.653f, 0.714f)
                curveToRelative(1.902f, 0.218f, 2.874f, 0.187f, 4.969f, -0.211f)
                curveToRelative(0.0f, 0.0f, 0.552f, 0.346f, 1.321f, 0.646f)
                curveToRelative(-4.699f, 2.013f, -10.633f, -0.118f, -6.943f, -1.149f)
                moveTo(8.276f, 15.933f)
                reflectiveCurveToRelative(-1.028f, 0.761f, 0.542f, 0.924f)
                curveToRelative(2.032f, 0.209f, 3.636f, 0.227f, 6.413f, -0.308f)
                curveToRelative(0.0f, 0.0f, 0.384f, 0.389f, 0.987f, 0.602f)
                curveToRelative(-5.679f, 1.661f, -12.007f, 0.13f, -7.942f, -1.218f)
                moveTo(13.116f, 11.475f)
                curveToRelative(1.158f, 1.333f, -0.304f, 2.533f, -0.304f, 2.533f)
                reflectiveCurveToRelative(2.939f, -1.518f, 1.589f, -3.418f)
                curveToRelative(-1.261f, -1.772f, -2.228f, -2.652f, 3.007f, -5.688f)
                curveToRelative(0.0f, -0.001f, -8.216f, 2.051f, -4.292f, 6.573f)
                moveTo(19.33f, 20.504f)
                reflectiveCurveToRelative(0.679f, 0.559f, -0.747f, 0.991f)
                curveToRelative(-2.712f, 0.822f, -11.288f, 1.069f, -13.669f, 0.033f)
                curveToRelative(-0.856f, -0.373f, 0.75f, -0.89f, 1.254f, -0.998f)
                curveToRelative(0.527f, -0.114f, 0.828f, -0.093f, 0.828f, -0.093f)
                curveToRelative(-0.953f, -0.671f, -6.156f, 1.317f, -2.643f, 1.887f)
                curveToRelative(9.58f, 1.553f, 17.462f, -0.7f, 14.977f, -1.82f)
                moveTo(9.292f, 13.21f)
                reflectiveCurveToRelative(-4.362f, 1.036f, -1.544f, 1.412f)
                curveToRelative(1.189f, 0.159f, 3.561f, 0.123f, 5.77f, -0.062f)
                curveToRelative(1.806f, -0.152f, 3.618f, -0.477f, 3.618f, -0.477f)
                reflectiveCurveToRelative(-0.637f, 0.272f, -1.098f, 0.587f)
                curveToRelative(-4.429f, 1.165f, -12.986f, 0.623f, -10.522f, -0.568f)
                curveToRelative(2.082f, -1.006f, 3.776f, -0.892f, 3.776f, -0.892f)
                moveTo(17.116f, 17.584f)
                curveToRelative(4.503f, -2.34f, 2.421f, -4.589f, 0.968f, -4.285f)
                curveToRelative(-0.355f, 0.074f, -0.515f, 0.138f, -0.515f, 0.138f)
                reflectiveCurveToRelative(0.132f, -0.207f, 0.385f, -0.297f)
                curveToRelative(2.875f, -1.011f, 5.086f, 2.981f, -0.928f, 4.562f)
                curveToRelative(0.0f, -0.001f, 0.07f, -0.062f, 0.09f, -0.118f)
                moveTo(14.401f, 0.0f)
                reflectiveCurveToRelative(2.494f, 2.494f, -2.365f, 6.33f)
                curveToRelative(-3.896f, 3.077f, -0.888f, 4.832f, -0.001f, 6.836f)
                curveToRelative(-2.274f, -2.053f, -3.943f, -3.858f, -2.824f, -5.539f)
                curveToRelative(1.644f, -2.469f, 6.197f, -3.665f, 5.19f, -7.627f)
                moveTo(9.734f, 23.924f)
                curveToRelative(4.322f, 0.277f, 10.959f, -0.153f, 11.116f, -2.198f)
                curveToRelative(0.0f, 0.0f, -0.302f, 0.775f, -3.572f, 1.391f)
                curveToRelative(-3.688f, 0.694f, -8.239f, 0.613f, -10.937f, 0.168f)
                curveToRelative(0.0f, -0.001f, 0.553f, 0.457f, 3.393f, 0.639f)
            }
        }
        .build()
        return _java!!
    }

private var _java: ImageVector? = null
