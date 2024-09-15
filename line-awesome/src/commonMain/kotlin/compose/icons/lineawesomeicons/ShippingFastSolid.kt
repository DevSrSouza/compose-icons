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
                lineTo(12.844f, 23.0f)
                curveTo(12.398f, 21.281f, 10.852f, 20.0f, 9.0f, 20.0f)
                curveTo(7.148f, 20.0f, 5.602f, 21.281f, 5.156f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 18.0f)
                lineTo(2.0f, 18.0f)
                lineTo(2.0f, 25.0f)
                lineTo(5.156f, 25.0f)
                curveTo(5.602f, 26.719f, 7.148f, 28.0f, 9.0f, 28.0f)
                curveTo(10.852f, 28.0f, 12.398f, 26.719f, 12.844f, 25.0f)
                lineTo(21.156f, 25.0f)
                curveTo(21.602f, 26.719f, 23.148f, 28.0f, 25.0f, 28.0f)
                curveTo(26.852f, 28.0f, 28.398f, 26.719f, 28.844f, 25.0f)
                lineTo(32.0f, 25.0f)
                lineTo(32.0f, 16.844f)
                lineTo(31.938f, 16.688f)
                lineTo(29.938f, 10.688f)
                lineTo(29.719f, 10.0f)
                lineTo(21.0f, 10.0f)
                lineTo(21.0f, 6.0f)
                close()
                moveTo(1.0f, 10.0f)
                lineTo(1.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(28.281f, 12.0f)
                lineTo(30.0f, 17.125f)
                lineTo(30.0f, 23.0f)
                lineTo(28.844f, 23.0f)
                curveTo(28.398f, 21.281f, 26.852f, 20.0f, 25.0f, 20.0f)
                curveTo(23.148f, 20.0f, 21.602f, 21.281f, 21.156f, 23.0f)
                lineTo(21.0f, 23.0f)
                close()
                moveTo(2.0f, 14.0f)
                lineTo(2.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 14.0f)
                close()
                moveTo(9.0f, 22.0f)
                curveTo(10.117f, 22.0f, 11.0f, 22.883f, 11.0f, 24.0f)
                curveTo(11.0f, 25.117f, 10.117f, 26.0f, 9.0f, 26.0f)
                curveTo(7.883f, 26.0f, 7.0f, 25.117f, 7.0f, 24.0f)
                curveTo(7.0f, 22.883f, 7.883f, 22.0f, 9.0f, 22.0f)
                close()
                moveTo(25.0f, 22.0f)
                curveTo(26.117f, 22.0f, 27.0f, 22.883f, 27.0f, 24.0f)
                curveTo(27.0f, 25.117f, 26.117f, 26.0f, 25.0f, 26.0f)
                curveTo(23.883f, 26.0f, 23.0f, 25.117f, 23.0f, 24.0f)
                curveTo(23.0f, 22.883f, 23.883f, 22.0f, 25.0f, 22.0f)
                close()
            }
        }
        .build()
        return _shippingFastSolid!!
    }

private var _shippingFastSolid: ImageVector? = null
