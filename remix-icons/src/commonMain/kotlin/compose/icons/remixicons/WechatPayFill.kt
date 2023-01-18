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

public val RemixIcons.WechatPayFill: ImageVector
    get() {
        if (_wechatPayFill != null) {
            return _wechatPayFill!!
        }
        _wechatPayFill = Builder(name = "WechatPayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.27f, 14.669f)
                arcToRelative(0.662f, 0.662f, 0.0f, false, true, -0.88f, -0.269f)
                lineToRelative(-0.043f, -0.095f)
                lineToRelative(-1.818f, -3.998f)
                arcToRelative(0.473f, 0.473f, 0.0f, false, true, 0.0f, -0.145f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, true, 0.335f, -0.328f)
                arcToRelative(0.305f, 0.305f, 0.0f, false, true, 0.196f, 0.066f)
                lineToRelative(2.18f, 1.527f)
                arcToRelative(0.989f, 0.989f, 0.0f, false, false, 0.546f, 0.167f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, false, 0.342f, -0.066f)
                lineToRelative(10.047f, -4.5f)
                arcToRelative(10.73f, 10.73f, 0.0f, false, false, -8.171f, -3.526f)
                curveTo(6.478f, 3.502f, 2.0f, 7.232f, 2.0f, 11.87f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 3.46f, 6.296f)
                arcToRelative(0.662f, 0.662f, 0.0f, false, true, 0.24f, 0.727f)
                lineToRelative(-0.45f, 1.701f)
                arcToRelative(0.945f, 0.945f, 0.0f, false, false, -0.051f, 0.24f)
                arcToRelative(0.327f, 0.327f, 0.0f, false, false, 0.334f, 0.334f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, false, 0.19f, -0.058f)
                lineToRelative(2.18f, -1.265f)
                curveToRelative(0.16f, -0.098f, 0.343f, -0.151f, 0.531f, -0.152f)
                curveToRelative(0.099f, 0.0f, 0.197f, 0.014f, 0.29f, 0.043f)
                curveToRelative(1.063f, 0.3f, 2.161f, 0.452f, 3.265f, 0.45f)
                curveToRelative(5.525f, 0.0f, 10.01f, -3.729f, 10.01f, -8.33f)
                arcToRelative(7.226f, 7.226f, 0.0f, false, false, -1.097f, -3.883f)
                lineTo(9.35f, 14.625f)
                lineToRelative(-0.08f, 0.044f)
                close()
            }
        }
        .build()
        return _wechatPayFill!!
    }

private var _wechatPayFill: ImageVector? = null
