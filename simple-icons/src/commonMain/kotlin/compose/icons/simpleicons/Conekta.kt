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

public val SimpleIcons.Conekta: ImageVector
    get() {
        if (_conekta != null) {
            return _conekta!!
        }
        _conekta = Builder(name = "Conekta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.2914f, 17.8831f)
                arcToRelative(11.7327f, 11.7327f, 0.0f, false, true, -6.1742f, 3.0338f)
                arcToRelative(2.4598f, 2.4598f, 0.0f, false, true, -2.1647f, -0.7461f)
                curveToRelative(-4.2466f, -4.6258f, -4.2466f, -11.7322f, 0.0f, -16.358f)
                arcToRelative(2.4599f, 2.4599f, 0.0f, false, true, 2.1729f, -0.7461f)
                arcToRelative(11.668f, 11.668f, 0.0f, false, true, 6.289f, 3.1404f)
                arcToRelative(27.1655f, 27.1655f, 0.0f, false, false, -0.6969f, 6.1004f)
                arcToRelative(27.7762f, 27.7762f, 0.0f, false, false, 0.5739f, 5.5756f)
                close()
                moveTo(22.1876f, 13.9455f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, -1.5244f, 0.5266f)
                arcToRelative(24.6804f, 24.6804f, 0.0f, false, true, -11.9139f, 8.9375f)
                arcToRelative(35.4417f, 35.4417f, 0.0f, false, false, 6.4284f, 0.5903f)
                arcToRelative(36.2857f, 36.2857f, 0.0f, false, false, 4.4605f, -0.2788f)
                arcToRelative(3.5997f, 3.5997f, 0.0f, false, false, 3.0338f, -2.6977f)
                curveToRelative(0.4692f, -1.884f, 0.6453f, -3.8838f, 0.5166f, -5.8134f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, -1.001f, -1.2645f)
                close()
                moveTo(20.6631f, 9.6099f)
                arcToRelative(1.394f, 1.394f, 0.0f, false, false, 2.5255f, -0.7462f)
                curveToRelative(0.1354f, -1.9699f, -0.0438f, -3.9689f, -0.5166f, -5.8872f)
                arcTo(3.5997f, 3.5997f, 0.0f, false, false, 19.6382f, 0.2789f)
                arcTo(36.2678f, 36.2678f, 0.0f, false, false, 15.1776f, 0.0f)
                arcToRelative(35.4337f, 35.4337f, 0.0f, false, false, -6.4284f, 0.5904f)
                arcToRelative(24.6396f, 24.6396f, 0.0f, false, true, 11.9139f, 9.0195f)
                close()
            }
        }
        .build()
        return _conekta!!
    }

private var _conekta: ImageVector? = null
