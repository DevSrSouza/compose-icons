package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.WechatLine: ImageVector
    get() {
        if (_wechatLine != null) {
            return _wechatLine!!
        }
        _wechatLine = Builder(name = "WechatLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.676f)
                verticalLineToRelative(-0.062f)
                curveToRelative(0.0f, -2.508f, 2.016f, -4.618f, 4.753f, -5.233f)
                curveTo(14.389f, 7.079f, 11.959f, 5.2f, 8.9f, 5.2f)
                curveTo(5.58f, 5.2f, 3.0f, 7.413f, 3.0f, 9.98f)
                curveToRelative(0.0f, 0.969f, 0.36f, 1.9f, 1.04f, 2.698f)
                curveToRelative(0.032f, 0.038f, 0.083f, 0.094f, 0.152f, 0.165f)
                arcToRelative(3.568f, 3.568f, 0.0f, false, true, 1.002f, 2.238f)
                arcToRelative(3.612f, 3.612f, 0.0f, false, true, 2.363f, -0.442f)
                curveToRelative(0.166f, 0.026f, 0.302f, 0.046f, 0.405f, 0.06f)
                arcTo(7.254f, 7.254f, 0.0f, false, false, 10.0f, 14.675f)
                close()
                moveTo(10.457f, 16.627f)
                arcToRelative(9.209f, 9.209f, 0.0f, false, true, -2.753f, 0.055f)
                arcToRelative(19.056f, 19.056f, 0.0f, false, true, -0.454f, -0.067f)
                arcToRelative(1.612f, 1.612f, 0.0f, false, false, -1.08f, 0.212f)
                lineToRelative(-1.904f, 1.148f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, true, -0.49f, 0.117f)
                arcToRelative(0.791f, 0.791f, 0.0f, false, true, -0.729f, -0.851f)
                lineToRelative(0.15f, -1.781f)
                arcToRelative(1.565f, 1.565f, 0.0f, false, false, -0.439f, -1.223f)
                arcToRelative(5.537f, 5.537f, 0.0f, false, true, -0.241f, -0.262f)
                curveTo(1.563f, 12.855f, 1.0f, 11.473f, 1.0f, 9.979f)
                curveTo(1.0f, 6.235f, 4.537f, 3.2f, 8.9f, 3.2f)
                curveToRelative(4.06f, 0.0f, 7.403f, 2.627f, 7.85f, 6.008f)
                curveToRelative(3.372f, 0.153f, 6.05f, 2.515f, 6.05f, 5.406f)
                curveToRelative(0.0f, 1.193f, -0.456f, 2.296f, -1.229f, 3.19f)
                curveToRelative(-0.051f, 0.06f, -0.116f, 0.13f, -0.195f, 0.21f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, -0.356f, 0.976f)
                lineToRelative(0.121f, 1.423f)
                arcToRelative(0.635f, 0.635f, 0.0f, false, true, -0.59f, 0.68f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.397f, -0.094f)
                lineToRelative(-1.543f, -0.917f)
                arcToRelative(1.322f, 1.322f, 0.0f, false, false, -0.874f, -0.169f)
                curveToRelative(-0.147f, 0.023f, -0.27f, 0.04f, -0.368f, 0.053f)
                curveToRelative(-0.316f, 0.04f, -0.64f, 0.062f, -0.969f, 0.062f)
                curveToRelative(-2.694f, 0.0f, -4.998f, -1.408f, -5.943f, -3.401f)
                close()
                moveTo(17.434f, 17.937f)
                arcToRelative(3.325f, 3.325f, 0.0f, false, true, 1.676f, 0.174f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, 0.841f, -1.502f)
                curveToRelative(0.05f, -0.05f, 0.087f, -0.09f, 0.106f, -0.112f)
                curveToRelative(0.489f, -0.565f, 0.743f, -1.213f, 0.743f, -1.883f)
                curveToRelative(0.0f, -1.804f, -1.903f, -3.414f, -4.4f, -3.414f)
                curveToRelative(-2.497f, 0.0f, -4.4f, 1.61f, -4.4f, 3.414f)
                reflectiveCurveToRelative(1.903f, 3.414f, 4.4f, 3.414f)
                curveToRelative(0.241f, 0.0f, 0.48f, -0.016f, 0.714f, -0.046f)
                curveToRelative(0.08f, -0.01f, 0.188f, -0.025f, 0.32f, -0.046f)
                close()
            }
        }
        .build()
        return _wechatLine!!
    }

private var _wechatLine: ImageVector? = null
