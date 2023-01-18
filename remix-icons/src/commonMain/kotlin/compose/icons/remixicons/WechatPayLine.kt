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

public val RemixIcons.WechatPayLine: ImageVector
    get() {
        if (_wechatPayLine != null) {
            return _wechatPayLine!!
        }
        _wechatPayLine = Builder(name = "WechatPayLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.145f, 8.993f)
                lineToRelative(-9.799f, 5.608f)
                lineToRelative(-0.07f, 0.046f)
                arcToRelative(0.646f, 0.646f, 0.0f, false, true, -0.3f, 0.068f)
                arcToRelative(0.655f, 0.655f, 0.0f, false, true, -0.58f, -0.344f)
                lineToRelative(-0.046f, -0.092f)
                lineToRelative(-1.83f, -3.95f)
                curveToRelative(-0.024f, -0.046f, -0.024f, -0.092f, -0.024f, -0.138f)
                curveToRelative(0.0f, -0.184f, 0.139f, -0.321f, 0.324f, -0.321f)
                curveToRelative(0.07f, 0.0f, 0.14f, 0.023f, 0.209f, 0.069f)
                lineToRelative(2.155f, 1.515f)
                curveToRelative(0.162f, 0.092f, 0.348f, 0.161f, 0.556f, 0.161f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, false, 0.348f, -0.069f)
                lineToRelative(8.275f, -3.648f)
                curveTo(16.934f, 6.273f, 14.634f, 5.2f, 12.0f, 5.2f)
                curveToRelative(-4.42f, 0.0f, -7.9f, 3.022f, -7.9f, 6.6f)
                curveToRelative(0.0f, 1.366f, 0.5f, 2.673f, 1.432f, 3.781f)
                curveToRelative(0.048f, 0.057f, 0.12f, 0.137f, 0.214f, 0.235f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.101f, 3.102f)
                lineToRelative(-0.025f, 0.297f)
                lineToRelative(0.716f, -0.436f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.705f, -0.536f)
                curveToRelative(0.212f, 0.033f, 0.386f, 0.059f, 0.52f, 0.076f)
                curveToRelative(0.406f, 0.054f, 0.82f, 0.081f, 1.237f, 0.081f)
                curveToRelative(4.42f, 0.0f, 7.9f, -3.022f, 7.9f, -6.6f)
                curveToRelative(0.0f, -0.996f, -0.27f, -1.95f, -0.755f, -2.807f)
                close()
                moveTo(6.192f, 21.943f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.526f, -0.932f)
                lineToRelative(0.188f, -2.259f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -0.55f, -1.551f)
                arcTo(6.993f, 6.993f, 0.0f, false, true, 4.0f, 16.868f)
                curveTo(2.806f, 15.447f, 2.1f, 13.695f, 2.1f, 11.8f)
                curveToRelative(0.0f, -4.75f, 4.432f, -8.6f, 9.9f, -8.6f)
                reflectiveCurveToRelative(9.9f, 3.85f, 9.9f, 8.6f)
                reflectiveCurveToRelative(-4.432f, 8.6f, -9.9f, 8.6f)
                curveToRelative(-0.51f, 0.0f, -1.01f, -0.033f, -1.499f, -0.098f)
                arcToRelative(23.61f, 23.61f, 0.0f, false, true, -0.569f, -0.084f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.353f, 0.268f)
                lineToRelative(-2.387f, 1.456f)
                close()
            }
        }
        .build()
        return _wechatPayLine!!
    }

private var _wechatPayLine: ImageVector? = null
