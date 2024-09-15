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

public val LineAwesomeIcons.TruckPickupSolid: ImageVector
    get() {
        if (_truckPickupSolid != null) {
            return _truckPickupSolid!!
        }
        _truckPickupSolid = Builder(name = "TruckPickupSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.719f, 6.0f)
                curveTo(9.863f, 6.0f, 9.082f, 6.559f, 8.813f, 7.375f)
                lineTo(7.281f, 12.0f)
                lineTo(0.0f, 12.0f)
                lineTo(0.0f, 20.219f)
                curveTo(0.0f, 21.133f, 0.613f, 21.934f, 1.5f, 22.156f)
                lineTo(4.094f, 22.813f)
                curveTo(4.469f, 24.629f, 6.078f, 26.0f, 8.0f, 26.0f)
                curveTo(9.852f, 26.0f, 11.398f, 24.719f, 11.844f, 23.0f)
                lineTo(21.156f, 23.0f)
                curveTo(21.602f, 24.719f, 23.148f, 26.0f, 25.0f, 26.0f)
                curveTo(26.852f, 26.0f, 28.398f, 24.719f, 28.844f, 23.0f)
                lineTo(30.0f, 23.0f)
                curveTo(31.094f, 23.0f, 32.0f, 22.094f, 32.0f, 21.0f)
                lineTo(32.0f, 17.25f)
                curveTo(32.0f, 15.469f, 30.809f, 13.895f, 29.094f, 13.406f)
                lineTo(24.563f, 12.125f)
                lineTo(20.656f, 7.438f)
                curveTo(19.895f, 6.527f, 18.781f, 6.0f, 17.594f, 6.0f)
                close()
                moveTo(10.719f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 12.0f)
                lineTo(9.375f, 12.0f)
                close()
                moveTo(16.0f, 8.0f)
                lineTo(17.594f, 8.0f)
                curveTo(18.188f, 8.0f, 18.746f, 8.262f, 19.125f, 8.719f)
                lineTo(21.875f, 12.0f)
                lineTo(16.0f, 12.0f)
                close()
                moveTo(2.0f, 14.0f)
                lineTo(23.844f, 14.0f)
                lineTo(28.563f, 15.344f)
                curveTo(29.426f, 15.59f, 30.0f, 16.352f, 30.0f, 17.25f)
                lineTo(30.0f, 21.0f)
                lineTo(28.844f, 21.0f)
                curveTo(28.398f, 19.281f, 26.852f, 18.0f, 25.0f, 18.0f)
                curveTo(23.148f, 18.0f, 21.602f, 19.281f, 21.156f, 21.0f)
                lineTo(11.844f, 21.0f)
                curveTo(11.398f, 19.281f, 9.852f, 18.0f, 8.0f, 18.0f)
                curveTo(6.227f, 18.0f, 4.738f, 19.172f, 4.219f, 20.781f)
                lineTo(2.0f, 20.219f)
                close()
                moveTo(8.0f, 20.0f)
                curveTo(9.117f, 20.0f, 10.0f, 20.883f, 10.0f, 22.0f)
                curveTo(10.0f, 23.117f, 9.117f, 24.0f, 8.0f, 24.0f)
                curveTo(6.883f, 24.0f, 6.0f, 23.117f, 6.0f, 22.0f)
                curveTo(6.0f, 20.883f, 6.883f, 20.0f, 8.0f, 20.0f)
                close()
                moveTo(25.0f, 20.0f)
                curveTo(26.117f, 20.0f, 27.0f, 20.883f, 27.0f, 22.0f)
                curveTo(27.0f, 23.117f, 26.117f, 24.0f, 25.0f, 24.0f)
                curveTo(23.883f, 24.0f, 23.0f, 23.117f, 23.0f, 22.0f)
                curveTo(23.0f, 20.883f, 23.883f, 20.0f, 25.0f, 20.0f)
                close()
            }
        }
        .build()
        return _truckPickupSolid!!
    }

private var _truckPickupSolid: ImageVector? = null
