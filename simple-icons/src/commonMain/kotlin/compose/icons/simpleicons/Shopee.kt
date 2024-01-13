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

public val SimpleIcons.Shopee: ImageVector
    get() {
        if (_shopee != null) {
            return _shopee!!
        }
        _shopee = Builder(name = "Shopee", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9414f, 17.9633f)
                curveToRelative(0.229f, -1.879f, -0.981f, -3.077f, -4.1758f, -4.0969f)
                curveToRelative(-1.548f, -0.528f, -2.277f, -1.22f, -2.26f, -2.1719f)
                curveToRelative(0.065f, -1.056f, 1.048f, -1.825f, 2.352f, -1.85f)
                arcToRelative(5.2898f, 5.2898f, 0.0f, false, true, 2.8838f, 0.89f)
                curveToRelative(0.116f, 0.072f, 0.197f, 0.06f, 0.263f, -0.039f)
                curveToRelative(0.09f, -0.145f, 0.315f, -0.494f, 0.39f, -0.62f)
                curveToRelative(0.051f, -0.081f, 0.061f, -0.187f, -0.068f, -0.281f)
                curveToRelative(-0.185f, -0.1369f, -0.704f, -0.4149f, -0.983f, -0.5319f)
                arcToRelative(6.4697f, 6.4697f, 0.0f, false, false, -2.5118f, -0.514f)
                curveToRelative(-1.909f, 0.008f, -3.4129f, 1.215f, -3.5389f, 2.826f)
                curveToRelative(-0.082f, 1.1629f, 0.494f, 2.1078f, 1.73f, 2.8278f)
                curveToRelative(0.262f, 0.152f, 1.6799f, 0.716f, 2.2438f, 0.892f)
                curveToRelative(1.774f, 0.552f, 2.695f, 1.5419f, 2.478f, 2.6969f)
                curveToRelative(-0.197f, 1.047f, -1.299f, 1.7239f, -2.818f, 1.7439f)
                curveToRelative(-1.2039f, -0.046f, -2.2878f, -0.537f, -3.1278f, -1.19f)
                lineToRelative(-0.141f, -0.11f)
                curveToRelative(-0.104f, -0.08f, -0.218f, -0.075f, -0.287f, 0.03f)
                curveToRelative(-0.05f, 0.077f, -0.376f, 0.547f, -0.458f, 0.67f)
                curveToRelative(-0.077f, 0.108f, -0.035f, 0.168f, 0.045f, 0.234f)
                curveToRelative(0.35f, 0.293f, 0.817f, 0.613f, 1.134f, 0.775f)
                arcToRelative(6.7097f, 6.7097f, 0.0f, false, false, 2.8289f, 0.727f)
                arcToRelative(4.9048f, 4.9048f, 0.0f, false, false, 2.0759f, -0.354f)
                curveToRelative(1.095f, -0.465f, 1.8029f, -1.394f, 1.9449f, -2.554f)
                close()
                moveTo(11.9986f, 1.4009f)
                curveToRelative(-2.068f, 0.0f, -3.7539f, 1.95f, -3.8329f, 4.3899f)
                horizontalLineToRelative(7.6657f)
                curveToRelative(-0.08f, -2.44f, -1.765f, -4.3899f, -3.8328f, -4.3899f)
                close()
                moveTo(19.8502f, 23.999f)
                lineTo(19.7702f, 24.0f)
                lineTo(3.9859f, 23.998f)
                curveToRelative(-1.074f, -0.04f, -1.863f, -0.91f, -1.971f, -1.991f)
                lineToRelative(-0.01f, -0.195f)
                lineTo(1.298f, 6.2858f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, 0.45f, -0.494f)
                horizontalLineToRelative(4.9748f)
                curveTo(6.8448f, 2.568f, 9.1607f, 0.0f, 11.9996f, 0.0f)
                curveToRelative(2.8388f, 0.0f, 5.1537f, 2.5689f, 5.2757f, 5.7898f)
                horizontalLineToRelative(4.9678f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, 0.458f, 0.483f)
                lineToRelative(-0.773f, 15.5883f)
                lineToRelative(-0.007f, 0.131f)
                curveToRelative(-0.094f, 1.094f, -0.979f, 1.9769f, -2.0709f, 2.0059f)
                close()
            }
        }
        .build()
        return _shopee!!
    }

private var _shopee: ImageVector? = null
