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

public val SimpleIcons.Mobxstatetree: ImageVector
    get() {
        if (_mobxstatetree != null) {
            return _mobxstatetree!!
        }
        _mobxstatetree = Builder(name = "Mobxstatetree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4359f, 0.5918f)
                curveToRelative(-0.5327f, 0.0013f, -1.073f, 0.2715f, -1.432f, 0.8068f)
                lineTo(0.3056f, 17.5528f)
                curveToRelative(-0.9402f, 1.9806f, 0.4223f, 3.8737f, 2.2691f, 4.4105f)
                curveToRelative(3.469f, 0.7726f, 6.646f, -1.2927f, 6.646f, -1.2927f)
                curveToRelative(4.68f, -2.9945f, 7.7024f, -4.6851f, 7.7024f, -4.6851f)
                curveToRelative(3.7297f, -1.8907f, 6.9926f, 0.4293f, 6.9995f, 0.4342f)
                lineTo(13.8248f, 1.3986f)
                curveToRelative(-0.3309f, -0.54f, -0.8563f, -0.808f, -1.389f, -0.8068f)
                close()
                moveTo(12.4402f, 2.2517f)
                curveToRelative(0.4191f, -0.0013f, 0.8326f, 0.2102f, 1.093f, 0.635f)
                curveToRelative(2.4662f, 3.6608f, 5.2689f, 7.4349f, 7.6288f, 11.1616f)
                curveToRelative(0.0f, 0.0f, -2.252f, -1.1721f, -5.19f, 0.3173f)
                curveToRelative(0.0f, 0.0f, -2.3795f, 1.3306f, -6.0622f, 3.687f)
                curveToRelative(0.0f, 0.0f, -2.4992f, 1.6244f, -5.229f, 1.0164f)
                curveToRelative(-1.4534f, -0.4224f, -2.5263f, -1.9125f, -1.7865f, -3.4711f)
                lineToRelative(8.4195f, -12.7111f)
                curveToRelative(0.2825f, -0.4212f, 0.7072f, -0.6342f, 1.1264f, -0.6351f)
                close()
                moveTo(20.86f, 16.4169f)
                curveToRelative(-4.0347f, 0.0998f, -7.5355f, 3.8695f, -10.387f, 4.9836f)
                curveToRelative(4.3352f, 5.2103f, 17.3143f, -0.9708f, 12.454f, -4.4241f)
                curveToRelative(-0.6166f, -0.4203f, -1.315f, -0.578f, -2.067f, -0.5595f)
                close()
                moveTo(20.8353f, 17.4328f)
                curveToRelative(0.5446f, 0.003f, 1.04f, 0.1454f, 1.4567f, 0.4783f)
                curveToRelative(2.288f, 2.2856f, -6.3047f, 6.2616f, -9.9585f, 3.647f)
                curveToRelative(1.1813f, -0.0912f, 5.5606f, -4.1413f, 8.5018f, -4.1253f)
                close()
            }
        }
        .build()
        return _mobxstatetree!!
    }

private var _mobxstatetree: ImageVector? = null
