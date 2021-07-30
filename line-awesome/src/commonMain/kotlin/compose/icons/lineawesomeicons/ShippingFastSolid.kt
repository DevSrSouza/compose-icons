package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ShippingFastSolid: ImageVector
    get() {
        if (_shippingFastSolid != null) {
            return _shippingFastSolid!!
        }
        _shippingFastSolid = Builder(name = "ShippingFastSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 6.0f)
                lineTo(0.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 23.0f)
                lineTo(12.8438f, 23.0f)
                curveTo(12.3984f, 21.2813f, 10.8516f, 20.0f, 9.0f, 20.0f)
                curveTo(7.1484f, 20.0f, 5.6016f, 21.2813f, 5.1563f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 25.0f)
                lineTo(5.1563f, 25.0f)
                curveTo(5.6016f, 26.7188f, 7.1484f, 28.0f, 9.0f, 28.0f)
                curveTo(10.8516f, 28.0f, 12.3984f, 26.7188f, 12.8438f, 25.0f)
                lineTo(21.1563f, 25.0f)
                curveTo(21.6016f, 26.7188f, 23.1484f, 28.0f, 25.0f, 28.0f)
                curveTo(26.8516f, 28.0f, 28.3984f, 26.7188f, 28.8438f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 16.8438f)
                lineTo(31.9375f, 16.6875f)
                lineTo(29.9375f, 10.6875f)
                lineTo(29.7188f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(1.0f, 10.0f)
                lineTo(1.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(28.2813f, 12.0f)
                lineTo(30.0f, 17.125f)
                lineTo(30.0f, 23.0f)
                lineTo(28.8438f, 23.0f)
                curveTo(28.3984f, 21.2813f, 26.8516f, 20.0f, 25.0f, 20.0f)
                curveTo(23.1484f, 20.0f, 21.6016f, 21.2813f, 21.1563f, 23.0f)
                lineTo(21.0f, 23.0f)
                close()
                moveTo(2.0f, 14.0f)
                lineTo(2.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(9.0f, 22.0f)
                curveTo(10.1172f, 22.0f, 11.0f, 22.8828f, 11.0f, 24.0f)
                curveTo(11.0f, 25.1172f, 10.1172f, 26.0f, 9.0f, 26.0f)
                curveTo(7.8828f, 26.0f, 7.0f, 25.1172f, 7.0f, 24.0f)
                curveTo(7.0f, 22.8828f, 7.8828f, 22.0f, 9.0f, 22.0f)
                close()
                moveTo(25.0f, 22.0f)
                curveTo(26.1172f, 22.0f, 27.0f, 22.8828f, 27.0f, 24.0f)
                curveTo(27.0f, 25.1172f, 26.1172f, 26.0f, 25.0f, 26.0f)
                curveTo(23.8828f, 26.0f, 23.0f, 25.1172f, 23.0f, 24.0f)
                curveTo(23.0f, 22.8828f, 23.8828f, 22.0f, 25.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shippingFastSolid!!
    }

private var _shippingFastSolid: ImageVector? = null
