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

public val SimpleIcons.Aparat: ImageVector
    get() {
        if (_aparat != null) {
            return _aparat!!
        }
        _aparat = Builder(name = "Aparat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0014f, 1.5938f)
                curveTo(2.7317f, 1.5906f, -1.9119f, 12.7965f, 4.641f, 19.3515f)
                curveToRelative(2.975f, 2.976f, 7.4496f, 3.8669f, 11.3374f, 2.257f)
                curveToRelative(3.8877f, -1.61f, 6.4228f, -5.4036f, 6.4228f, -9.6116f)
                curveToRelative(0.0f, -5.7441f, -4.6555f, -10.4012f, -10.3997f, -10.4031f)
                close()
                moveTo(6.11f, 6.783f)
                curveToRelative(0.5011f, -2.5982f, 3.8927f, -3.2936f, 5.376f, -1.1028f)
                curveToRelative(1.4834f, 2.1907f, -0.4216f, 5.0816f, -3.02f, 4.5822f)
                curveToRelative(-1.6118f, -0.3098f, -2.6668f, -1.868f, -2.356f, -3.4794f)
                close()
                moveTo(10.432f, 15.7712f)
                curveToRelative(-0.5045f, 2.5971f, -3.8965f, 3.288f, -5.377f, 1.0959f)
                curveToRelative(-1.4807f, -2.1922f, 0.427f, -5.0807f, 3.0247f, -4.5789f)
                curveToRelative(1.612f, 0.3114f, 2.6655f, 1.8714f, 2.3524f, 3.483f)
                close()
                moveTo(11.6925f, 13.3662f)
                curveToRelative(-1.1528f, -0.2231f, -1.4625f, -1.7273f, -0.4917f, -2.3877f)
                curveToRelative(0.9708f, -0.6604f, 2.256f, 0.18f, 2.0401f, 1.3343f)
                curveToRelative(-0.1347f, 0.7198f, -0.8294f, 1.1924f, -1.5484f, 1.0533f)
                close()
                moveTo(17.8895f, 17.2037f)
                curveToRelative(-0.501f, 2.5981f, -3.8927f, 3.2935f, -5.376f, 1.1028f)
                curveToRelative(-1.4834f, -2.1908f, 0.4217f, -5.0817f, 3.0201f, -4.5822f)
                curveToRelative(1.6117f, 0.3097f, 2.6667f, 1.8679f, 2.356f, 3.4794f)
                close()
                moveTo(15.9233f, 11.7019f)
                curveToRelative(-2.5981f, -0.501f, -3.2935f, -3.8962f, -1.1027f, -5.3795f)
                curveToRelative(2.1907f, -1.4834f, 5.0816f, 0.4216f, 4.5822f, 3.02f)
                curveToRelative(-0.3082f, 1.6132f, -1.8668f, 2.6701f, -3.4795f, 2.3595f)
                close()
                moveTo(13.5885f, 23.2637f)
                lineToRelative(2.2646f, 0.611f)
                curveToRelative(1.9827f, 0.5263f, 4.0167f, -0.6542f, 4.5433f, -2.6368f)
                lineToRelative(0.639f, -2.4016f)
                arcToRelative(11.3828f, 11.3828f, 0.0f, false, true, -7.4469f, 4.4274f)
                close()
                moveTo(21.232f, 3.5985f)
                lineToRelative(-2.363f, -0.6284f)
                arcToRelative(11.3757f, 11.3757f, 0.0f, false, true, 4.3538f, 7.619f)
                lineToRelative(0.6495f, -2.4578f)
                curveToRelative(0.5194f, -1.9804f, -0.6615f, -4.0076f, -2.6403f, -4.5328f)
                close()
                moveTo(0.6713f, 13.8086f)
                lineToRelative(-0.5407f, 2.04f)
                curveToRelative(-0.5263f, 1.9826f, 0.6542f, 4.0166f, 2.6368f, 4.5432f)
                lineToRelative(2.1066f, 0.5618f)
                arcToRelative(11.3792f, 11.3792f, 0.0f, false, true, -4.2027f, -7.145f)
                close()
                moveTo(10.3583f, 0.702f)
                lineTo(8.1498f, 0.1261f)
                curveTo(6.166f, -0.4024f, 4.1296f, 0.7785f, 3.603f, 2.763f)
                lineToRelative(-0.5512f, 2.082f)
                arcTo(11.3757f, 11.3757f, 0.0f, false, true, 10.3583f, 0.702f)
                close()
            }
        }
        .build()
        return _aparat!!
    }

private var _aparat: ImageVector? = null
